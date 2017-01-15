package sodanoobs.greenfoot;

import android.content.Context;
import android.location.LocationListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.widget.TextView;

import static sodanoobs.greenfoot.R.id.startTitle;

public class StartScreen extends AppCompatActivity {
    Location lastloc;
    float distance_travelled;
    LocationManager lm;
    LocationListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);


        lm = (LocationManager)getSystemService(Context.LOCATION_SERVICE);
        listener  = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                if (lastloc == null){
                    lastloc = location;
                    return;

                }
                else{

                    startActivity(new Intent(StartScreen.this, TransitScreen.class).putExtra("lastloc", lastloc ));

                    distance_travelled += lastloc.distanceTo(location);
                    TextView tt = (TextView) findViewById(R.id.startTitle);
                    tt.setText(Float.toString(distance_travelled));
                    lastloc = location;
                }
                //TODO -- Barney says what should happen
                // when the framework invokes onLocationChanged
            }
            @Override
            public void onProviderDisabled(String z) {
                return;
            }
            @Override
            public void onProviderEnabled(String z) {
                return;
            }
            @Override
            public void onStatusChanged(String z, int a, Bundle c) {
                return;
            }
        };
        lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, (long)10000, (float)0, listener);
    }
    @Override
    protected void onPause() {
        super.onPause();
        lm.removeUpdates(listener);
    }

    public void temporaryTransition (View v){
        startActivity(new Intent(StartScreen.this, TransitScreen.class));
    }
}

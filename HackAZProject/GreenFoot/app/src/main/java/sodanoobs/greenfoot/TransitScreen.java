package sodanoobs.greenfoot;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class TransitScreen extends AppCompatActivity {

    Location lastloc;
    float distance_travelled;
    LocationManager lm;
    LocationListener listener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transit_screen);
        lastloc = (Location) getIntent().getExtras().getParcelable("lastloc");

        lm = (LocationManager)getSystemService(Context.LOCATION_SERVICE);
        listener  = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                distance_travelled += lastloc.distanceTo(location);
                TextView tt = (TextView) findViewById(R.id.currentDistance);
                tt.setText(Float.toString(distance_travelled));
                lastloc = location;

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

    public void toTravelScreen (View v){
        startActivity(new Intent(TransitScreen.this, TravelTypeHomeScreen.class));
    }
}

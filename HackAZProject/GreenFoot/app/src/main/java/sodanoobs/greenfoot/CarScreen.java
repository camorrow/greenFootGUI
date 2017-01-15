package sodanoobs.greenfoot;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CarScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_screen);

    }



    public void smallCarToPoints(View v){
        startActivity(new Intent(CarScreen.this, PointsScreen.class));
    }
    public void averageCarToPoints(View v){
        startActivity(new Intent(CarScreen.this, PointsScreen.class));
    }
    public void largeCarToPoints(View v) {
        startActivity(new Intent(CarScreen.this, PointsScreen.class));
    }
}

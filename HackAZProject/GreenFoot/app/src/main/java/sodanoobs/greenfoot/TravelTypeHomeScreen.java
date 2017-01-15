package sodanoobs.greenfoot;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class TravelTypeHomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_type_home_screen);
    }



    public void walkToPointsScreen (View v){
        Intent intent = new Intent(TravelTypeHomeScreen.this, PointsScreen.class).putExtra("travelConstant", 0);
        startActivity(intent);
    }

    public void busToPointsScreen(View v){
        Intent intent = new Intent(TravelTypeHomeScreen.this, PointsScreen.class).putExtra("travelConstant", 40);
        startActivity(intent);
    }

    public void motorcycleToPointsScreen(View v){
        Intent intent = new Intent(TravelTypeHomeScreen.this, PointsScreen.class).putExtra("travelConstant", 145);
        startActivity(intent);
    }

    public void toCarScreen (View v){
        startActivity(new Intent(TravelTypeHomeScreen.this, CarScreen.class));
    }
}

/*
car- small: 175
    medium: 215
    large: 300
    electric: 80
motorcycle: 145
walk: 0
bus: 40
 */
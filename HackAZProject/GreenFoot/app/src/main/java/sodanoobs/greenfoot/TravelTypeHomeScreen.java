package sodanoobs.greenfoot;

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

    public void toPointsScreen (View v){
        startActivity(new Intent(TravelTypeHomeScreen.this, PointsScreen.class));
    }

    public void toCarScreen (View v){
        startActivity(new Intent(TravelTypeHomeScreen.this, CarScreen.class));
    }
}

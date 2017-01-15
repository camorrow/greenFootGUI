package sodanoobs.greenfoot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

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

package sodanoobs.greenfoot;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.webkit.WebView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PointsScreen extends AppCompatActivity {
    int travelConstant = 0;
    int passengers = 0;
    float distance = 100; //DUMMY VARIABLE PLEASE REPLACE
    int points = 0;

    public int pointCalculation(int constant, int numPassengers, float distanceTraveled){
        int equation;
        equation = (int)Math.round(.001 * (300 - constant/numPassengers) * distanceTraveled);

        return equation;
    }

    public int pointCalculation(int constant, float distanceTraveled){
        int equation;
        equation = (int)Math.round(.001 * (300 - constant) * distanceTraveled);

        return equation;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_points_screen);

        travelConstant = getIntent().getIntExtra("travelConstant", 0);
        passengers = getIntent().getIntExtra("passengers", -1);

        SharedPreferences prefs= PreferenceManager.getDefaultSharedPreferences(this);
        distance =  prefs.getFloat("distance", 0.0f);
//        TextView tt = (TextView) findViewById(R.id.congratulationsText);
//        tt.setText(Float.toString(distance));
        if(passengers == -1)
            points = pointCalculation(travelConstant, distance);
        else
            points = pointCalculation(travelConstant, passengers, distance);

        TextView pointsText = (TextView) findViewById(R.id.pointsText);
        pointsText.setText(Integer.toString(points) + " points");
    }

    public void returnToStart(View v){
        startActivity(new Intent(PointsScreen.this, StartScreen.class));
    }
}

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
import android.widget.CheckBox;
import android.widget.EditText;

public class CarScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_screen);

    }



    public void smallCarToPoints(View v){
        CheckBox electricBox = (CheckBox)findViewById(R.id.electricBox);
        EditText passengerField = (EditText) findViewById(R.id.passengersField);
        Intent intent = new Intent(CarScreen.this, PointsScreen.class);
        int passengers = 0;
        try{
            passengers = Integer.parseInt(passengerField.getText().toString());
        } catch(Exception e){
            TextView errorMessage = (TextView) findViewById(R.id.errorText);
            errorMessage.setText("Remember to enter the number of other passengers! If you traveled alone, type '0'");
            return;
        }


        if(electricBox.isChecked())
            intent.putExtra("travelConstant", 80);
        else
            intent.putExtra("travelConstant", 175);

        intent.putExtra("passengers", passengers);
        startActivity(intent);
    }
    public void averageCarToPoints(View v){
        CheckBox electricBox = (CheckBox)findViewById(R.id.electricBox);
        EditText passengerField = (EditText) findViewById(R.id.passengersField);
        Intent intent = new Intent(CarScreen.this, PointsScreen.class);
        int passengers = 0;

        try{
            passengers = Integer.parseInt(passengerField.getText().toString());
        } catch(Exception e){
            TextView errorMessage = (TextView) findViewById(R.id.errorText);
            errorMessage.setText("Remember to enter the number of other passengers! If you traveled alone, type '0'");
            return;
        }

        if(electricBox.isChecked())
            intent.putExtra("travelConstant", 80);
        else
            intent.putExtra("travelConstant", 215);

        intent.putExtra("passengers", passengers);
        startActivity(intent);
    }
    public void largeCarToPoints(View v) {
        CheckBox electricBox = (CheckBox)findViewById(R.id.electricBox);
        EditText passengerField = (EditText) findViewById(R.id.passengersField);
        Intent intent = new Intent(CarScreen.this, PointsScreen.class);
        int passengers = 0;
        try{
            passengers = Integer.parseInt(passengerField.getText().toString());
        } catch(Exception e){
            TextView errorMessage = (TextView) findViewById(R.id.errorText);
            errorMessage.setText("Remember to enter the number of other passengers! If you traveled alone, type '0'");
            return;
        }

        if(electricBox.isChecked())
            intent.putExtra("travelConstant", 80);
        else
            intent.putExtra("travelConstant", 300);

        intent.putExtra("passengers", passengers);
        startActivity(intent);
    }
}

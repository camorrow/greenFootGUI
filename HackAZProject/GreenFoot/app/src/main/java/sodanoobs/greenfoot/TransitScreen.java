package sodanoobs.greenfoot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class TransitScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transit_screen);
    }

    public void toTravelScreen (View v){
        startActivity(new Intent(TransitScreen.this, TravelTypeHomeScreen.class));
    }
}

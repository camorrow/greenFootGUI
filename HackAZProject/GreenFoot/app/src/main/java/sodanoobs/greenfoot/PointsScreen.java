package sodanoobs.greenfoot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class PointsScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_points_screen);
    }

    public void returnToStart(View v){
        startActivity(new Intent(PointsScreen.this, StartScreen.class));
    }
}

package in.ac.dtu.hellonavigation;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import in.ac.dtu.hellonavigation.tools.Config;

public class StartChooser extends AppCompatActivity {

    private boolean playServicesAvaliable = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Remove title bar
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.startchoose);

        Config.startTime = System.currentTimeMillis();

        playServicesAvaliable = false;

        Handler waitingTimer = new Handler();
        waitingTimer.postDelayed(new Runnable() {
            @Override
            public void run() {
                startMap();
            }
        }, 1000);
    }


    private void startMap() {
        if (playServicesAvaliable) {
            SharedPreferences settings = getSharedPreferences(getPackageName() + "_preferences", MODE_PRIVATE);
            if (settings.getString("MapSource", "GoogleMaps").equalsIgnoreCase("GoogleMaps")) {
                startActivity(new Intent(StartChooser.this, GoogleMapActivity.class));
            } else {
                startActivity(new Intent(StartChooser.this, OsmMapActivity.class));
            }
        } else {
            startActivity(new Intent(StartChooser.this, OsmMapActivity.class));
        }
        finish();
    }

}

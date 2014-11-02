package com.witmergers.batmanwallpapers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

/**
 * Created by WP8Dev on 15-10-2014.
 */
public class SplashScreen extends Activity {


    private static int SPLASH_TIME_OUT = 5000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Handler to run Main activity
        setContentView(R.layout.activity_splashscreen);
        Toast.makeText(getApplicationContext(), "Loading...", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "More Loading...", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);


        Toast.makeText(getApplicationContext(), "Finished Splash Screen...", Toast.LENGTH_SHORT).show();
    }
}

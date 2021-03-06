package com.thecoredepository.tangent;

//This is the main class the launches with the program.
//From here you can access other activities.

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.support.annotation.RawRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.thecoredepository.tangent.musicplayer.MusicPlayer;

public class MainActivity extends AppCompatActivity
{
    public static MusicPlayer musicPlayer = new MusicPlayer();

    AnimationDrawable animSpaceship;
    AnimationDrawable animStarField;

    //=====================================================================
    //                               onCreate
    //=====================================================================

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        musicPlayer.setApplicationContext(getApplicationContext());
        TextView txtVersion = findViewById(R.id.txtVersion);
        txtVersion.setText("Version: " + BuildConfig.VERSION_NAME);

        //=================================================================
        //                           BUTTONS
        //=================================================================

        Button btnPlay = findViewById(R.id.btnPlay);
        Button btnMusicPlayer = findViewById(R.id.btnMusicPlayer);
        Button btnStore = findViewById(R.id.btnStore);
        Button btnCredits = findViewById(R.id.btnCredits);
        ImageButton btnSetting = findViewById(R.id.btnSettings);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Starts Game
                Intent in = new Intent(getApplicationContext(), NewContinueActivity.class);
                musicPlayer.stopPlaying();
                startActivity(in);
            }
        });

        btnMusicPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Open Credits
                Intent in = new Intent(getApplicationContext(), MusicPlayerActivity.class);
                musicPlayer.stopPlaying();
                startActivity(in);
            }
        });

        btnStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Open Store
                Intent in = new Intent(getApplicationContext(), StoreActivity.class);
                musicPlayer.stopPlaying();
                startActivity(in);
            }
        });

        btnCredits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Open Credits
                Intent in = new Intent(getApplicationContext(), CreditsActivity.class);
                musicPlayer.stopPlaying();
                startActivity(in);
            }
        });

        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Opens Settings Menu
                Toast.makeText(MainActivity.this, "Settings is Under Development", Toast.LENGTH_SHORT).show();
            }
        });

        //=================================================================
        //                         BUTTONS END
        //=================================================================

        Log.i("startAnimation", "starting");

            startAnimations();
            Log.i("startAnimation", "startAnimation Passed");
    }

    //=====================================================================
    //                            onCreate END
    //=====================================================================

    private void startAnimations()
    {
        //StarField Animation
        ImageView starfield = (ImageView) findViewById(R.id.imgStarField);
        try {
            starfield.setBackgroundResource(R.drawable.starfield);
            animStarField = (AnimationDrawable) starfield.getBackground();
            animStarField.start();
        } catch (Exception e) {
            Log.i("startAnimation", "startAnimation Failed - " + e);
        }
        //Starship Animation
        ImageView spaceship = (ImageView) findViewById(R.id.imgStarship);
        spaceship.setBackgroundResource(R.drawable.spaceship_animation);
        animSpaceship = (AnimationDrawable) spaceship.getBackground();
        animSpaceship.start();
    }



    //=====================================================================
    //                            FULLSCREEN
    //=====================================================================
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUI();
            musicPlayer.startPlaying(R.raw.cyoa01smallfinal, true, false);
            musicPlayer.startPlaying(R.raw.rocket_thrusters, true, true);
        }
        else
        {
            musicPlayer.stopPlaying();
        }
    }

    private void hideSystemUI() {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    // Shows the system bars by removing all the flags
    // except for the ones that make the content appear under the system bars.
    private void showSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }

    //=====================================================================
    //                          FULLSCREEN END
    //=====================================================================
}
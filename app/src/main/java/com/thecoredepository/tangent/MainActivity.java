package com.thecoredepository.tangent;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.support.annotation.RawRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    private MediaPlayer musicPlayer;
    private MediaPlayer soundPlayer;
    AnimationDrawable animSpaceship;

    //=====================================================================
    //                               onCreate
    //=====================================================================

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        startAnimations();


        //=================================================================
        //                           BUTTONS
        //=================================================================

        ImageButton btnPlay = findViewById(R.id.btnCredits);
        ImageButton btnCredits = findViewById(R.id.btnCredits);
        ImageButton btnSetting = findViewById(R.id.btnBack);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Starts Game
                Toast.makeText(MainActivity.this, "Play Under Development", Toast.LENGTH_SHORT).show();
            }
        });

        btnCredits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Open Credits
                Intent in = new Intent(getApplicationContext(), CreditsActivity.class);
                startActivity(in);
            }
        });

        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Opens Settings Menu
                Toast.makeText(MainActivity.this, "Settings Under Development", Toast.LENGTH_SHORT).show();
            }
        });

        //=================================================================
        //                         BUTTONS END
        //=================================================================
    }

    //=====================================================================
    //                            onCreate END
    //=====================================================================

    private void startAnimations()
    {
        //Starship Animation
        ImageView spaceship = (ImageView) findViewById(R.id.imgLogo);
        spaceship.setBackgroundResource(R.drawable.spaceship_animation);
        animSpaceship = (AnimationDrawable) spaceship.getBackground();
        animSpaceship.start();
    }

    //=====================================================================
    //                               MUSIC
    //=====================================================================

    private void stopPlaying()
    {
        if (soundPlayer != null)
        {
            soundPlayer.reset();
            soundPlayer.stop();
            soundPlayer.release();
            soundPlayer=null;
            musicPlayer.reset();
            musicPlayer.stop();
            musicPlayer.release();
            musicPlayer=null;
        }
    }

    private void startPlaying(@RawRes int sound, boolean loopingTrue, boolean soundTrue)
    {
        if (soundTrue == true)
        {
            Log.i("Player", "STOP");
            stopPlaying();
            soundPlayer = MediaPlayer.create(getApplicationContext(), sound);
            soundPlayer.start();
            soundPlayer.setLooping(loopingTrue);
            Log.i("Player", "START = " + sound);
        }
        else
        {
            Log.i("Player", "STOP");
            stopPlaying();
            musicPlayer = MediaPlayer.create(getApplicationContext(), sound);
            musicPlayer.start();
            musicPlayer.setLooping(loopingTrue);
            Log.i("Player", "START = " + sound);
        }

    }

    //=====================================================================
    //                            MUSIC END
    //=====================================================================

    //=====================================================================
    //                            FULLSCREEN
    //=====================================================================
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUI();
            startPlaying(R.raw.cyoa01smallfinal, true, false);
            startPlaying(R.raw.rocket_thrusters, true, true);
        }
        else
        {
            stopPlaying();
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
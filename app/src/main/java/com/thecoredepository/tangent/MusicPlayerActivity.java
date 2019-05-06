package com.thecoredepository.tangent;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Toast;

import com.thecoredepository.tangent.musicplayer.MusicPlayer;

public class MusicPlayerActivity extends AppCompatActivity
{
    MusicPlayer musicPlayer = new MusicPlayer();
    AnimationDrawable animSpaceship;
    AnimationDrawable animStarField;
    Boolean repeatAll = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musicplayer);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        musicPlayer.setApplicationContext(getApplicationContext());

        //=================================================================
        //                           BUTTONS
        //=================================================================

        Button btnBack = findViewById(R.id.musicBtn_Back);
        Button btnStop = findViewById(R.id.musicBtn_Stop);
        ImageButton btnRepeat = findViewById(R.id.musicBtn_Repeat);

        Button btnMainTheme = findViewById(R.id.musicBtn_MainTheme);
        Button btnTheCoreDespositoryTheme = findViewById(R.id.musicBtn_TCDT);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), MainActivity.class);
                musicPlayer.stopPlaying();
                startActivity(in);
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicPlayer.stopPlaying();
            }
        });

        btnMainTheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicPlayer.startPlaying(R.raw.cyoa01smallfinal, true, false);
            }
        });

        btnTheCoreDespositoryTheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicPlayer.startPlaying(R.raw.intro, true, false);
            }
        });

        btnRepeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MusicPlayerActivity.this, "Repeat All Under Development", Toast.LENGTH_SHORT).show();
            }
        });

        //=================================================================
        //                         BUTTONS END
        //=================================================================

        startAnimation();
    }

    private void startAnimation()
    {
        //StarField Animation
        ScrollView starfield = findViewById(R.id.musicScroll);
        starfield.setBackgroundResource(R.drawable.starfield);
        animStarField = (AnimationDrawable) starfield.getBackground();
        animStarField.start();
        //Starship Animation
        ImageView spaceship = (ImageView) findViewById(R.id.music_imgStarship);
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
        }
        else
        {

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

package com.thecoredepository.tangent;

import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.support.annotation.RawRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    private MediaPlayer musicPlayer;
    private MediaPlayer soundPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
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
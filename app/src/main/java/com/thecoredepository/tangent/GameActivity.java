package com.thecoredepository.tangent;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.thecoredepository.tangent.musicplayer.MusicPlayer;

public class GameActivity extends AppCompatActivity
{
    MusicPlayer musicPlayer = new MusicPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //=================================================================
        //                           BUTTONS
        //=================================================================

        ImageButton btnBack = findViewById(R.id.btn_inGame_Quit);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), MainActivity.class);
                musicPlayer.stopPlaying();
                startActivity(in);
            }
        });

        //=================================================================
        //                         BUTTONS END
        //=================================================================

    }

}

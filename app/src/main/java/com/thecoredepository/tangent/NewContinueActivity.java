package com.thecoredepository.tangent;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.thecoredepository.tangent.story.GenerateStory;

public class NewContinueActivity extends AppCompatActivity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_continue);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        TextView txtVersion = findViewById(R.id.txtVersion2);
        txtVersion.setText("Version: " + BuildConfig.VERSION_NAME);
        final TextView txtPlayerName = findViewById(R.id.txtPlayerName);

        //=================================================================
        //                           BUTTONS
        //=================================================================

        Button btnNew = findViewById(R.id.btnNew);

        btnNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Starts Game
                Intent in = new Intent(getApplicationContext(), GameActivity.class);
                GenerateStory.player.setPlayerName(txtPlayerName.getText()+"");
                startActivity(in);
            }
        });
    }
}

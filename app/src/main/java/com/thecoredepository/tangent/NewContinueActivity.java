package com.thecoredepository.tangent;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
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

        //If the save was loaded add the continue option
        boolean loadedSaveTrue = false;

        TextView txtVersion = findViewById(R.id.txtVersion2);
        txtVersion.setText("Version: " + BuildConfig.VERSION_NAME);
        TextView txtContinue = findViewById(R.id.txtContinue);
        final TextView txtPlayerName = findViewById(R.id.txtPlayerName);

        //=================================================================
        //                           BUTTONS
        //=================================================================

        Button btnNew = findViewById(R.id.btnNew);
        Button btnContinue =findViewById(R.id.btnContinue);

        if(loadedSaveTrue == false)
        {
            txtContinue.setVisibility(View.INVISIBLE);
            btnContinue.setVisibility(View.INVISIBLE);
            btnContinue.setEnabled(false);
        }
        else
        {
            txtContinue.setVisibility(View.VISIBLE);
            btnContinue.setVisibility(View.VISIBLE);
            btnContinue.setEnabled(true);
        }

        btnNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Starts Game
                String playerName = txtPlayerName.getText()+"";
                Intent in = new Intent(getApplicationContext(), GameActivity.class);
                if (!playerName.equals(""))
                {
                    GenerateStory.player.setPlayerName(txtPlayerName.getText()+"");
                }
                startActivity(in);
            }
        });
    }
}

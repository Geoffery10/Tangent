package com.thecoredepository.tangent;

//This class runs the game window.
//It loads the layout, animations, images, and sounds as well as generating the story.
//Button presses progress the story and update the elements.
//Upon adding new images or sound to the story the setBackground(), setForeground(), setMusic(),
//and setSound should be updated.

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Point;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.thecoredepository.tangent.musicplayer.MusicPlayer;
import com.thecoredepository.tangent.story.*;

public class GameActivity extends AppCompatActivity
{
    MusicPlayer musicPlayer = new MusicPlayer();
    AnimationDrawable animForeground;
    AnimationDrawable animBackground;

    Button btnContinue;
    Button btnOptionA;
    Button btnOptionB;

    //Story is generated
    GenerateStory story = new GenerateStory();
    StoryObject storyObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        musicPlayer.setApplicationContext(getApplicationContext());

        btnContinue = findViewById(R.id.btnContinue);
        btnOptionA = findViewById(R.id.btnOptionA);
        btnOptionB = findViewById(R.id.btnOptionB);

        //Load Story
        story.generateStory();
        storyObject = story.getStoryByID("0_1");

        //Load UI
        //startAnimations();
        loadUI(storyObject);

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

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key = storyObject.getLeftChild();
                storyObject = story.getStoryByID(key);
                loadUI(storyObject);
            }
        });

        btnOptionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key = storyObject.getLeftChild();
                storyObject = story.getStoryByID(key);
                loadUI(storyObject);
            }
        });

        btnOptionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key = storyObject.getRightChild();
                storyObject = story.getStoryByID(key);
                loadUI(storyObject);
            }
        });

        //=================================================================
        //                         BUTTONS END
        //=================================================================

    }


    public void loadUI(StoryObject storyObject)
    {
        setBackground();
        setForeground();
        setMusic();
        setSound();

        Log.i("Tree", "Loading UI");
        TextView name = findViewById(R.id.txtName);
        TextView body = findViewById(R.id.txtBody);
        btnContinue = findViewById(R.id.btnContinue);
        btnOptionA = findViewById(R.id.btnOptionA);
        btnOptionB = findViewById(R.id.btnOptionB);

        Log.i("Tree", "Assigning Values");
        name.setText(storyObject.getCharName());
        body.setText(storyObject.getSpeech());

        Log.i("Tree", "Continue True = " + storyObject.getContinueTrue());
        if (storyObject.getContinueTrue())
        {
            btnContinue.setEnabled(true);
            btnContinue.setVisibility(View.VISIBLE);
            btnOptionA.setEnabled(false);
            btnOptionA.setVisibility(View.INVISIBLE);
        }
        else
        {
            btnContinue.setEnabled(false);
            btnContinue.setVisibility(View.INVISIBLE);

            if (!storyObject.getOptionA().equals(""))
            {
                btnOptionA.setText(storyObject.getOptionA());
                btnOptionA.setEnabled(true);
                btnOptionA.setVisibility(View.VISIBLE);
            }
            else
            {
                Log.i("Tree", "OptionA was empty");
                btnOptionA.setEnabled(false);
                btnOptionA.setVisibility(View.INVISIBLE);
            }
        }

        if (!storyObject.getOptionB().equals(""))
        {
            btnOptionB.setText(storyObject.getOptionB());
            btnOptionB.setEnabled(true);
            btnOptionB.setVisibility(View.VISIBLE);
        }
        else
        {
            Log.i("Tree", "OptionB was empty");
            btnOptionB.setEnabled(false);
            btnOptionB.setVisibility(View.INVISIBLE);
        }
    }

    //=================================================================
    //            ASSIGN BACKGROUNDS AND ForegroundS HERE
    //=================================================================
    //Assign New Images an ID
    //i.e. 
    //  case 0:
    //      imgBackground.setBackgroundResource(R.drawable.background_0_space);
    //      break;
    //case 0 <=> background_0_name 
    
    //Animated backgrounds use this after the normal assignment: 
    //animBackground = (AnimationDrawable) imgBackground.getBackground();
    //animBackground.start();
    
    public void setBackground()
    {
        ImageView imgBackground = findViewById(R.id.imgBackground);
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        imgBackground.setMaxHeight(size.x);
        imgBackground.setMinimumHeight(size.x);
        imgBackground.setMaxWidth(size.x);
        imgBackground.setMinimumWidth(size.x);

        Log.i("Tree", "bgID = " + storyObject.getBackground());
        switch (storyObject.getBackground())
        {
            case 0:
                imgBackground.setBackgroundResource(R.drawable.background_0_space);
                break;
            case 1:
                imgBackground.setBackgroundResource(R.drawable.background_1_alarmclock);
                break;
            case 2:
                imgBackground.setBackgroundResource(R.drawable.background_2_computer);
                animBackground = (AnimationDrawable) imgBackground.getBackground();
                animBackground.start();
                break;
            default:
                imgBackground.setBackgroundResource(R.color.colorPrimaryDark);
                break;
        }
    }

    public void setForeground()
    {
        ImageView imgForeground = findViewById(R.id.imgForeground);

        Log.i("Tree", "fgID = " + storyObject.getForeground());
        switch (storyObject.getForeground())
        {
            default:
                imgForeground.setBackgroundResource(R.color.Blank);
                break;
        }
    }

    //=================================================================
    //                BACKGROUNDS AND FOREGROUNDS END
    //=================================================================

    public void setMusic()
    {
        musicPlayer.setApplicationContext(getApplicationContext());
        final boolean soundTrue = false;

        Log.i("Tree", "musicID = " + storyObject.getMusic());
        switch (storyObject.getMusic())
        {
            case 0:

                break;
            case 1:
                musicPlayer.startPlaying(R.raw.cyoa01smallfinal, true, soundTrue);
                break;
            case 2:
                musicPlayer.startPlaying(R.raw.intro, true, soundTrue);
            default:
                musicPlayer.stopPlaying();
                break;
        }
    }

    public void setSound()
    {
        musicPlayer.setApplicationContext(getApplicationContext());
        final boolean soundTrue = true;

        Log.i("Tree", "soundID = " + storyObject.getSound());
        switch (storyObject.getMusic())
        {
            case 0:

                break;
            case 1:
                musicPlayer.startPlaying(R.raw.rocket_thrusters, true, soundTrue);
                break;
            default:
                musicPlayer.stopPlaying();
                break;
        }
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
            //musicPlayer.stopPlaying();
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

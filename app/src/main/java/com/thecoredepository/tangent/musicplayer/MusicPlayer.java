package com.thecoredepository.tangent.musicplayer;

//This class runs all the music and sound for the program.
//Calling the music player allows you to stopPlaying(),
//stopPlayingMusic(), or stopPlayingSound() to end a track.
//You can start a track by calling startPlaying() with the raw track
//and whether its loopingTrue and if it is a sound vs a music track.
//startPlaying(@RawRes int sound, boolean loopingTrue, boolean soundTrue)

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.RawRes;
import android.util.Log;

public final class MusicPlayer
{
    private MediaPlayer musicPlayer;
    private MediaPlayer inGameMusic;
    private MediaPlayer soundPlayer;
    private MediaPlayer inGameSound;
    private Context context;

    //=====================================================================
    //                               MUSIC
    //=====================================================================

    public void stopPlaying()
    {
        if (soundPlayer != null)
        {
            soundPlayer.reset();
            soundPlayer.stop();
            soundPlayer.release();
            soundPlayer=null;
        }
        if (musicPlayer != null)
        {
            musicPlayer.reset();
            musicPlayer.stop();
            musicPlayer.release();
            musicPlayer=null;
        }
    }

    public void stopPlayingSound()
    {
        if (soundPlayer != null)
        {
            soundPlayer.reset();
            soundPlayer.stop();
            soundPlayer.release();
            soundPlayer=null;
        }
    }

    public void stopPlayingMusic()
    {
        if (musicPlayer != null)
        {
            musicPlayer.reset();
            musicPlayer.stop();
            musicPlayer.release();
            musicPlayer=null;
        }
    }

    public void startPlayingGameMusic(@RawRes int sound)
    {
        Log.i("Player", "STOP");
        stopPlayingMusic();
        inGameMusic = MediaPlayer.create(context, sound);
        inGameMusic.start();
        inGameMusic.setLooping(true);
        Log.i("Player", "START = " + sound);
    }

    public void stopPlayingGameMusic()
    {
        if (inGameMusic != null)
        {
            inGameMusic.reset();
            inGameMusic.stop();
            inGameMusic.release();
            inGameMusic=null;
        }
    }

    public void startPlayingGameSound(@RawRes int sound, boolean loopingTrue)
    {
        Log.i("Player", "STOP");
        stopPlayingMusic();
        inGameSound = MediaPlayer.create(context, sound);
        inGameSound.start();
        inGameSound.setLooping(loopingTrue);
        Log.i("Player", "START = " + sound);
    }

    public void stopPlayingGameSound()
    {
        if (inGameMusic != null)
        {
            inGameSound.reset();
            inGameSound.stop();
            inGameSound.release();
            inGameSound=null;
        }
    }

    public void startPlaying(@RawRes int sound, boolean loopingTrue, boolean soundTrue)
    {
        if (soundTrue == true)
        {
            Log.i("Player", "STOP");
            stopPlayingSound();
            soundPlayer = MediaPlayer.create(context, sound);
            soundPlayer.start();
            soundPlayer.setLooping(loopingTrue);
            Log.i("layer", "START = " + sound);
        }
        if (soundTrue == false)
        {
            Log.i("Player", "STOP");
            stopPlayingMusic();
            musicPlayer = MediaPlayer.create(context, sound);
            musicPlayer.start();
            musicPlayer.setLooping(loopingTrue);
            Log.i("Player", "START = " + sound);
        }

    }

    public void setApplicationContext(Context context1)
    {
        Log.i("Player", "Context = " + context1);
        this.context = context1;
    }

    //=====================================================================
    //                            MUSIC END
    //=====================================================================
}

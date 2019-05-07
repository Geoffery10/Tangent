package com.thecoredepository.tangent.musicplayer;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.RawRes;
import android.util.Log;

public final class MusicPlayer
{
    private MediaPlayer musicPlayer;
    private MediaPlayer soundPlayer;
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

    public void startPlaying(@RawRes int sound, boolean loopingTrue, boolean soundTrue)
    {
        if (soundTrue == true)
        {
            Log.i("Sound Player", "STOP");
            stopPlayingSound();
            soundPlayer = MediaPlayer.create(context, sound);
            soundPlayer.start();
            soundPlayer.setLooping(loopingTrue);
            Log.i("Sound Player", "START = " + sound);
        }
        if (soundTrue == false)
        {
            Log.i("Sound Player", "STOP");
            stopPlayingMusic();
            musicPlayer = MediaPlayer.create(context, sound);
            musicPlayer.start();
            musicPlayer.setLooping(loopingTrue);
            Log.i("Sound Player", "START = " + sound);
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

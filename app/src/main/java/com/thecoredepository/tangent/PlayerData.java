package com.thecoredepository.tangent;

//This class is used to save and load the player's data.
//It will be useful for saving the player characteristics
//and saving progress through the story.

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import com.thecoredepository.tangent.story.PlayerObject;
import com.thecoredepository.tangent.story.GenerateStory;

import java.util.prefs.PreferenceChangeEvent;

import static android.content.Context.MODE_PRIVATE;

public class PlayerData
{

    //Properties for Tangent 1

    String lastKey; //Current Location
    String playerName; //Player's Name

    public void playerData()
    {
        Log.d("PlayerData", "Initialized");
        this.lastKey = "0_1";
        this.playerName = GenerateStory.player.getPlayerName();
    }

    public void loadData(Context context)
    {
        Log.d("PlayerData", "Load...");
        playerData();
        SharedPreferences saveGame = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = saveGame.edit();

        this.lastKey = saveGame.getString("Key", this.lastKey);
        this.playerName = saveGame.getString("PlayerName", this.playerName);
        Log.d("PlayerData", "Loaded");
        Log.d("PlayerData", "Key - " + lastKey);
        Log.d("PlayerData", "PlayerName - " + playerName);
    }

    public void saveData(Context context)
    {
        Log.d("PlayerData", "Save... (Context)");
        SharedPreferences saveGame = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = saveGame.edit();

        editor.putString("Key", lastKey);
        editor.putString("PlayerName", playerName);
        editor.commit();
        Log.d("PlayerData", "Saved");
        Log.d("PlayerData", "Key - " + lastKey);
        Log.d("PlayerData", "PlayerName - " + playerName);
    }

    public void saveData(Context context, String key, String name)
    {
        Log.d("PlayerData", "Save... (" + key + ") & (" + name + ") ");
        SharedPreferences saveGame = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = saveGame.edit();

        editor.putString("Key", key);
        editor.putString("PlayerName", name);
        editor.commit();
        Log.d("PlayerData", "Saved");
        Log.d("PlayerData", "Key - " + key);
        Log.d("PlayerData", "PlayerName - " + name);
    }
}

package com.thecoredepository.tangent.story;

//This class generates the StoryObject array.
//This array houses the entire story as StoryObjects.
//Adding to the story is as simple as adding a new StoryObject
//and defining its properties.

import android.util.Log;

import com.thecoredepository.tangent.story.StoryObject;

import java.util.ArrayList;
import com.thecoredepository.tangent.story.PlayerObject;

public class GenerateStory
{
    ArrayList<StoryObject> storyArray = new ArrayList<StoryObject>();

    public void generateStory()
    {
        //All of these properties should be used
        PlayerObject player = new PlayerObject();
        String key;
        int background;
        int forground;
        int music;
        int sound;
        String charName;
        String speechText;
        Boolean continueTrue;
        String optionA;
        String optionB;
        String leftChild;
        String rightChild;

        //int nodesInStory = 3;

        //=====================================================================
        //                            STORY DATA
        //=====================================================================

        //Formating
        //key is were it is in the tree
        //background is the background index
        //forground is the forground index
        //music is the music index with 0 meaning continue last track
        //sound is the sound index with 0 meaning continue last track
        //charName id the talking character's Name
        //speechText is the Dialog of said character
        //continueTrue is true when the only option is continue else it's false
        //option A and B = "" unless continueTrue is false
        //leftChild equals the next key which is either continue or optionA
        //rightChild equals "" unless there us an option B

        //===============================ROOT====================================
        //This is the root of the story.
        //index: 0
        key = "0_1";
        background = 1;
        forground = -1;
        music = 2;
        sound = -1;
        charName = player.getPlayerName();
        speechText = "Agh! Late again! I should call and explai-";
        continueTrue = true;
        optionA = "";
        optionB = "";
        leftChild = "1_1";
        rightChild = "";
        StoryObject story0_1;
        storyArray.add(story0_1 = new StoryObject(key, background, forground, music, sound,
                charName, speechText, continueTrue, optionA, optionB, leftChild, rightChild));

        //index: 1
		key = "1_1";
        background = 2;
        forground = -1;
        music = 0;
        sound = -1;
        charName = player.getPlayerName();
        speechText = "...";
        continueTrue = true;
        optionA = "";
        optionB = "";
        leftChild = "2_1";
        rightChild = "";
        StoryObject story1_1;
        storyArray.add(story1_1 = new StoryObject(key, background, forground, music, sound,
                charName, speechText, continueTrue, optionA, optionB, leftChild, rightChild));
        //Scene shows computer monitor with message from Mrs. Fumb - "You. Are. Fired."

        //index: 2
		key = "2_1";
        background = 2;
        forground = -1;
        music = 0;
        sound = -1;
        charName = player.getPlayerName();
        speechText = "Ok... Well I hated that place anyway. Question is, what do I do now?";
        continueTrue = false;
        optionA = "Try to find a new job.";
        optionB = "I've had enough. (Do something drastic)";
        leftChild = "3_1";
        rightChild = "3_2";
        StoryObject story2_1;
        storyArray.add(story2_1 = new StoryObject(key, background, forground, music, sound,
                charName, speechText, continueTrue, optionA, optionB, leftChild, rightChild));

        //index: 3
		key = "3_1";
        background = -1;
        forground = -1;
        music = -1;
        sound = -1;
        charName = player.getPlayerName();
        speechText = "That's the fourth this month. Guess I'll just pick myself up and try again." +
                " Maybe I'll stick with one shift this time...";
        continueTrue = true;
        optionA = "";
        optionB = "";
        leftChild = "4_1";
        rightChild = "";
        StoryObject story3_1;
        storyArray.add(story3_1 = new StoryObject(key, background, forground, music, sound,
                charName, speechText, continueTrue, optionA, optionB, leftChild, rightChild));

        //index: 4
		key = "4_1";
        background = -1;
        forground = -1;
        music = -1;
        sound = -1;
        charName = player.getPlayerName();
        speechText = "Off to the Bureau of Employment... again...";
        continueTrue = false;
        optionA = "";
        optionB = "";
        leftChild = "";
        rightChild = "";
        StoryObject story4_1;
        storyArray.add(story4_1 = new StoryObject(key, background, forground, music, sound,
                charName, speechText, continueTrue, optionA, optionB, leftChild, rightChild));
		//end of current story arc 1

        //index: 5
		key = "3_2";
        background = -1;
        forground = -1;
        music = -1;
        sound = -1;
        charName = player.getPlayerName();
        speechText = "You know what? I'm done. I'm sick of doing things the 'Right' way. I'm going" +
                " to take my fate in my own hands.";
        continueTrue = false;
        optionA = "";
        optionB = "";
        leftChild = "";
        rightChild = "";
        StoryObject story3_2;
        storyArray.add(story3_2 = new StoryObject(key, background, forground, music, sound,
                charName, speechText, continueTrue, optionA, optionB, leftChild, rightChild));
		//end of current story arc 2

        //=====================================================================
        //                         STORY DATA END
        //=====================================================================
    }

    //This finds the next part of the story using its ID
    //A faster way might be updated later.
    //Big O(N)
    public StoryObject getStoryByID(String key)
    {
        for (int i = 0; i < storyArray.size(); i++) {
            if (storyArray.get(i).getKey() == key) {
                return storyArray.get(i);
            }
        }
        return null;
    }
}

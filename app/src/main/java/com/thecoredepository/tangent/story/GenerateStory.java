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
    public static PlayerObject player = new PlayerObject();
    
    public void generateStory()
    {
        //All of these properties should be used
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
        //=============================STAGE 00==================================
        //This is the root of the story.
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

        //=============================STAGE 01==================================
		key = "1_1";
        background = 2;
        forground = -1;
        music = -1;
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

        //=============================STAGE 02==================================
		key = "2_1";
        background = 2;
        forground = -1;
        music = -1;
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

        //=============================STAGE 03==================================
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
        //end

        //=============================STAGE 04==================================
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
				
		key = "4_2";
        background = -1;
        forground = -1;
        music = -1;
        sound = -1;
        charName = player.getPlayerName();
        speechText = "";
        continueTrue = true;
        optionA = "";
        optionB = "";
        leftChild = "5_2";
        rightChild = "";
        StoryObject story4_2;
        storyArray.add(story4_2 = new StoryObject(key, background, forground, music, sound,
                charName, speechText, continueTrue, optionA, optionB, leftChild, rightChild));
				
		key = "4_3";
        background = -1;
        forground = -1;
        music = -1;
        sound = -1;
        charName = player.getPlayerName();
        speechText = "I think I'll try the space industry...";
        continueTrue = false;
        optionA = "";
        optionB = "";
        leftChild = "";
        rightChild = "";
        StoryObject story4_3;
        storyArray.add(story4_3 = new StoryObject(key, background, forground, music, sound,
                charName, speechText, continueTrue, optionA, optionB, leftChild, rightChild));
				
		//=============================STAGE 05==================================
		key = "5_2";
        background = -1;
        forground = -1;
        music = -1;
        sound = -1;
        charName = player.getPlayerName();
        speechText = "I need... ";
        continueTrue = false;
        optionA = "... just enough to get back on my feet";
        optionB = "... enough to live comfortably.";
        leftChild = "6_2";
        rightChild = "6_3";
        StoryObject story5_2;
        storyArray.add(story5_2 = new StoryObject(key, background, forground, music, sound,
                charName, speechText, continueTrue, optionA, optionB, leftChild, rightChild));
				

		//=============================STAGE 06==================================
		key = "6_2";
        background = -1;
        forground = -1;
        music = -1;
        sound = -1;
        charName = player.getPlayerName();
        speechText = "27 hours huh...";
        continueTrue = true;
        optionA = "";
        optionB = "";
        leftChild = "7_2";
        rightChild = "";
        StoryObject story6_2;
        storyArray.add(story6_2 = new StoryObject(key, background, forground, music, sound,
                charName, speechText, continueTrue, optionA, optionB, leftChild, rightChild));
				
		key = "6_3";
        background = -1;
        forground = -1;
        music = -1;
        sound = -1;
        charName = player.getPlayerName();
        speechText = "";
        continueTrue = false;
        optionA = "";
        optionB = "";
        leftChild = "";
        rightChild = "";
        StoryObject story6_3;
        storyArray.add(story6_3 = new StoryObject(key, background, forground, music, sound,
                charName, speechText, continueTrue, optionA, optionB, leftChild, rightChild));
		
		//=============================STAGE 07==================================
		key = "7_2";
        background = -1;
        forground = -1;
        music = -1;
        sound = -1;
        charName = player.getPlayerName();
        speechText = "Go time.";
        continueTrue = true;
        optionA = "";
        optionB = "";
        leftChild = "8_2";
        rightChild = "";
        StoryObject story7_2;
        storyArray.add(story7_2 = new StoryObject(key, background, forground, music, sound,
                charName, speechText, continueTrue, optionA, optionB, leftChild, rightChild));
		
		//=============================STAGE 08==================================
		key = "8_2";
        background = -1;
        forground = -1;
        music = -1;
        sound = -1;
        charName = "Clerk";
        speechText = "Hello! Did you find everything alright? There's a thirty percent discount if you have a Company Card.";
        continueTrue = true;
        optionA = "";
        optionB = "";
        leftChild = "9_2";
        rightChild = "";
        StoryObject story8_2;
        storyArray.add(story8_2 = new StoryObject(key, background, forground, music, sound,
                charName, speechText, continueTrue, optionA, optionB, leftChild, rightChild));
		
		//=============================STAGE 09==================================
		key = "9_2";
        background = -1;
        forground = -1;
        music = -1;
        sound = -1;
        charName = "Clerk";
        speechText = "I- I don't want any trouble.";
        continueTrue = true;
        optionA = "";
        optionB = "";
        leftChild = "10_2";
        rightChild = "";
        StoryObject story9_2;
        storyArray.add(story9_2 = new StoryObject(key, background, forground, music, sound,
                charName, speechText, continueTrue, optionA, optionB, leftChild, rightChild));
		
		//=============================STAGE 10==================================
		key = "10_2";
        background = -1;
        forground = -1;
        music = -1;
        sound = -1;
        charName = player.getPlayerName();
        speechText = "In the bag.";
        continueTrue = true;
        optionA = "";
        optionB = "";
        leftChild = "11_2";
        rightChild = "";
        StoryObject story10_2;
        storyArray.add(story10_2 = new StoryObject(key, background, forground, music, sound,
                charName, speechText, continueTrue, optionA, optionB, leftChild, rightChild));
		
		//=============================STAGE 11==================================
		key = "11_2";
        background = -1;
        forground = -1;
        music = -1;
        sound = -1;
        charName = "Clerk";
        speechText = "Th- that's today's balance.";
        continueTrue = true;
        optionA = "";
        optionB = "";
        leftChild = "12_2";
        rightChild = "";
        StoryObject story11_2;
        storyArray.add(story11_2 = new StoryObject(key, background, forground, music, sound,
                charName, speechText, continueTrue, optionA, optionB, leftChild, rightChild));
		
		//=============================STAGE 12==================================
		key = "12_2";
        background = -1;
        forground = -1;
        music = -1;
        sound = -1;
        charName = player.getPlayerName();
        speechText = "I need more.";
        continueTrue = false;
        optionA = "Shoot him and transfer it yourself.";
        optionB = "Run.";
        leftChild = "13_2";
        rightChild = "13_3";
        StoryObject story12_2;
        storyArray.add(story12_2 = new StoryObject(key, background, forground, music, sound,
                charName, speechText, continueTrue, optionA, optionB, leftChild, rightChild));
		
		//=============================STAGE 13==================================
		key = "13_2";
        background = -1;
        forground = -1;
        music = -1;
        sound = -1;
        charName = player.getPlayerName();
        speechText = "";
        continueTrue = true;
        optionA = "";
        optionB = "";
        leftChild = "14_2";
        rightChild = "";
        StoryObject story13_2;
        storyArray.add(story13_2 = new StoryObject(key, background, forground, music, sound,
                charName, speechText, continueTrue, optionA, optionB, leftChild, rightChild));
				
		key = "13_3";
        background = -1;
        forground = -1;
        music = -1;
        sound = -1;
        charName = player.getPlayerName();
        speechText = "";
        continueTrue = false;
        optionA = "";
        optionB = "";
        leftChild = "";
        rightChild = "";
        StoryObject story13_3;
        storyArray.add(story13_3 = new StoryObject(key, background, forground, music, sound,
                charName, speechText, continueTrue, optionA, optionB, leftChild, rightChild));
		
		//=============================STAGE 14==================================
		key = "14_2";
        background = -1;
        forground = -1;
        music = -1;
        sound = -1;
        charName = player.getPlayerName();
        speechText = "-insert gunshot sound here-";
        continueTrue = true;
        optionA = "";
        optionB = "";
        leftChild = "15_2";
        rightChild = "";
        StoryObject story14_2;
        storyArray.add(story14_2 = new StoryObject(key, background, forground, music, sound,
                charName, speechText, continueTrue, optionA, optionB, leftChild, rightChild));
				
		//=============================STAGE 15==================================
		key = "15_2";
        background = -1;
        forground = -1;
        music = -1;
        sound = -1;
        charName = player.getPlayerName();
        speechText = "...";
        continueTrue = false;
        optionA = "";
        optionB = "";
        leftChild = "";
        rightChild = "";
        StoryObject story15_2;
        storyArray.add(story15_2 = new StoryObject(key, background, forground, music, sound,
                charName, speechText, continueTrue, optionA, optionB, leftChild, rightChild));
		

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

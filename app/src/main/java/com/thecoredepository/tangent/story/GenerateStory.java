package com.thecoredepository.tangent.story;

import android.util.Log;

import com.thecoredepository.tangent.story.StoryObject;

import java.util.ArrayList;

public class GenerateStory
{
    ArrayList<StoryObject> storyArray = new ArrayList<StoryObject>();

    public void generateStory()
    {
        String key;
        int background;
        int forground;
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
        //charName id the talking character's Name
        //speechText is the Dialog of said character
        //continueTrue is true when the only option is continue else it's false
        //option A and B = "" unless continueTrue is false
        //leftChild equals the next key which is either continue or optionA
        //rightChild equals "" unless there us an option B

        key = "0_1";
        background = 1;
        forground = -1;
        charName = "Steven";
        speechText = "Agh! Late again! I should call and explai-";
        continueTrue = true;
        optionA = "";
        optionB = "";
        leftChild = "1_1";
        rightChild = "";
        StoryObject story0_1;
        storyArray.add(story0_1 = new StoryObject(key, background, forground, charName, speechText, continueTrue, optionA, optionB, leftChild, rightChild));

		key = "1_1";
        background = -1;
        forground = -1;
        charName = "Steven";
        speechText = "...";
        continueTrue = true;
        optionA = "";
        optionB = "";
        leftChild = "2_1";
        rightChild = "";
        StoryObject story1_1;
        storyArray.add(story1_1 = new StoryObject(key, background, forground, charName, speechText, continueTrue, optionA, optionB, leftChild, rightChild));
		//Scene shows computer monitor with message from Mrs. Fumb - "You. Are. Fired."
		
		key = "2_1";
        background = -1;
        forground = -1;
        charName = "Steven";
        speechText = "Ok... Well I hated that place anyway. Question is, what do I do now?";
        continueTrue = false;
        optionA = "Try to find a new job.";
        optionB = "I've had enough. (Do something drastic)";
        leftChild = "3_1";
        rightChild = "3_2";
        StoryObject story2_1;
        storyArray.add(story2_1 = new StoryObject(key, background, forground, charName, speechText, continueTrue, optionA, optionB, leftChild, rightChild));
		
		key = "3_1";
        background = -1;
        forground = -1;
        charName = "Steven";
        speechText = "That's the fourth this month. Guess I'll just pick myself up and try again. Maybe I'll stick with one shift this time...";
        continueTrue = true;
        optionA = "";
        optionB = "";
        leftChild = "4_1";
        rightChild = "";
        StoryObject story3_1;
        storyArray.add(story3_1 = new StoryObject(key, background, forground, charName, speechText, continueTrue, optionA, optionB, leftChild, rightChild));
		
		key = "4_1";
        background = -1;
        forground = -1;
        charName = "Steven";
        speechText = "Off to the Bureau of Employment... again...";
        continueTrue = false;
        optionA = "";
        optionB = "";
        leftChild = "";
        rightChild = "";
        StoryObject story4_1;
        storyArray.add(story4_1 = new StoryObject(key, background, forground, charName, speechText, continueTrue, optionA, optionB, leftChild, rightChild));
		//end of current story arc 1
		
		key = "3_2";
        background = -1;
        forground = -1;
        charName = "Steven";
        speechText = "You know what? I'm done. I'm sick of doing things the 'Right' way. I'm going to take my fate in my own hands.";
        continueTrue = false;
        optionA = "";
        optionB = "";
        leftChild = "";
        rightChild = "";
        StoryObject story3_2;
        storyArray.add(story3_2 = new StoryObject(key, background, forground, charName, speechText, continueTrue, optionA, optionB, leftChild, rightChild));
		//end of current story arc 2

        //=====================================================================
        //                         STORY DATA END
        //=====================================================================
    }

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

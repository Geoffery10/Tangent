package com.thecoredepository.tangent.story;

import com.thecoredepository.tangent.story.StoryObject;

import java.util.ArrayList;

public class GenerateStory
{
    ArrayList<StoryObject> storyArray = new ArrayList<StoryObject>();

    public void generateStory()
    {
        String key;
        int background = 0;
        int forground = 0;
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
        background = 0;
        forground = 0;
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
        background = 0;
        forground = 0;
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
        background = 0;
        forground = 0;
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
        background = 0;
        forground = 0;
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
        background = 0;
        forground = 0;
        charName = "Steven";
        speechText = "...";
        continueTrue = true;
        optionA = "";
        optionB = "";
        leftChild = "1_1";
        rightChild = "";
        StoryObject story4_1;
        storyArray.add(story4_1 = new StoryObject(key, background, forground, charName, speechText, continueTrue, optionA, optionB, leftChild, rightChild));
		//end of current story

        //=====================================================================
        //                         STORY DATA END
        //=====================================================================
    }

    public StoryObject getStoryByID(String key)
    {
        int foundAt = 0;
        
        return storyArray.get(foundAt);
    }
}

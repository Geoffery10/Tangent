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
        speechText = "OH NO! I’m late again! I should call and explai…";
        continueTrue = true;
        optionA = "";
        optionB = "";
        leftChild = "1_1";
        rightChild = "";
        StoryObject story0_1;
        storyArray.add(story0_1 = new StoryObject(key, background, forground, charName, speechText, continueTrue, optionA, optionB, leftChild, rightChild));

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

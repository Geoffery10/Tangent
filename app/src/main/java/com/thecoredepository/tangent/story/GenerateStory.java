package com.thecoredepository.tangent.story;

import com.thecoredepository.tangent.story.StoryObject;

import java.util.ArrayList;

public class GenerateStory
{
    ArrayList<StoryObject> storyArray = new ArrayList<StoryObject>();

    public void generateStory()
    {
        String speechText;
        //int nodesInStory = 3;

        //=====================================================================
        //                            STORY DATA
        //=====================================================================

        speechText = "Hello, friendly traveler!";
        StoryObject story1_1;
        storyArray.add(story1_1 = new StoryObject("1_1", 0, 0, "Death", speechText, true, null, null, "2_1", "2_2"));

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

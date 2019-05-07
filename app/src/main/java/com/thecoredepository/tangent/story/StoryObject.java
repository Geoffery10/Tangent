package com.thecoredepository.tangent.story;

public class StoryObject
{
    private String key;
    private int background;
    private int forground;
    private String charName;
    private String speech;
    private Boolean continueTrue;
    private String optionA;
    private String optionB;
    private String leftChild;
    private String rightChild;

    StoryObject(String key, int background, int forground, String charName, String speech, Boolean continueTrue, String optionA, String optionB, String leftChild, String rightChild)
    {
        this.key = key;
        this.background = background;
        this.forground = forground;
        this.charName = charName;
        this.speech = speech;
        this.continueTrue = continueTrue;
        this.optionA = optionA;
        this.optionB = optionB;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public int getForground() {
        return forground;
    }

    public void setForground(int forground) {
        this.forground = forground;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getSpeech() {
        return speech;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    public Boolean getContinueTrue() {
        return continueTrue;
    }

    public void setContinueTrue(Boolean continueTrue) {
        this.continueTrue = continueTrue;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }
}

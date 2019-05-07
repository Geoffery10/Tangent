package com.thecoredepository.tangent.story;

public class StoryObject
{
    private String key;
    private int background;
    private int forground;
    private int music;
    private int sound;
    private String charName;
    private String speech;
    private Boolean continueTrue;
    private String optionA;
    private String optionB;
    private String leftChild;
    private String rightChild;

    StoryObject(String key, int background, int forground, int music, int sound, String charName, String speech, Boolean continueTrue, String optionA, String optionB, String leftChild, String rightChild)
    {
        this.key = key;
        this.background = background;
        this.forground = forground;
        this.music = music;
        this.sound = sound;
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

    public int getMusic() {
        return music;
    }

    public void setMusic(int music) {
        this.music = music;
    }

    public int getSound() {
        return sound;
    }

    public void setSound(int sound) {
        this.sound = sound;
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

    public String getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(String leftChild) {
        this.leftChild = leftChild;
    }

    public String getRightChild() {
        return rightChild;
    }

    public void setRightChild(String rightChild) {
        this.rightChild = rightChild;
    }
}

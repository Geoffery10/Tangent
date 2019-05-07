package com.thecoredepository.tangent.tree;

public class SceneNode
{
    int Background;
    int Forground;
    String Name;
    String Speech;
    Boolean Continue;
    String OptionA;
    String OptionB;

    public SceneNode(int Background, int Forground, String Name, String Speech, Boolean Continue, String OptionA, String OptionB)
    {
        this.setBackground(Background);
        this.setForground(Forground);
        this.setName(Name);
        this.setSpeech(Speech);
        this.setContinue(Continue);
        this.setOptionA(OptionA);
        this.setOptionB(OptionB);
    }

    public String toString()
    {
        String result = "";

        result += "Background: " + Background + "\n";
        result += "Forground: " + Forground + "\n";
        result += "Name: " + Name + "\n";
        result += "Speech: " + Speech + "\n";
        result += "Continue: " + Continue + "\n";
        result += "OptionA: " + Continue + "\n";
        result += "OptionB: " + Continue + "\n";

        return result;
    }

    public int getBackground() {
        return Background;
    }

    public void setBackground(int background) {
        Background = background;
    }

    public String getName() {
        return Name;
    }

    public int getForground() {
        return Forground;
    }

    public void setForground(int forground) {
        Forground = forground;
    }

    public String getSpeech() {
        return Speech;
    }

    public void setSpeech(String speech) {
        Speech = speech;
    }

    public void setName(String name) {
        Name = name;
    }

    public Boolean getContinue() {
        return Continue;
    }

    public void setContinue(Boolean aContinue) {
        Continue = aContinue;
    }

    public String getOptionA() {
        return OptionA;
    }

    public void setOptionA(String optionA) {
        OptionA = optionA;
    }

    public String getOptionB() {
        return OptionB;
    }

    public void setOptionB(String optionB) {
        OptionB = optionB;
    }
}

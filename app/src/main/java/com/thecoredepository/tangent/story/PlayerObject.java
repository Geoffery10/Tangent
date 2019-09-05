package com.thecoredepository.tangent.story;

//This class defines the properties of the player.
//These properties can be defined by the user or
//can use default values.

public class PlayerObject
{
    private String playerName; //Player's Name
    private String lastKeyLocation; //Used in saving
    private String race; //Might not be used
    private int age; //Might not be used
    private String gender; //Might not be used

    PlayerObject()
    {
        this.playerName = "Steven";
        this.lastKeyLocation = "0_1";
        this.race = "Human";
        this.age = 26;
        this.gender = "Male";
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getLastKeyLocation() {
        return lastKeyLocation;
    }

    public void setLastKeyLocation(String lastKeyLocation) {
        this.lastKeyLocation = lastKeyLocation;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

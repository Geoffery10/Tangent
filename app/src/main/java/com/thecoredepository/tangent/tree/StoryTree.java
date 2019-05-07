package com.thecoredepository.tangent.tree;

import android.util.Log;

import com.thecoredepository.tangent.tree.SceneNode;


public final class StoryTree
{
    Node root;
    Node focusNode = root;

    public void addNode(int key, String name, int Background, int Forground, String Name, String Speech, Boolean Continue, String OptionA, String OptionB)
    {
        Node newNode = new Node( key, name, Background, Forground, Name, Speech, Continue, OptionA, OptionB);

        if(root == null)
        {
            root = newNode;
        }
        else
        {
            focusNode = root;
            Node parent;

            while(true)
            {
                parent = focusNode;

                if(key < focusNode.key)
                {
                    focusNode = focusNode.leftNode;

                    if(focusNode == null)
                    {
                        parent.leftNode = newNode;
                        return;
                    }
                }
                else
                {
                    focusNode = focusNode.righNode;

                    if (focusNode == null)
                    {
                        parent.righNode = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void inOrderTraverseTree(Node focusNode)
    {
        if (focusNode != null)
        {
            inOrderTraverseTree(focusNode.leftNode);

            Log.i("Tree", String.valueOf(focusNode));

            inOrderTraverseTree(focusNode.righNode);
        }
    }

    public void preOrderTraverseTree(Node focusNode)
    {
        if (focusNode != null)
        {
            Log.i("Tree", String.valueOf(focusNode));

            preOrderTraverseTree(focusNode.leftNode);

            preOrderTraverseTree(focusNode.righNode);
        }
    }

    public boolean isEmpty()
    {
        return root == null;
    }

    public void clear()
    {
        root = null;
    }

    public boolean getLeft()
    {
        boolean result;
        if (focusNode.leftNode != null)
        {
            focusNode = focusNode.leftNode;
            result = true;
        }
        else
        {
            result = false;
        }
        return result;
    }

    public boolean getRight()
    {
        boolean result;
        if (focusNode.righNode != null)
        {
            focusNode = focusNode.righNode;
            result = true;
        }
        else
        {
            result = false;
        }
        return result;
    }

    public boolean isLeftEmpty()
    {
        boolean result;
        if (focusNode.leftNode != null)
        {
            result = false;
        }
        else
        {
            result = true;
        }
        return result;
    }

    public boolean isRightEmpty()
    {
        boolean result;
        if (focusNode.righNode != null)
        {
            result = false;
        }
        else
        {
            result = true;
        }
        return result;
    }

    public void generateTree()
    {
        Log.i("Tree", "Launched Generate Tree");
        StoryTree storyTree = new StoryTree();

        storyTree.addNode(1000, "Start", 6, 6, "Billy", "Hello", true, "Test A", "Test B");
        storyTree.addNode(950, "1-1", 6, 6, "Bob", "Hello", true, "Test A", "Test B");
        storyTree.addNode(900, "2-1", 6, 6, "Tim", "Hello", true, "Test A", "Test B");
        storyTree.addNode(850, "2-1", 6, 6, "John", "Hello", true, "Test A", "Test B");
        storyTree.addNode(800, "3-1", 6, 6, "Steve", "Hello", true, "Test A", "Test B");

        storyTree.preOrderTraverseTree(storyTree.root);
    }
}

class Node
{
    int key;
    String name;
    int Background;
    int Forground;
    String Name;
    String Speech;
    Boolean Continue;
    String OptionA;
    String OptionB;

    Node leftNode;
    Node righNode;

    Node(int key, String name, int Background, int Forground, String Name, String Speech, Boolean Continue, String OptionA, String OptionB)
    {
        this.key = key;
        this.name = name;
        this.setBackground(Background);
        this.setForground(Forground);
        this.setName(Name);
        this.setSpeech(Speech);
        this.setContinue(Continue);
        this.setOptionA(OptionA);
        this.setOptionB(OptionB);
    }

    @Override
    public String toString()
    {
        String result;
        result = name + " has a key " + key + "\n";
        result += getBackground() + "\n";
        result += getForground() + "\n";
        result += getName() + "\n";
        result += getSpeech() + "\n";
        result += getContinue() + "\n";
        result += getOptionA() + "\n";
        result += getOptionB();
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


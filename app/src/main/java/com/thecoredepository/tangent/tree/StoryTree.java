package com.thecoredepository.tangent.tree;

import android.util.Log;

import java.util.Iterator;
import java.util.LinkedList;

import com.thecoredepository.tangent.tree.SceneNode;


public final class StoryTree
{
    Node root;

    public void addNode(int key, String name)
    {
        Node newNode = new Node(key, name);

        if(root == null)
        {
            root = newNode;
        }
        else
        {
            Node focNode = root;
            Node parent;

            while(true)
            {

            }
        }
    }
}

class Node
{
    int key;
    String name;

    Node leftNode;
    Node righNode;

    Node(int key, String name)
    {
        this.key = key;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return name + " has a key " + key;
    }
}


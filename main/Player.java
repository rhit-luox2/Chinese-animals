package main;

import javax.swing.*;

public class Player {

    private String name;
    private int score;
    private int speed;
    private JLabel label;
    private ImageIcon image;

    public Player(String name, int score, int speed, JLabel label) {
        this.name = name;
        this.score = score;
        this.speed = speed;
        this.label = label;
    }

    public String getName(){
        return this.name;
    }

    public int getScore(){
        return this.score;
    }

    public int getSpeed(){
        return this.speed;
    }

    public JLabel getLabel(){
        return this.label;
    }

    public void setName(String newName){
        this.name = newName;
    }
    
    public void setScore(int newScore){
        this.score = newScore;
    }

    public void setSpeed(int newSpeed){
        this.speed = newSpeed;
    }

    public void setLabel(JLabel newLabel){
        this.label = newLabel;
    }


    


    
}

package com.recursivechaos.diceandicebags.domain;

import java.util.Map;


public class Dice {

    private int     sides;
    private Integer result;
    private boolean held = false;
    private String  color = "White";
    private Map<Integer,String> faces;
   
    public Dice(){
        this.sides = 6;
    }

    public Dice(int sides) {
        this.sides = sides;
    }
    
    public Dice(int sides, String color) {
        this.sides = sides;
        this.color = color;
    }
    
    public Dice(Map<Integer,String> faces){
        this.faces = faces;
        this.sides = faces.size();
    }
    
    public Dice(Map<Integer, String> faces, String color) {
        this.faces = faces;
        this.sides = faces.size();
        this.color = color;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public boolean isHeld() {
        return held;
    }

    public void setHeld(boolean held) {
        this.held = held;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    
    /**
     * If a dice with "faces", returns the string of the face, otherwise
     * returns a string of the integer result.
     * @return String representation of the face
     */
    public String getFace() {
        String face = this.result.toString();
        if(null!=faces&&(null!=this.result)) {
            face = faces.get(this.result);
        }
        return face;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

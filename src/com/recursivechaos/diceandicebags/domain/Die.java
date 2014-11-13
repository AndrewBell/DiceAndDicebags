package com.recursivechaos.diceandicebags.domain;

import java.util.Map;


/**
 * Calling it Die is gramatically incorrect, and it really bugs me, I don't know 
 * what to do about that, because I think calling it 'Die' is still kinda silly.
 * 
 * @author Andrew Bell
 *
 */
public class Die {

    private int     sides;
    private Integer result;
    private boolean held = false;
    private String  color = "White";
    private Map<Integer,String> faces;
   
    public Die(){
        this.sides = 6;
    }

    public Die(int sides) {
        this.sides = sides;
    }
    
    public Die(int sides, String color) {
        this.sides = sides;
        this.color = color;
    }
    
    public Die(Map<Integer,String> faces){
        this.faces = faces;
        this.sides = faces.size();
    }
    
    public Die(Map<Integer, String> faces, String color) {
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

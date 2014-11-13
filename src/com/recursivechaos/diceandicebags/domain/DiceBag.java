package com.recursivechaos.diceandicebags.domain;

import java.util.ArrayList;
import java.util.List;

public class DiceBag {

    private List<Die> dice = new ArrayList<>();

    public DiceBag(){
    }
    
    public DiceBag(List<Die> dice){
        this.dice = dice;
    }

    public List<Die> getDice() {
        return dice;
    }

    public void setDice(List<Die> dice) {
        this.dice = dice;
    }
    
    public int size(){
        return dice.size();
    }

    public void addDice(Die dice) {
        this.dice.add(dice);
    }
    
    public void removeDice(Die diceToRemove) {
        List<Die> newDice = new ArrayList<>();
        for(Die die : this.dice) {
            if(die!=diceToRemove){
                newDice.add(die);
            }
        }
        this.dice = newDice;
    }
    
    
}

package com.recursivechaos.diceandicebags.domain;

import java.util.ArrayList;
import java.util.List;

public class DiceBag {

    private List<Dice> dice = new ArrayList<>();

    public DiceBag(){
    }
    
    public DiceBag(List<Dice> dice){
        this.dice = dice;
    }

    public List<Dice> getDice() {
        return dice;
    }

    public void setDice(List<Dice> dice) {
        this.dice = dice;
    }
    
    public int size(){
        return dice.size();
    }

    public void addDice(Dice dice) {
        this.dice.add(dice);
    }
    
    public void removeDice(Dice diceToRemove) {
        List<Dice> newDice = new ArrayList<>();
        for(Dice die : this.dice) {
            if(die!=diceToRemove){
                newDice.add(die);
            }
        }
        this.dice = newDice;
    }
    
    
}

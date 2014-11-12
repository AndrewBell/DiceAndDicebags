package com.recursivechaos.diceandicebags.service;

import com.recursivechaos.diceandicebags.domain.Dice;

public class DiceRollerImpl implements DiceRoller{
    
    Dice dice;
    
    public DiceRollerImpl(Dice singleDice) {
        this.dice = singleDice;
    }

    public void rollDice() {
        DiceService.rollDice(dice);
    }

    public Dice getDice() {
        return this.dice;
    }

}

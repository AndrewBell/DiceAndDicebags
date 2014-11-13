package com.recursivechaos.diceandicebags.service;

import com.recursivechaos.diceandicebags.domain.Die;

public class DieRollerImpl implements DieRoller{
    
    Die dice;
    
    public DieRollerImpl(Die singleDice) {
        this.dice = singleDice;
    }

    public void rollDice() {
        DiceService.rollDice(dice);
    }

    public Die getDice() {
        return this.dice;
    }

}

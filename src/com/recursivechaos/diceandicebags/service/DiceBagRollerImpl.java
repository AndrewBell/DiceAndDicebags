package com.recursivechaos.diceandicebags.service;

import com.recursivechaos.diceandicebags.domain.Dice;
import com.recursivechaos.diceandicebags.domain.DiceBag;

public class DiceBagRollerImpl implements DiceBagRoller {

    DiceBag bag;
    
    public DiceBagRollerImpl(DiceBag bag) {
        this.bag = bag;
    }

    public void rollAllDice() {
        for(Dice die : bag.getDice()){
            DiceService.rollDice(die);
        }
    }
    
    

}

package com.recursivechaos.diceandicebags.service;

import java.util.List;

import com.recursivechaos.diceandicebags.domain.DiceBag;
import com.recursivechaos.diceandicebags.domain.Die;

public class DiceBagRollerImpl implements DiceBagRoller {

    DiceBag bag;
    
    public DiceBagRollerImpl(DiceBag bag) {
        this.bag = bag;
    }

    public void rollAllDice() {
        for(Die die : bag.getDice()){
            DiceService.rollDice(die);
        }
    }

	public void rollDice(Die checkDice) {
		// There's some potential concurrency issues
		// in here, be warned.
		List<Die> dice = bag.getDice();
		for(Die pickedDie : dice){
			if(pickedDie.equals(checkDice)&&(pickedDie.isHeld()==false)){
				pickedDie = DiceService.rollDice(pickedDie);
			}
		}
	}

    public DiceBag getBag() {
       return bag;
    }
}

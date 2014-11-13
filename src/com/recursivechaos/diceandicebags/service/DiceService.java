package com.recursivechaos.diceandicebags.service;

import java.util.Random;

import com.recursivechaos.diceandicebags.domain.Die;

public class DiceService {

    public static Die rollDice(Die dice){
        if(dice.isHeld()==false){
            Random randomGenerator = new Random();
            dice.setResult(randomGenerator.nextInt(dice.getSides()) + 1);
        }
        return dice;
    }
}

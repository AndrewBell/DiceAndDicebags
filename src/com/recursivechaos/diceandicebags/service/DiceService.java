package com.recursivechaos.diceandicebags.service;

import java.util.Random;

import com.recursivechaos.diceandicebags.domain.Dice;

public class DiceService {

    public static Dice rollDice(Dice dice){
        if(dice.isHeld()==false){
            Random randomGenerator = new Random();
            dice.setResult(randomGenerator.nextInt(dice.getSides()) + 1);
        }
        return dice;
    }
}

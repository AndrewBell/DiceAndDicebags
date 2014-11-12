package com.recursivechaos.diceandicebags.service;

import com.recursivechaos.diceandicebags.domain.Dice;

public interface DiceRoller {

    /**
     * Rolls all enclosed dice
     */
    void rollDice();

    Dice getDice(); 
}

package com.recursivechaos.diceandicebags.service;

import com.recursivechaos.diceandicebags.domain.Die;

public interface DieRoller {

    /**
     * Rolls all enclosed dice
     */
    void rollDice();

    Die getDice(); 
}

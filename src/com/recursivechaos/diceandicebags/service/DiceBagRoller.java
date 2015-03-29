package com.recursivechaos.diceandicebags.service;

import com.recursivechaos.diceandicebags.domain.DiceBag;
import com.recursivechaos.diceandicebags.domain.Die;

public interface DiceBagRoller {

    void rollAllDice();
    void rollDice(Die oneDie);
    DiceBag getBag();

}

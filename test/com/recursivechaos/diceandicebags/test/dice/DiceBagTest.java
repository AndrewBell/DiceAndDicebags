package com.recursivechaos.diceandicebags.test.dice;

import static org.junit.Assert.*;

import org.junit.Test;

import com.recursivechaos.diceandicebags.domain.Dice;
import com.recursivechaos.diceandicebags.domain.DiceBag;
import com.recursivechaos.diceandicebags.service.DiceBagRoller;
import com.recursivechaos.diceandicebags.service.DiceBagRollerImpl;

public class DiceBagTest {

    @Test
    public void createBagTest() {
       DiceBag bag = new DiceBag();
       assertNotNull(bag);

       Dice oneDie = new Dice();
       bag.addDice(oneDie);
       bag.addDice(oneDie);
       bag.addDice(oneDie);
       
       assertEquals("Dice not added",3,bag.size());
    }
    
    @Test
    public void rollTest(){
        DiceBag bag = new DiceBag();
        Dice oneDie = new Dice();
        bag.addDice(oneDie);
        bag.addDice(oneDie);
        bag.addDice(oneDie);
        
        DiceBagRoller roller = new DiceBagRollerImpl(bag);
        roller.rollAllDice();

        for(Dice die : bag.getDice()){
            assertTrue(die.getResult()>0&&die.getResult()<=die.getSides());
        }
    }
    
    @Test
    public void rollOneTest(){
        DiceBag bag = new DiceBag();
        Dice oneDie = new Dice();
        bag.addDice(oneDie);
        bag.addDice(oneDie);
        bag.addDice(oneDie);
        
        DiceBagRoller roller = new DiceBagRollerImpl(bag);
        
    }

}

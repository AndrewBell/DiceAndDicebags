package com.recursivechaos.diceandicebags.test.dice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.recursivechaos.diceandicebags.domain.DiceBag;
import com.recursivechaos.diceandicebags.domain.Die;
import com.recursivechaos.diceandicebags.service.DiceBagRoller;
import com.recursivechaos.diceandicebags.service.DiceBagRollerImpl;

public class DiceBagTest {

    @Test
    public void createBagTest() {
       DiceBag bag = new DiceBag();
       assertNotNull(bag);

       Die oneDie = new Die();
       bag.addDice(oneDie);
       bag.addDice(oneDie);
       bag.addDice(oneDie);
       
       assertEquals("Die not added",3,bag.size());
    }
    
    @Test
    public void rollTest(){
        DiceBag bag = new DiceBag();
        Die oneDie = new Die();
        bag.addDice(oneDie);
        bag.addDice(oneDie);
        bag.addDice(oneDie);
        
        DiceBagRoller roller = new DiceBagRollerImpl(bag);
        roller.rollAllDice();

        for(Die die : bag.getDice()){
            assertTrue(die.getResult()>0&&die.getResult()<=die.getSides());
        }
    }
    
    @Test
    public void rollOneTest(){
        DiceBag bag = new DiceBag();
        Die oneDie = new Die();
        bag.addDice(oneDie);
        
        DiceBagRoller roller = new DiceBagRollerImpl(bag);
        roller.rollDice(oneDie);
        List<Die> dice = roller.getBag().getDice();
        assertTrue(dice.get(0).getResult()>0&&dice.get(0).getResult()<=dice.get(0).getSides());
        
    }

}

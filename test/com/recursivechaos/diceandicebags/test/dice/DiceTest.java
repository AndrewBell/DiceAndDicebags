package com.recursivechaos.diceandicebags.test.dice;

import static org.junit.Assert.*;

import org.junit.Test;

import com.recursivechaos.diceandicebags.domain.CoinDice;
import com.recursivechaos.diceandicebags.domain.Dice;
import com.recursivechaos.diceandicebags.domain.FateDice;
import com.recursivechaos.diceandicebags.domain.XWingAttackDice;
import com.recursivechaos.diceandicebags.domain.XWingDefenseDice;
import com.recursivechaos.diceandicebags.service.DiceRoller;
import com.recursivechaos.diceandicebags.service.DiceRollerImpl;

public class DiceTest {

    @Test
    public void diceCreationTest() {

        Dice newDice = new Dice();
        assertNotNull(newDice);
        assertEquals("Wrong default contructor", 6, newDice.getSides());

        Dice sidedDice = new Dice(20);
        assertEquals("Incorrect dice sides", 20, sidedDice.getSides());
    }

    @Test
    public void diceRollTest() {

        Dice newDice = new Dice(20);
        DiceRoller roller = new DiceRollerImpl(newDice);
        roller.rollDice();
        Dice rolledDice = roller.getDice();
        assertTrue(rolledDice.getResult() > 0 && rolledDice.getResult()<= newDice.getSides());
    }

    @Test
    public void diceHoldTest() {

        Dice newDice = new Dice(100);
        DiceRoller roller = new DiceRollerImpl(newDice);

        Dice returnedDice = roller.getDice();
        assertNotNull(returnedDice);

        roller.rollDice();
        int beforeHold = roller.getDice().getResult();
        Dice rolledDice = roller.getDice();
        rolledDice.setHeld(true);

        DiceRoller heldRoller = new DiceRollerImpl(rolledDice);
        heldRoller.rollDice();
        int afterHold = heldRoller.getDice().getResult();

        assertTrue("Dice was modified after held", beforeHold == afterHold);
    }
    
    @Test
    public void createCoinDice(){
        Dice coinDice = new CoinDice();
        DiceRoller roller = new DiceRollerImpl(coinDice);
        roller.rollDice();
        Dice foundCoin = roller.getDice();

        assertTrue("Dice face not expected",(foundCoin.getFace()=="Heads"||foundCoin.getFace()=="Tails"));
    }
    
    @Test
    public void createFateDice(){
        Dice fateDice = new FateDice();
        DiceRoller roller = new DiceRollerImpl(fateDice);
        roller.rollDice();
        Dice foundFate = roller.getDice();
        
        assertTrue("Dice face not expected",(foundFate.getFace()=="+"||foundFate.getFace()=="-"||foundFate.getFace()=="Blank"));
    }
    
    @Test
    public void createXwingDice(){
        Dice xDice = new XWingAttackDice();
        DiceRoller roller = new DiceRollerImpl(xDice);
        roller.rollDice();
        Dice foundX = roller.getDice();

        assertTrue("Dice face not expected",(foundX.getFace()=="Hit")||(foundX.getFace()=="Crit")||(foundX.getFace()=="Focus")||(foundX.getFace()=="Blank"));
        
        xDice = new XWingDefenseDice();
        roller = new DiceRollerImpl(xDice);
        roller.rollDice();
        foundX = roller.getDice();

        assertTrue("Dice face not expected",(foundX.getFace()=="Evade")||(foundX.getFace()=="Focus")||(foundX.getFace()=="Blank"));
    }
    
    @Test
    public void createColorDice(){
        String COLOR = "Teal";
        Dice cDice = new Dice(20,COLOR);
        
        assertEquals("Not colored",COLOR,cDice.getColor());
    }
    
    

}

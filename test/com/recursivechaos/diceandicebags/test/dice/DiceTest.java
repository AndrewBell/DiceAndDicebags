package com.recursivechaos.diceandicebags.test.dice;

import static org.junit.Assert.*;

import org.junit.Test;

import com.recursivechaos.diceandicebags.domain.CoinDie;
import com.recursivechaos.diceandicebags.domain.Die;
import com.recursivechaos.diceandicebags.domain.FateDie;
import com.recursivechaos.diceandicebags.domain.XWingAttackDie;
import com.recursivechaos.diceandicebags.domain.XWingDefenseDie;
import com.recursivechaos.diceandicebags.service.DieRoller;
import com.recursivechaos.diceandicebags.service.DieRollerImpl;

public class DiceTest {

    @Test
    public void diceCreationTest() {

        Die newDice = new Die();
        assertNotNull(newDice);
        assertEquals("Wrong default contructor", 6, newDice.getSides());

        Die sidedDice = new Die(20);
        assertEquals("Incorrect dice sides", 20, sidedDice.getSides());
    }

    @Test
    public void diceRollTest() {

        Die newDice = new Die(20);
        DieRoller roller = new DieRollerImpl(newDice);
        roller.rollDice();
        Die rolledDice = roller.getDice();
        assertTrue(rolledDice.getResult() > 0 && rolledDice.getResult()<= newDice.getSides());
    }

    @Test
    public void diceHoldTest() {

        Die newDice = new Die(100);
        DieRoller roller = new DieRollerImpl(newDice);

        Die returnedDice = roller.getDice();
        assertNotNull(returnedDice);

        roller.rollDice();
        int beforeHold = roller.getDice().getResult();
        Die rolledDice = roller.getDice();
        rolledDice.setHeld(true);

        DieRoller heldRoller = new DieRollerImpl(rolledDice);
        heldRoller.rollDice();
        int afterHold = heldRoller.getDice().getResult();

        assertTrue("Die was modified after held", beforeHold == afterHold);
    }
    
    @Test
    public void createCoinDice(){
        Die coinDice = new CoinDie();
        DieRoller roller = new DieRollerImpl(coinDice);
        roller.rollDice();
        Die foundCoin = roller.getDice();

        assertTrue("Die face not expected",(foundCoin.getFace()=="Heads"||foundCoin.getFace()=="Tails"));
    }
    
    @Test
    public void createFateDice(){
        Die fateDice = new FateDie();
        DieRoller roller = new DieRollerImpl(fateDice);
        roller.rollDice();
        Die foundFate = roller.getDice();
        
        assertTrue("Die face not expected",(foundFate.getFace()=="+"||foundFate.getFace()=="-"||foundFate.getFace()=="Blank"));
    }
    
    @Test
    public void createXwingDice(){
        Die xDice = new XWingAttackDie();
        DieRoller roller = new DieRollerImpl(xDice);
        roller.rollDice();
        Die foundX = roller.getDice();

        assertTrue("Die face not expected",(foundX.getFace()=="Hit")||(foundX.getFace()=="Crit")||(foundX.getFace()=="Focus")||(foundX.getFace()=="Blank"));
        
        xDice = new XWingDefenseDie();
        roller = new DieRollerImpl(xDice);
        roller.rollDice();
        foundX = roller.getDice();

        assertTrue("Die face not expected",(foundX.getFace()=="Evade")||(foundX.getFace()=="Focus")||(foundX.getFace()=="Blank"));
    }
    
    @Test
    public void createColorDice(){
        String COLOR = "Teal";
        Die cDice = new Die(20,COLOR);
        
        assertEquals("Not colored",COLOR,cDice.getColor());
    }
    
    

}

package com.recursivechaos.diceandicebags.domain;

import java.util.HashMap;
import java.util.Map;

public class CoinDice extends Dice {

    private static final Map<Integer,String> FACES;
    static {
        FACES = new HashMap<Integer,String>();
        FACES.put(1, "Heads");
        FACES.put(2, "Tails");
    }
            
    public CoinDice(){
        super(FACES,"Silver");
    }
     
}

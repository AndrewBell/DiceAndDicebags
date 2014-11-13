package com.recursivechaos.diceandicebags.domain;

import java.util.HashMap;
import java.util.Map;

public class CoinDie extends Die {

    private static final Map<Integer,String> FACES;
    static {
        FACES = new HashMap<Integer,String>();
        FACES.put(1, "Heads");
        FACES.put(2, "Tails");
    }
            
    public CoinDie(){
        super(FACES,"Silver");
    }
     
}

package com.recursivechaos.diceandicebags.domain;

import java.util.HashMap;
import java.util.Map;

public class XWingAttackDice extends Dice {

    private static final Map<Integer,String> FACES;
    static {
        FACES = new HashMap<Integer,String>();
        FACES.put(1, "Crit");
        FACES.put(2, "Hit");
        FACES.put(3, "Hit");
        FACES.put(4, "Hit");
        FACES.put(5, "Focus");
        FACES.put(6, "Blank");
        FACES.put(7, "Blank");
        FACES.put(8, "Blank");
        
    }
            
    public XWingAttackDice(){
        super(FACES,"Red");
    }
    
}

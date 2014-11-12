package com.recursivechaos.diceandicebags.domain;

import java.util.HashMap;
import java.util.Map;


public class XWingDefenseDice extends Dice {
    
    private static final Map<Integer,String> FACES;
    static {
        FACES = new HashMap<Integer,String>();
        FACES.put(1, "Evade");
        FACES.put(2, "Evade");
        FACES.put(3, "Evade");
        FACES.put(4, "Evade");
        FACES.put(5, "Focus");
        FACES.put(6, "Blank");
        FACES.put(7, "Blank");
        FACES.put(8, "Blank");
        
    }
            
    public XWingDefenseDice(){
        super(FACES,"Green");
    }
}

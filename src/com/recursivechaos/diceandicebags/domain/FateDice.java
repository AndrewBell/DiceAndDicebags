package com.recursivechaos.diceandicebags.domain;

import java.util.HashMap;
import java.util.Map;

public class FateDice extends Dice {
    
    private static final Map<Integer,String> FACES;
    static {
        FACES = new HashMap<Integer,String>();
        FACES.put(1, "+");
        FACES.put(2, "-");
        FACES.put(3, "Blank");
    }
            
    public FateDice(){
        super(FACES);
    }
    
}

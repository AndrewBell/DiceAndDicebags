package com.recursivechaos.diceandicebags.domain;

import java.util.HashMap;
import java.util.Map;

public class FateDie extends Die {
    
    private static final Map<Integer,String> FACES;
    static {
        FACES = new HashMap<Integer,String>();
        FACES.put(1, "+");
        FACES.put(2, "-");
        FACES.put(3, "Blank");
    }
            
    public FateDie(){
        super(FACES);
    }
    
}

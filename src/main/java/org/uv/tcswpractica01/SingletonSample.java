
package org.uv.tcswpractica01;

import java.util.logging.Level;
import java.util.logging.Logger;


public class SingletonSample {
    
    
    
    
    
    private static SingletonSample sin = null;
    
    
    private SingletonSample() {
            Logger.getLogger(SingletonSample.class.getName()).log(Level.INFO, null, "Singleton creado");
        
    }
    
    public static SingletonSample getInstance() {
        if(sin == null) {
            sin = new SingletonSample();
        } 
        return sin;
    }
    public static void principal() {
        Logger.getLogger(SingletonSample.class.getName()).log(Level.INFO, null, "This is a method, part of an object...");
    }

    static {
        Logger.getLogger(SingletonSample.class.getName()).log(Level.INFO, null, "This is an static section, part of the class...");

    }

}

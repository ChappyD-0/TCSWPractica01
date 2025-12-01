

package org.uv.tcswpractica01;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SingletonSampleDos {
    
    private static SingletonSampleDos sin = null;
    
    
    private SingletonSampleDos() {
            Logger.getLogger(SingletonSampleDos.class.getName()).log(Level.INFO, null, "Singleton creado");
        
    }
    
    public static SingletonSampleDos getInstance() {
        if(sin == null) {
            sin = new SingletonSampleDos();
        } 
        return sin;
    }
    
    

}

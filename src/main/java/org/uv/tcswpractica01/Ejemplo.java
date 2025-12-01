
package org.uv.tcswpractica01;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Ejemplo {

    private int a;
    private int b;
    
    public void suma(){
        int c = a + b;
        Logger.getLogger(Ejemplo.class.getName()).log(Level.INFO, "Suma {0}", c);
    }
    
    public Ejemplo(int a, int b){
        this.a = a;
        this.b = b;
    }
    public Ejemplo() {
        this.a = 10;
        this.b = 10;
    }
}

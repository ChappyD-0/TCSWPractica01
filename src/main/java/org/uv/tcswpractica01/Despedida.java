
package org.uv.tcswpractica01;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Despedida implements Mensaje {

    @Override
    public void msg() {
            Logger.getLogger(Despedida.class.getName()).log(Level.INFO, null, "Adios mundo...");
    }
    

}

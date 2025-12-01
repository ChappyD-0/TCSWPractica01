

package org.uv.tcswpractica01;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DespedidaI implements IMensaje {
    
    @Override
    public void imprimir(){
            Logger.getLogger(DespedidaI.class.getName()).log(Level.INFO, null, "Adios mundo...");
    }

}


package org.uv.tcswpractica01;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class SaludoI implements IMensaje {


    @Override
    public void imprimir() {
            Logger.getLogger(SaludoI.class.getName()).log(Level.INFO, null, "Hola mundo...");
    }



}

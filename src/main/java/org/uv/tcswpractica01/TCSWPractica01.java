

package org.uv.tcswpractica01;

import java.util.logging.Level;
import java.util.logging.Logger;


public class TCSWPractica01  {

    public static void main(String[] args) {
        
        ConectionDB con = ConectionDB.getInstance();
        
        String sql = "insert into empleados (clave, nombre, direccion, telefono) values" + 
                " ('41', 'Gabriel', 'Av.3333', '7777')" ;
        
        boolean res = con.execute(sql);
        if(res)
            Logger.getLogger(TCSWPractica01.class.getName()).log(Level.INFO, "se guardo");
        else
            Logger.getLogger(TCSWPractica01.class.getName()).log(Level.INFO, "No se guardo");

        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}

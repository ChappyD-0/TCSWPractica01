

package org.uv.tcswpractica01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConectionDB {
    private static ConectionDB ct = null;
    public static ConectionDB getInstance(){
        if(ct == null){
            ct = new ConectionDB();
        } 
        return ct;
    }
    
    private String url = "jdbc:postgresql://localhost:5432/mydb";
    private String usr = "chappyd0";
    private String pwd = "Iloverock1721";
    
    
    private Connection con = null;
    private ConectionDB(){
        try {
            con = DriverManager.getConnection(url, usr, pwd);
            Logger.getLogger(ConectionDB.class.getName()).log(Level.INFO, null, "Se conecto...");
        } catch (SQLException ex) {
            Logger.getLogger(ConectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public boolean execute(String sql)  {
        Statement st = null;
        try {
            st = con.createStatement();
            st.execute(sql);
            return true;
        } catch (SQLException ex) {
            
            Logger.getLogger(ConectionDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            try {
                if (st != null){
                    st.close();
                }
            } catch(SQLException ex) {
                Logger.getLogger(ConectionDB.class.getName()).log(Level.INFO, null, ex);
            }
        }
    }

}

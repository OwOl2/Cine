/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cine {

    /**
     * @param args the command line arguments
     */
    Conectar con;
    
    
    
    public static void main(String[] args) throws SQLException {
        Login VentanaInicial;
        VentanaInicial = new Login();
        VentanaInicial.setVisible(true);
        VentanaInicial.setLocationRelativeTo(null);
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SD
 */
public class Conectar {
    private static Connection conn;

    public Conectar() {
        conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/base?autoReconnect=true&useSSL=false", "root", "SE$RFse4rf");
        }catch (ClassNotFoundException | SQLException e) {
            System.out.println("error al conectar" + e);
        }
        
    }
    
        //este es el metodo para devolver la coneccion
    public Connection getConnection(){
        return conn;
    }
    
    public void desconectar(){
        conn = null;
        if (conn == null){
            System.out.println("desconectado");
        }
    }
}
    


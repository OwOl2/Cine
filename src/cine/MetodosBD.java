/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class MetodosBD {
    
Conectar metodospool;
    
public int GuardarUsuario(String Nombre, String Contraseña, String Mail, String Telefono){
    
metodospool = new Conectar();

int resultado = 0;

Connection con = null;

String SSQL = "INSERT INTO usuario (Nombre, Contraseña, Mail, Telefono) "
            + "VALUES ( ?, ?, ?, ?)";


    try {
    
        con = metodospool.getConnection();
        
    try (PreparedStatement psql = con.prepareStatement(SSQL)) {
        psql.setString(1, Nombre);
        psql.setString(2, Contraseña);
        psql.setString(3, Mail);
        psql.setString(4, Telefono);
        
        
        resultado = psql.executeUpdate();
    }
                    
    } catch (SQLException e) {
    
        JOptionPane.showMessageDialog(null, "Error al intentar almacenar la información:\n"
                                     + e, "Error en la operación", JOptionPane.ERROR_MESSAGE);
        
    }finally{
    
        try {
            
            if(con!=null){
            
                con.close();
                
            }
            
        } catch (SQLException ex) {
        
            JOptionPane.showMessageDialog(null, "Error al intentar cerrar la conexión:\n"
                                     + ex, "Error en la operación", JOptionPane.ERROR_MESSAGE);
            
        }
    
    }

    return resultado;
    
}    

public int GuardarPelicula(String Nombre, String Imagen, String resumen){
    
metodospool = new Conectar();
int resultado = 0;
Connection con = null;

String SSQL = "INSERT INTO pelicula (Nombre, Imagen, resumen) "
            + "VALUES ( ?, ?, ?)";

    try {
    
        con = metodospool.getConnection();
        
    try (PreparedStatement psql = con.prepareStatement(SSQL)) {
        psql.setString(1, Nombre);
        psql.setString(2, Imagen);
        psql.setString(3, resumen);        
        
        resultado = psql.executeUpdate();
    }                    
    } catch (SQLException e) {    
        JOptionPane.showMessageDialog(null, "Error al intentar almacenar la información:\n"
                                     + e, "Error en la operación", JOptionPane.ERROR_MESSAGE);        
    }finally{    
        try {            
            if(con!=null){            
                con.close();                
            }            
        } catch (SQLException ex) {        
            JOptionPane.showMessageDialog(null, "Error al intentar cerrar la conexión:\n"
                                     + ex, "Error en la operación", JOptionPane.ERROR_MESSAGE);
            
        }    
    }
    return resultado;
    
}    

public Usuario recuperarUsuarioporNombre(Connection conexion, String nombre) throws SQLException {
    Usuario usuario = null;
          try{
             PreparedStatement consulta = conexion.prepareStatement("select * from usuario" + " WHERE nombre = ?" );
             consulta.setString(1, nombre);
             ResultSet resultado = consulta.executeQuery();
             while(resultado.next()){
                usuario = new Usuario(resultado.getInt("id"), resultado.getString("Nombre"), resultado.getString("contraseña"), resultado.getString("mail"), resultado.getString("telefono"));
             }
          }catch(SQLException ex){
             throw new SQLException(ex);
          }
  
     return usuario;
       }
    

public Pelicula recuperarPeliculaPorId(Connection conexion, int id) throws SQLException {
    Pelicula pelicula = null;
          try{
             PreparedStatement consulta = conexion.prepareStatement("select id,Nombre,Imagen,Resumen from pelicula" + " WHERE id = ?" );
             consulta.setInt(1, id);
             ResultSet resultado = consulta.executeQuery();
             while(resultado.next()){
                pelicula = new Pelicula(id, resultado.getString("Nombre"), resultado.getString("Imagen"), resultado.getString("Resumen"));
             }
          }catch(SQLException ex){
             throw new SQLException(ex);
          }
  
     return pelicula;
       }

public int recuperarIdPeliculas(Connection conexion, int i, int j) throws SQLException {
    int id = 0;
          try{
             PreparedStatement consulta = conexion.prepareStatement("select id from pelicula");
             ResultSet resultado = consulta.executeQuery();
             do{
                 i--;
                 while(resultado.next()){
                    id = resultado.getInt("id");
                    System.out.println(id);
                }
             }while (i!=j);
             
          }catch(SQLException ex){
             return id;
          }
  
     return id;
       }

public int recuperarCantPeliculas(Connection conexion) throws SQLException {
    int i = 0;
          try{
             PreparedStatement consulta = conexion.prepareStatement("select id from pelicula");
             ResultSet resultado = consulta.executeQuery();
             while(resultado.next()){
                i++;
                System.out.println(i);
             }
             
          }catch(SQLException ex){
             return i;
          }
  
     return i;
       }

public int[] asd(Connection conexion) throws SQLException {
    int  i = 0;
          try{
             PreparedStatement consulta = conexion.prepareStatement("select id from pelicula");
             ResultSet resultado = consulta.executeQuery();
             while(resultado.next()){
                i++;
             }
             
          }catch(SQLException ex){
          }
  
     int [] b; 
     b = new int [i];
     int a = 0;
     try{
             PreparedStatement consulta = conexion.prepareStatement("select id from pelicula");
             ResultSet resultado = consulta.executeQuery();
             while(resultado.next()){
                b[a] = resultado.getInt("id");
                a++;
             }
             
          }catch(SQLException ex){
             return b;
          }
     System.out.println(Arrays.toString(b));
     return b;
       }

 public void eliminarPelicula(Connection conexion, Pelicula pelicula) throws SQLException{
      try{
         PreparedStatement consulta = conexion.prepareStatement("DELETE FROM pelicula WHERE id = ?");
         consulta.setInt(1, pelicula.getID());
         consulta.executeUpdate();
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
   }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;


public class Usuario {
    private int ID ;
    private String Nombre;
    private String Contraseña;
    private String Mail;
    private String Telefono;
    private String Tipo;
    
    public Usuario (int id, String nombre, String contraseña, String mail, String telefono){
        this.ID = id;
        this.Nombre = nombre;
        this.Contraseña = contraseña;
        this.Mail = mail;
        this.Telefono = telefono;
        this.Tipo= "Comun";
        
    }
    
    public Usuario (int id){
        this.ID = id;
        this.Nombre = Nombre;
        this.Contraseña = Contraseña;
        this.Mail = Mail;
        this.Telefono = Telefono;
    }
            
    public int getID()
        {
                return ID;
        }
    public void setID(int id)
        {
                this.ID = id;
        }
    
    public String getNombre()
        {
                return Nombre;
        }
    public void setNombre(String nombre)
        {
                this.Nombre = nombre;
        }
        
    public String getContraseña()
        {
                return Contraseña;
        }
    public void setContraseña(String contraseña)
        {
                this.Contraseña = contraseña;
        }
    
      public String getTelefono()
        {
                return Telefono;
        }
    public void setTelefono(String telefono)
        {
                this.Telefono = telefono;
        }
    public String getMail()
        {
                return Mail;
        }
    public void setMail(String mail)
        {
                this.Mail = mail;
        }
    public String getTipo()
        {
                return Tipo;
        }
    public void setTipo(String tipo)
        {
                this.Tipo = tipo;
        }
}

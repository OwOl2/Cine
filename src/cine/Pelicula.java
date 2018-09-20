/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

/**
 *
 * @author SD
 */
public class Pelicula  {
    int ID;
    String Nombre;
    String Banner;
    String Resumen;
    
   public Pelicula(int id, String nombre, String banner, String resumen){
        this.ID = id;
        this.Nombre = nombre ;
        this.Banner = banner;
        this.Resumen = resumen;
    }
   
    public Pelicula(){
        this.ID = 1;
        this.Nombre = "Titulo asdasd";
        this.Banner = "/Imagenes/4.jpg";
        this.Resumen= "este es el resumen que se va a agregar a la pelicula, si se quisiera agregar un resumen a la pelicula. seria este";
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
        
    public String getBanner()
        {
                return Banner;
        }
    public void setBanner(String contraseña)
        {
                this.Banner = contraseña;
        }
    
      public String getresumen()
        {
                return Resumen;
        }
    public void setResumen(String telefono)
        {
                this.Resumen = telefono;
        }
   
    
    
}

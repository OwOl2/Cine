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

public class Presentaciones {
    private int ID;
    private int Hora;
    private String dia;
    private int asientosDisp;
    private int asientosOcup;
    private int IDpelicula;

    public Presentaciones(int ID, int Hora, String dia, int asientosDisp, int asientosOcup, int IDpelicula) {
        this.ID = ID;
        this.Hora = Hora;
        this.dia = dia;
        this.asientosDisp = asientosDisp;
        this.asientosOcup = asientosOcup;
        this.IDpelicula = IDpelicula;
    }

    public int getID() {
        return ID;
    }

    public int getHora() {
        return Hora;
    }

    public String getDia() {
        return dia;
    }

    public int getAsientosDisp() {
        return asientosDisp;
    }

    public int getAsientosOcup() {
        return asientosOcup;
    }

    public int getIDpelicula() {
        return IDpelicula;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setHora(int Hora) {
        this.Hora = Hora;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setAsientosDisp(int asientosDisp) {
        this.asientosDisp = asientosDisp;
    }

    public void setAsientosOcup(int asientosOcup) {
        this.asientosOcup = asientosOcup;
    }

    public void setIDpelicula(int IDpelicula) {
        this.IDpelicula = IDpelicula;
    }
    
    
}

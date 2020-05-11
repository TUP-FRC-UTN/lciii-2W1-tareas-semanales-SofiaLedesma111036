/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

public class jugador {
    private String nombre;
    private int posicion;
    private int nroCamiseta;
    private int cantPartidosJugados;
    private int PorcentajeEstadoFisico;

  
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getNroCamiseta() {
        return nroCamiseta;
    }

    public void setNroCamiseta(int nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }

    public int getCantPartidosJugados() {
        return cantPartidosJugados;
    }

    public void setCantPartidosJugados(int cantPartidosJugados) {
        this.cantPartidosJugados = cantPartidosJugados;
    }

    public int getPorcentajeEstadoFisico() {
        return PorcentajeEstadoFisico;
    }

    public void setPorcentajeEstadoFisico(int PorcentajeEstadoFisico) {
        this.PorcentajeEstadoFisico = PorcentajeEstadoFisico;
    }
    
 

    public jugador(String nombre, int posicion,int nroCamiseta, int cantPartidosJugados, int PorcentajeEstadoFisico) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.nroCamiseta=nroCamiseta;
        this.cantPartidosJugados = cantPartidosJugados;
        this.PorcentajeEstadoFisico = PorcentajeEstadoFisico;
    }

    @Override
    public String toString() {
        return "jugador{" + "nombre=" + nombre + ", posicion=" + posicion + ", nroCamiseta=" + nroCamiseta + ", cantPartidosJugados=" + cantPartidosJugados + ", PorcentajeEstadoFisico=" + PorcentajeEstadoFisico + '}';
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author obdulia
 */
/*------------------------------------------------------*/
/*Autor : Obdulia Bastida Jiménez                       */
/*Fecha de modificación: 19 de marzo del 2018           */
/*Descripción: Tabla  Viaje   correspondiente a la      */
/*especificación de la aplicación web de los viajes     */ 
/*de practicas de la universidad de la sierra sur       */
/*------------------------------------------------------*/
public class Viaje {
    private int idViaje; 
    private String fechaInicio;
    private String fechaFin;
    private String nombre;
    private int presupuestoId;
    private String fechaCreacion;
    private String fechaActualizacion;
    private String fechaEliminacion;
    public void Viaje(){
        
    }

    public void setIdViaje(int idViaje) {
        this.idViaje = idViaje;
    }

    public int getIdViaje() {
        return idViaje;
    }
    

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }
    

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getFechaFin() {
        return fechaFin;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setPresupuestoId(int presupuestoId) {
        this.presupuestoId = presupuestoId;
    }

    public int getPresupuestoId() {
        return presupuestoId;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }
    

    public void setFechaActualizacion(String fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaEliminacion(String fechaEliminacion) {
        this.fechaEliminacion = fechaEliminacion;
    }

    public String getFechaEliminacion() {
        return fechaEliminacion;
    }

    
    
}

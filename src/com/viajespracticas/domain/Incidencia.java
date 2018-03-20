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
/*Descripción: Tabla Incidencia correspondiente a la   */
/*especificación de la aplicación web de los viajes     */ 
/*de practicas de la universidad de la sierra sur       */
/*------------------------------------------------------*/
public class Incidencia {
    private int idIncidencia;
    private String nombre;
    private int alumnoId;
    private int responsableId;
    private String descripcion;
    private String fechaCreacion;
    private String fechaActualizacion;
    private String fechaEliminacion;
    
    public void Viaje(){
        
    }

    public void setIdIncidencia(int idIncidencia) {
        this.idIncidencia = idIncidencia;
    }

    public int getIdIncidencia() {
        return idIncidencia;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    

    public void setAlumnoId(int alumnoId) {
        this.alumnoId = alumnoId;
    }

    public int getAlumnoId() {
        return alumnoId;
    }
   

    public void setResponsableId(int responsableId) {
        this.responsableId = responsableId;
    }

    public int getResponsableId() {
        return responsableId;
    }
    

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
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

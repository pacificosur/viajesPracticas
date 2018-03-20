/*------------------------------------------------------------*/
/*Autor: José Alberto Ruiz Cruz-------------------------------*/
/*Fecha:20/03/2018 -------------------------------------------*/
/*Descripción: POJO dirección---------------------------------*/
/*------------------------------------------------------------*/


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo;

import java.sql.Date;

/**
 *
 * @author slyfe
 */
public class Direccion {

    public int getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCreación() {
        return fechaCreación;
    }

    public void setFechaCreación(Date fechaCreación) {
        this.fechaCreación = fechaCreación;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public Date getFechaEliminacion() {
        return fechaEliminacion;
    }

    public void setFechaEliminacion(Date fechaEliminacion) {
        this.fechaEliminacion = fechaEliminacion;
    }
    private int idDireccion;
    private String nombre;
    private Date fechaCreación;
    private Date fechaActualizacion;
    private Date fechaEliminacion;
}

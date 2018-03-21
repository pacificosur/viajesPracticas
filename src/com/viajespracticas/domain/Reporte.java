/*------------------------------------------------------------*/
/* Autor: García García Araceli Edith*/
/* Fecha: 19/03/2018*/
/* Descripción: Pojo de la clase Reporte. La cual forma parte de la aplicación Web ViajesPracticas*/
/*------------------------------------------------------------*/

package viajePracticas;

import java.sql.Date;

public class Reporte {
	 private int idReporte;
	 private String nombre;
	 private int alumnoId;
	 private int responsableId;
	 private Date  fechaCreacion;
	 private Date  fechaActualizacion;
	 private Date  fechaEliminacion;
	 
	 public Reporte(){
		 
	 }

	public int getIdReporte() {
		return idReporte;
	}

	public void setIdReporte(int idReporte) {
		this.idReporte = idReporte;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAlumnoId() {
		return alumnoId;
	}

	public void setAlumnoId(int alumnoId) {
		this.alumnoId = alumnoId;
	}

	public int getResponsableId() {
		return responsableId;
	}

	public void setResponsableId(int responsableId) {
		this.responsableId = responsableId;
	}


	public Date getFechaCreacion() {
		return fechaCreacion;
	}


	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
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
}


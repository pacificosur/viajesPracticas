/*------------------------------------------------------------*/
/* Autor: Rolando Pedro Gabriel                               */
/* Fecha Creación: 16/03/2018                                 */
/* Fecha Modificación: 23/03/2018                             */
/* Descripción: Clase para modelar la entidad de Perfil       */
/* Correo: rolando.pedro.gabriel@gmail.com                    */
/*------------------------------------------------------------*/

public class Perfil {
	private int idPerfil;
	private String nombre;
	private Date fechaCreacion;
	private Date fechaActualizacion;
	private Date fechaEliminacion;

	public Perfil(){
	}

	public int getIdPerfil(){
		return this.idPerfil;
	}

	public void setIdPerfil(int idPerfil){
		this.idPerfil = idPerfil;
	}

	public String getNombre(){
		return this.nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public Date getFechaCreacion(){
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion){
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaActualizacion(){
		return this.fechaActualizacion;
	}

	public void setFechaActualizacion(Date fechaActualizacion){
		this.fechaActualizacion = fechaActualizacion;
	}

	public Date getFechaEliminacion(){
		return this.fechaEliminacion;
	}

	public void setFechaEliminacion(Date fechaEliminacion){
		this.fechaEliminacion = fechaEliminacion;
	}

/*------------------------------------------------------------*/
/* Autor: Rolando Pedro Gabriel                               */
/* Fecha: 16/03/2018                                          */
/* Descripción: Clase para modelar la entidad de Usuario      */
/* Correo: rolando.pedro.gabriel@gmail.com                    */
/*------------------------------------------------------------*/


public class Usuario {
	private int idUsuario;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private Date fechaNacimiento;
	private String email;
	private String sexo;
	private String usr;
	private pass;
	private String telefono;
	private String direccion;
	
	private Date fechaCreacion;
	private Date fechaActualizacion;
	private Date fechaEliminacion;

	/**
	 * Constructor de la clase.
	**/
	public Usuario(){
	}


	// Implementación de los GET's y SET's
	public int getIdUsuario(){
		return this.idUsuario;
	}

	public void setIdUsuario(int id){
					this.idUsuario = id;
	}

	
	public String getApellidoPaterno(){
		return this.apellidoPaterno;
	}

	public void setApellidoPaterno(String apellido){
					this.apellidoPaterno = apllido;
	}

	public String getApellidoMaterno(){
		return this.apellidoMaterno;
	}

	public void setApellidoMaterno(String apellido){
					this.apellidoMaterno = apellido;
	}

	
	public Date getFechaNacimiento(){
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fecha){
					this.fechaNacimiento = fecha;
	}
	
	public String getEmail(){
		return this.email;
	}

	public void setEmail(String email){
		this.email = email;
	}
	
	public String getSexo(){
		return this.sexo;
	}

	public void setSexo(Srtring sexo){
					this.sexo = sexo;
	}
	
	public String getUsr(){
		return this.usr;
	}

	public void setUsr(String usr){
					this.usr = usr;
	}
	
	public String getPass(){
		return this.pass;
	}

	public void setPass(String pass){
					this.pass = pass;
	}

	public String getTelefono(){
		return this.telefono;
	}

	public void setTelefono(String telefono){
		this.telefono = telefono;
	}

	public String getDireccion(){
		return this.direccion;
	}

	public void setDireccion(String direccion){
		this.direccion = direccion;
	}

	public Date getFechaCrecion(){
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
}

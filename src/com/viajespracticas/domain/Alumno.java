/*------------------------------------------------------------*/
/* Autor: García García Araceli Edith*/
/* Fecha: 19/03/2018*/
/* Descripción: Pojo de la clase Alumno. La cual forma parte de la aplicación Web ViajesPracticas*/
/*------------------------------------------------------------*/

class Alumno {
    
     private int idAlumno;
	 private String nombre;
	 private String apellidoPaterno;
	 private String apellidoMaterno;
	 private String matricula;
	 private String semestre;
	 private String carrera;
	 private int edad;
	 private String correoElectronico;
	 private Date  fechaNacimiento;
	 private Date  fechaCreacion;
	 private Date  fechaActualizacion;
	 private Date  fechaEliminacion;
	 
	 public Alumno(){
		 
	 }

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setEmail(String correoElectronico) {
		this.correoElectronico = this.correoElectronico;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
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

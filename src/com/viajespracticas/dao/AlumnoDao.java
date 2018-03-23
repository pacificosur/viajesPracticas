




public interface AlumnoDao{
	public List<Alumno> obtenerRegistros();
	public Alumno obtenerRegistro(Integer id);
	public void crearRegistro(Alumno alumno);
	public void actualizarRegistro(Alumno alumno);
	public void eliminarRegistro(Integer id);

}

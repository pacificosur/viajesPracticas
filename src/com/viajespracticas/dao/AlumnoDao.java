/*------------------------------------------------------------*/
/* Autor: García García Araceli Edith*/
/* Fecha: 30/03/2018*/
/* Descripción: CRUD de la entidad Alumno del proyecto viajesPracticas*/
/*------------------------------------------------------------*/

public interface AlumnoDao{
	public List<Alumno> obtenerRegistros();
	public Alumno obtenerRegistro(Integer id);
	public void crearRegistro(Alumno alumno);
	public void actualizarRegistro(Alumno alumno);
	public void eliminarRegistro(Integer id);

}

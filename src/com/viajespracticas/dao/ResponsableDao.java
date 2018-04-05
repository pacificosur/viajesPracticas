/*------------------------------------------------------------*/
/* Autor: García García Araceli Edith*/
/* Fecha: 30/03/2018*/
/* Descripción: CRUD de la entidad Responsable del proyecto viajesPracticas*/
/*------------------------------------------------------------*/

public interface ResponsableDao{
	public List<Responsable> obtenerRegistros();
	public Responsable obtenerRegistro(Integer id);
	public void crearRegistro(Responsable responsable);
	public void actualizarRegistro(Responsable responsable);
	public void eliminarRegistro(Integer id);

}
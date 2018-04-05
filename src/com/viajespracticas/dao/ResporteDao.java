/*------------------------------------------------------------*/
/* Autor: García García Araceli Edith*/
/* Fecha: 30/03/2018*/
/* Descripción: CRUD de la entidad Reporte del proyecto viajesPracticas*/
/*------------------------------------------------------------*/
public interface ReporteDao{
	public List<Reporte> obtenerRegistros();
	public Reporte obtenerRegistro(Integer id);
	public void crearRegistro(Reporte reporte);
	public void actualizarRegistro(Reporte reporte);
	public void eliminarRegistro(Integer id);

}
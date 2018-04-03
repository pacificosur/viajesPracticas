/*------------------------------------------------------------*/
/*Autor : Gracía Pérez Mireya Carmen                          */
/*Fecha de Creación: 28 de marzo del 2018                     */
/*Fecha de modificación: 2 de abril del 2018                  */
/*Descripción: interfaz de la EmpresaDao con sus métodos      */
/*------------------------------------------------------------*/
public interface EmpresaDao{
	public List<Empresa> obtenerRegistros();
	public Empresa obtenerRegistro(Integer id);
	public void crearRegistro(Empresa empresa);
	public void actualizarRegistro(Empresa empresa);
	public void eliminarRegistro(Integer id);
}


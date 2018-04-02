/*------------------------------------------------------------*/
/* Autor: José Alberto Ruiz Cruz                              */
/* Fecha: 02/04/2018                                          */
/* Fecha Modificación: 23/03/2018                             */
/* Correo: jarc.93.oax@gmail.com                              */
/* Descripción: Clase para modelar la interface Presupuesto      */
/*------------------------------------------------------------*/

public interface PresupuestoDao{
	public List<Presupuesto> obtenerRegistros();
	public Presupuesto obtenerRegistro (Integer id);
	public void crearRegistro(Presupuesto presupuesto);
	public void actualizarRegistro(Presupuesto presupuesto);
	public void eliminarRegistro(Presupuesto presupuesto);
}
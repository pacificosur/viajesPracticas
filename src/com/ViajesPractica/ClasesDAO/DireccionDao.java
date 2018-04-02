/*------------------------------------------------------------*/
/* Autor: José Alberto Ruiz Cruz                              */
/* Fecha: 02/04/2018                                          */
/* Fecha Modificación: 23/03/2018                             */
/* Correo: jarc.93.oax@gmail.com                              */
/* Descripción: Clase para modelar la interface Dirección      */
/*------------------------------------------------------------*/

public interface DireccionDao{
	public List<Direccion> obtenerRegistros();
	public Direccion obtenerRegistro (Integer id);
	public void crearRegistro(Direccion direccion);
	public void actualizarRegistro(Direccion direccion);
	public void eliminarRegistro(Direccion direccion);
}
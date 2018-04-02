/*------------------------------------------------------------*/
/* Autor: José Alberto Ruiz Cruz                              */
/* Fecha: 02/04/2018                                          */
/* Fecha Modificación: 23/03/2018                             */
/* Correo: jarc.93.oax@gmail.com                              */
/* Descripción: Clase para modelar la interface Contacto      */
/*------------------------------------------------------------*/

public interface ContactoDao{
	public List<Contacto> obtenerRegistros();
	public Contacto obtenerRegistro (Integer id);
	public void crearRegistro(Contacto contacto);
	public void actualizarRegistro(Contacto contacto);
	public void eliminarRegistro(Contacto contacto);
}
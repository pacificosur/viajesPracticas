/*------------------------------------------------------------*/
/* Autor: Rolando Pedro Gabriel                               */
/* Fecha: 22/03/2018                                          */
/* Fecha Modificación: 23/03/2018                             */
/* Correo: rolando.pedro.gabriel@gmail.com                    */
/* Descripción: Clase para modelar la interface Usuario       */
/*------------------------------------------------------------*/

public interface UsuarioDao {
	public List<Usuario> obtenerRegistros();
	public Usuario obtenerRegistro(Integer id);
	public void crearRegistro(Usuario usuario);
	public void actualizarRegistro(Usuario usuario);
	public void eliminarRegistro(Integer id);
}

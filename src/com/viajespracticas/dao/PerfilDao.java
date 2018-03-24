/*------------------------------------------------------------*/
/* Autor: Rolando Pedro Gabriel                               */
/* Fecha: 23/03/2018                                          */
/* Fecha Modificación: 23/03/2018                             */
/* Correo: rolando.pedro.gabriel@gmail.com                    */
/* Descripción: Clase para modelar la interface Perfil        */
/*------------------------------------------------------------*/

public interface PerfilDao {
	public List<Perfil> obtenerRegistros();
	public Perfil obtenerRegistro(Integer id);
	public void crearRegistro(Perfil perfil);
	public void actualizarRegistro(Perfil perfil);
	public void eliminarRegistro(Integer id);
}

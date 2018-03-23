/*Fecha de modificación 23/03/2018*/


public interface ContactoDao{
	public List<Perfil> obtenerRegistros();
	public Perfil obtenerRegistro(Integer id);
	public void crearRegistro(Perfil peerfil);
	public void actualizarRegistro(Perfil perfil);
	public void eliminarRegistro(integer id);
}

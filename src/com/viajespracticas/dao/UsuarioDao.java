public interface UsuarioDao {
	public List<Usuario> obtenerRegistros();
	public Usuario obtenerRegistro(Integer id);
	public void crearRegistro(Usuario usuario);
	public void actualizarRegistro(Usuario usuario);
	public void eliminarRegistro(Integer id);
}

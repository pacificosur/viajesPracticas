public interface EmpresaDao{
	public List<Empresa> obtenerRegistros();
	public Empresa obtenerRegistro(Integer id);
	public void crearRegistro(Empresa empresa);
	public void actualizarRegistro(Empresa empresa);
	public void eliminarRegistro(Integer id);
}


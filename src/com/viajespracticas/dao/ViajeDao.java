public interface ViajeDao{
	public List<Viaje> obtenerRegistros();
	public Viaje obtieneRegistro(Integer id);
	public void crearRegistro(Viaje viaje);
	public void actualizaRegistro(Viaje viaje);
	public void eliminarRegistro(Integer id);
}

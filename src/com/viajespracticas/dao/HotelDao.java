/*------------------------------------------------------------*/
/*Autor : Gracía Pérez Mireya Carmen                          */
/*Fecha de Creación: 28 de marzo del 2018                     */
/*Fecha de modificación: 2 de abril del 2018                  */
/*Descripción: interfaz de la HotelDao con sus métodos        */
/*------------------------------------------------------------*/
public interface HotelDao{
	public List<Hotel> obtenerRegistros();
	public Hotel obtenerRegistro(Integer id);
	public void crearRegistro(Hotel hotel);
	public void actualizarRegistro(Hotel hotel);
	public void eliminarRegistro(Integer id);
}

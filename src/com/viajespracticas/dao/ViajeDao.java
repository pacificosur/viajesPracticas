/*------------------------------------------------------------*/
/*			Universidad de la Sierra Sur          */
/*Autor:Bastida Jiménez Obdulia	                              */								  
/*Fecha de ceración: 31 de marzo 2018                         */
/*Fecha de modificación: 2 de marzo 2018                      */
/*Correo: obdulia.bjimenez@gmail.com     		      */
/*Descripción: Dao de la clase Viaje en el cual se declaran   */
/*los métos de ontener, crear, actualizar y eliminar datos de */ 
/*la aplicación web de viajes de práticas.		      */
/*------------------------------------------------------------*/	


public interface ViajeDao{
	public List<Viaje> obtenerRegistros();
	public Viaje obtieneRegistro(Integer id);
	public void crearRegistro(Viaje viaje);
	public void actualizaRegistro(Viaje viaje);
	public void eliminarRegistro(Integer id);
}
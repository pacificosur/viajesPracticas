/*------------------------------------------------------------*/
/*			Universidad de la Sierra Sur          */
/*Autor:Bastida Jiménez Obdulia				      */								  
/*Fecha de ceración: 31 de marzo 2018   		      */
/*Fecha de modificación: 2 de marzo 2018		      */
/*Correo: obdulia.bjimenez@gmail.com     		      */
/*Descripción: Dao de la clase Incidencia en el cual se decla-*/
/*ran los métos de obntener, crear, actualizar y eliminar     */ 
/*datos de la aplicación web de viajes de práticas.           */
/*------------------------------------------------------------*/	



public interface IncidenciaDao{
	public List<Incidencia> obtenerRegistros();
	public Viaje obtieneRegistro(Integer id);
	public void crearRegistro(Incidencia incidencia);
	public void actualizaRegistro(Incidencia incidencia);
	public void eliminarRegistro(Integer id);
}
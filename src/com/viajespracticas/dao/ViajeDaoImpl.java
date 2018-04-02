/*------------------------------------------------------------*/
/*			Universidad de la Sierra Sur			   		  */
/*Autor:Bastida Jiménez Obdulia								  */								  
/*Fecha de ceración: 31 de marzo 2018   					  */
/*Fecha de modificación: 2 de marzo 2018					  */
/*Descripción: Implemetación de clase Viaje de los metodos    */
/*obntener, crear, actualizar y eliminar datos de la          */ 
/*aplicación web de viajes de práticas.		        		  */
/*------------------------------------------------------------*/

public class ViajeDaoImpl implements ViajeDao{
	private Connection connection;
	private PrepareStatement statement;
	private ResultSet resultSet;
	private String query;

	@Override
	public List<Viaje> obtenerRegistros(){
		ArrayList<Viaje> listaRegistro = new ArrayList<>();
		try{
			connection = new Connection().getConnection();
			query = "SELECT * FROM Viaje";

			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);

			while(resultSet.next()){
				Viaje viaje = new Viaje();
				viaje.setIdViaje(resultSet.getInt("idViaje"));
				viaje.setFechaInicio(resultSet.getString("fechaInicio"));
				viaje.setFechaFin(resultSet.getString("fechaFin"));
				viaje.setNombre(resultSet.getString("nombre"));
				viaje.setPresupuestoId(resultSet.getInt("presupuesto"));
				viaje.setFechaCheacion(resultSet.getString("fechaCreacion"));
				viaje.setFechaModificacion(resultSet.getString("fechaModificacion"));
				viaje.setFechaEliminacion(resultSet.getString("fechaEliminacion"));

				listaRegistro.add(viaje);
			}
			resultSet.close();
			statement.close();
			connection.close();
			return listaRegistro;
		}catch(Exception e){
			return null;
		}
	}

	@Override
	public Viaje obtenerRegistro(Integer id){
		Viaje viaje;
		try{
			connection = new Connection().getConnection();
			query = "SELECT * FROM Viaje WHERE idPerfil=?";

			statement = connection.createStatement();
			statement.setPrepare
			resultSet = statement.executeQuery(query);

			while(resultSet.next()){
				Viaje.viaje = new Viaje();
				viaje.setId(resultSet.getInt("idViaje"));
				viaje.setFechaInicio(resultSet.getString("fechaInicio"));
				viaje.setFechaFin(resultSet.getString("fechaFin"));
				viaje.setNombre(resultSet.getString("nombre"));
				viaje.setPresupuestoId(resultSet.getInt("presupuesto"));
				viaje.setFechaCheacion(resultSet.getString("fechaCreacion"));
				viaje.setFechaModificacion(resultSet.getString("fechaModificacion"));
				viaje.setFechaEliminacion(resultSet.getString("fechaEliminacion"));

				listaRegistro.add(viaje);
			}
			resultSet.close();
			statement.close();
			connection.close();
			return listaRegistro;
		}catch(Exception e){
			return null;
		}
	}

	public List<Viaje> crearRegistro(Viaje viaje){
		Viaje viaje;
		try{
			connection = new Connection().getConnection();
			query = "INSERT INTO Viaje values("+idViaje+", '"+fechaInicio+"', '"+fechaFin+"', '"+nombre+"', "+presupuesto+", '"+fechaCreacion+"', '"+fechaModificacion+"', '"+fechaEliminacion+"');";

			statement = connection.createStatement();
			statement.executeUpdate(query);

			statement.close();
			connection.close();
			
		}catch(Exception e){
			return null;
		}
	}

	public List<Viaje> actualizarRegistro(Viaje viaje){
		Viaje viaje;
		try{
			connection = new Connection().getConnection();
			query = "UPDATE Viaje set fechaInicio='"+fechaInicio+"', set fechaFin='"+fechaFin+"set nombre= '"+nombre+"', set presupuesto="+presupuesto+", set fechaCreacion'"+fechaCreacion+"', set FechaModificacion='"+fechaModificacion+"', setFechaEliminacion'"+fechaEliminacion+"' where idViaje="+idViaje+";";

			statement = connection.createStatement();
			statement.executeUpdate(query);

			statement.close();
			connection.close();
			
		}catch(Exception e){
			return null;
		}
	}
	public List<Viaje> eliminarRegistro(Integer id){
		Viaje viaje;
		try{
			connection = new Connection().getConnection();
			query = "DELETE from Viaje where idViaje="+idViaje+";";

			statement = connection.createStatement();
			statement.executeUpdate(query);

			statement.close();
			connection.close();
			
		}catch(Exception e){
			return null;
		}
	}

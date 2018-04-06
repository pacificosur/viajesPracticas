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
			query = "SELECT * FROM Viaje WHERE idViaje=?";

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
			query = "INSERT INTO Viaje(idViaje, fechaInicio, fechaFin, nombre, presupuesto, fechaCreacion, fechaModificacion, fechaEliminacion)"
			+"values(?,?,?,?,?,?,?,?)";

			statement = connection.prepareStatement();
			statement.setInt(1, viaje.getIdViaje());
			statement.setDate(2, (Date)viaje.getFechaInico());
			statement.setDate(3, (Date)viaje.getFechaFin());
			statement.setString(4, viaje.getNombre());
			statement.setInt(5, viaje.getPresupuesto());
			statement.setDate(6, (Date)viaje.getFechaCreacion());
			statement.setDate(7, (Date)viaje.getFechaModificacon());
			statement.setDate(8, (Date)viaje.getFechaEliminacion());

			statement.executeUpdate(query);
			resultSet.close();
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
			query = "UPDATE Viaje set fechaInicio=?, fechaFin=?, nombre=?, presupuesto=?, fechaCreacion=?, set FechaModificacion=?, setFechaEliminacion=? where idViaje=?;";

			statement = connection.createStatement();
			statement.setDate(1, (Date)viaje.getFechaInico());
			statement.setDate(2, (Date)viaje.getFechaFin());
			statement.setString(3, viaje.getNombre());
			statement.setInt(4, viaje.getPresupuesto());
			statement.setDate(5, (Date)viaje.getFechaCreacion());
			statement.setDate(6, (Date)viaje.getFechaModificacon());
			statement.setDate(7,(Date) viaje.getFechaEliminacion());
			statement.setInt(8, viaje.getIdViaje());

			statement.executeUpdate(query);

			resultSet.close();
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
			query = "DELETE from Viaje where idViaje=?;";

			statement = connection.createStatement();
			statement.setInt(1, id);
			statement.executeUpdate(query);

			resultSet.close();
			statement.close();
			connection.close();
			
		}catch(Exception e){
			return null;
		}
	}

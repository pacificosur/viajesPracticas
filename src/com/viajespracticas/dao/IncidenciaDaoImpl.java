/*------------------------------------------------------------*/
/*			Universidad de la Sierra Sur			   		  */
/*Autor:Bastida Jiménez Obdulia								  */								  
/*Fecha de ceración: 31 de marzo 2018   					  */
/*Fecha de modificación: 2 de marzo 2018					  */
/*Descripción: Implemetación de clase Incidencia  de los      */
/*metodos obntener, crear, actualizar y eliminar datos de     */ 
/*la aplicación web de viajes de práticas.		     		  */
/*------------------------------------------------------------*/	


public class IncidenciaDaoImpl implements IncidenciaDao{
	private Connection connection;
	private PrepareStatement statement;
	private ResultSet resultSet;
	private String query;

	@Override
	public List<Incidencia> obtenerRegistros(){
		ArrayList<Incidencia> listaRegistro = new ArrayList<>();
		try{
			connection = new Connection().getConnection();
			query = "SELECT * FROM Incidencia";

			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);

			while(resultSet.next()){
				Incidencia incidencia = new Incidencia();
				incidencia.setIdIncidencia(resultSet.getInt("idIncidencia"));
				incidencia.setNombre(resultSet.getString("nombre"));
				incidencia.setAlumno(resultSet.getInt("Alumno"));
				incidencia.setResponsable(resultSet.getInt("Responsable"));
				incidencia.setDescripcion(resultSet.getString("Descripcion"));
				incidencia.setFechaCheacion(resultSet.getString("fechaCreacion"));
				incidencia.setFechaModificacion(resultSet.getString("fechaModificacion"));
				incidencia.setFechaEliminacion(resultSet.getString("fechaEliminacion"));


				listaRegistro.add(incidencia);
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
		Incidencia incidencia;
		try{
			connection = new Connection().getConnection();
			query = "SELECT * FROM Incidencia WHERE idIncidencia=?";

			statement = connection.createStatement();
			statement.setPrepare
			resultSet = statement.executeQuery(query);

			while(resultSet.next()){
				Incidencia.incidencia = new Incidencia();
				incidencia.setIdIncidencia(resultSet.getInt("idIncidencia"));
				incidencia.setNombre(resultSet.getString("nombre"));
				incidencia.setAlumno(resultSet.getInt("Alumno"));
				incidencia.setResponsable(resultSet.getInt("Responsable"));
				incidencia.setDescripcion(resultSet.getString("Descripcion"));
				incidencia.setFechaCheacion(resultSet.getString("fechaCreacion"));
				incidencia.setFechaModificacion(resultSet.getString("fechaModificacion"));
				incidencia.setFechaEliminacion(resultSet.getString("fechaEliminacion"));

				listaRegistro.add(incidencia);
			}
			resultSet.close();
			statement.close();
			connection.close();
			return listaRegistro;
		}catch(Exception e){
			return null;
		}
	}	

	public List<Incidencia> crearRegistro(Incidencia incidencia){
		Incidencia incidencia;
		try{
			connection = new Connection().getConnection();
			query = "INSERT INTO Incidencia values("+idIcidencia+", '"+nombre+"', "+alumno+", "+responsable+", '"+descripcion+"', '"+fechaCreacion+"', '"+fechaModificacion+"', '"+fechaEliminacion+"');";

			statement = connection.createStatement();
			statement.executeUpdate(query);

			statement.close();
			connection.close();
			
		}catch(Exception e){
			return null;
		}
	}

	public List<Incidencia> actualizarRegistro(Incidencia incidencia){
		Incidencia incidencia;
		try{
			connection = new Connection().getConnection();
			query = "UPDATE Incidencia set nombre= '"+nombre+"', set alumno="+alumno+", set responsable="+responsable+", set descripcion='"+descripcion+"', set fechaCreacion'"+fechaCreacion+"', set FechaModificacion='"+fechaModificacion+"', setFechaEliminacion'"+fechaEliminacion+"' where idIncidencia="+idIncidencia+";";

			statement = connection.createStatement();
			statement.executeUpdate(query);

			statement.close();
			connection.close();
			
		}catch(Exception e){
			return null;
		}
	}
	public List<Incidencia> eliminarRegistro(Integer id){
		Incidencia incidencia;
		try{
			connection = new Connection().getConnection();
			query = "DELETE from Incidencia where idIncidencia="+idIncidencia+";";

			statement = connection.createStatement();
			statement.executeUpdate(query);

			statement.close();
			connection.close();
			
		}catch(Exception e){
			return null;
		}
	}

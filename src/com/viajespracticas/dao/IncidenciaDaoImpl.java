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
	private PrepareStatement declaracion;
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
			

		query =  " INSERT INTO Incidencia (idIcidencia, nombre, alumno, responsable, descripcion, fechaCreacion, fechaModificacion, fechaEliminacion) " 
		+  " VALUES (?,?,?,?,?,?,?,?) " ;

			declaración =  conexión . PrepareStatement (consulta);
		

			declaración.setInt ( 1 , incidencia.getIdIncidencia());
        	declaración.setString ( 2 , incidencia.getNombre());
        	declaración.setInt ( 3 , incidencia.getAlumno());
        	declaración.setInt ( 4 , incidencia.getResponsable());
        	declaración.setString ( 5 , incidencia.getDescripcion());
        	declaración.setString ( 6 , (Date)incidencia.getFechaCreacion());
        	declaración.setString ( 7 , (Date)incidencia.getFechaAtualizacion());
        	declaración.setString ( 8 , (Date)incidencia.getFechaEliminacion());


			
			statement.executeUpdate(query);
			resultSet.close();
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
			query = "UPDATE Incidencia set nombre=?, alumno=?, responsable=?, descripcion=?, fechaCreacion=?, FechaModificacion=?, FechaEliminacion=? where idIncidencia=?";

        	declaración.setString (1 , incidencia.getNombre());
        	declaración.setInt (2 , incidencia.getAlumno());
        	declaración.setInt (3 , incidencia.getResponsable());
        	declaración.setString (4 , incidencia.getDescripcion());
        	declaración.setString (5 , (Date)incidencia.getFechaCreacion());
        	declaración.setString (6 , (Date)incidencia.getFechaAtualizacion());
        	declaración.setString (7 , (Date)incidencia.getFechaEliminacion());
        	declaración.setInt (8 , incidencia.getIdIncidencia());
		
			statement = connection.createStatement();
			statement.executeUpdate(query);
			resultSet.close();
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
			query = "DELETE from Incidencia where idIncidencia=?";
			
			statement.setString(1, idIncidencia);

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

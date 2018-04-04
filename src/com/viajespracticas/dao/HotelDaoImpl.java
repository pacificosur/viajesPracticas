/*------------------------------------------------------------*/
/*Autor : Gracía Pérez Mireya Carmen                          */
/*Fecha de Creación: 28 de marzo del 2018                     */
/*Fecha de modificación: 3 de abril del 2018                  */
/* Correo Electrónico: mire12car34@gmail.com                  */
/*Descripción: interfaz de la hotelDaoImpl con sus métodos    */
/*par la inserisión, actualización y eliminación de los datos */
/*a la base de datos                                          */
/*------------------------------------------------------------*/

public class HotelDaoImpl implements HotelDao{
	private Connection connection;
	private PrepareStatement statement;
	private ResultSet resulSet;
	private String query;

	@Override
	public List<Hotel> obtenerRegistros(){
		ArrayList<Hotel> listaRegistro = new ArrayList<>();
		try{
			connection =new Conexion().getConnection();
			query="SELECT * from Hotel";

			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
			
			while(resulSet.next()){
				Hotel hotel=new Hotel();
				// nombre que esta dentro del paraentesis debe ser igual a la que esta a la 
				// base de datos
				hotel.setIdEmpresa(resultSet.getInt("idHotel"));
				listaRegistro.add(hotel);
			}
			resulSet.close();
			statement.close();
			connection.close();
			return listaRegistro;
		}
		catch(Exception e){
		return null;
		}
	}


	@Override
	public Hotel obtenerRegistro(Integer id){
		Hotel hotel;
		try{
			connection =new Conexion().getConnection();
			query="SELECT * from Hotel where idHotel=?";

			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
			
			while(resulSet.next()){
				Hotel hotel=new Hotel();
				// nombre que esta dentro del paraentesis debe ser igual a la que esta a la 
				// base de datos
				hotel.setIdHotel(resultSet.getInt("idHotel"));
				hotel.setNombre(resultSet.getString("nombre"));
				hotel.setDireccionId(resultSet.getInt("direccionId"));
				hotel.setNumeroCuartos(resultSet.getInt("numerocuartos"));
				hotel.setServicios(resultSet.getString("servicios"));
				hotel.setCosto(resultSet.getDouble("costo"));
				hotel.setTelefono(resultSet.getString("telefono"));
				hotel.setCorreoElectronico(resultSet.getString("correoElectronico"));
				hotel.setSitioWeb(resultSet.getString("sitioWeb"));
				hotel.setDirector(resultSet.getString("director"));
				hotel.setFechaCreacion(resultSet.getString("fechaCreacion"));
				hotel.setFechaActualizacion(resultSet.getString("fechaAtualizacion"));
				hotel.setFechaEliminacion(resultSet.getString("fechaEliminacion"));

				listaRegistro.add(hotel);
			
			}

			resulSet.close();
			statement.close();
			connection.close();
			return listaRegistro;
		}
		catch(Exception e){
			return null;
		}

	}



	@Override
	public void crearRegistro(Hotel hotel){
        
		try{
			connection =new Conexion().getConnection();
			query = "INSERT INTO Hotel (idHotel, nombre, direccionId, numerocuartos, servicios, costo, telefono, correoElectronico," 
										+"sitioWeb, director, fechaCreacion, fechaAtualizacion, fechaEliminacion)"
										+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

			statement = connection.PrepareStatement(query);
			//resultSet = PrepareStatement.executeQuery(query);
			statement.setString(1, hotel.idHotel);
        		statement.setString(2, hotel.nombre);
        		statement.setString(3, hotel.direccionId);
        		statement.setString(4, hotel.numerocuartos);
        		statement.setString(5, hotel.servicios);
        		statement.setString(6, hotel.costo);
        		statement.setString(7, hotel.telefono);
        		statement.setString(8, hotel.correoElectronico);
        		statement.setString(9, hotel.sitioWeb);
        		statement.setString(10, hotel.director);
        		statement.setString(11, hotel.fechaCreacion);
        		statement.setString(12, hotel.fechaAtualizacion);
        		statement.setString(13, hotel.fechaEliminacion);

			resultSet =statement.executeUpdate();

			resulSet.close();
			statement.close();
			connection.close();

			//return resultSet;
		}
		catch(Exception e){
			return null;
		}

	}

	@Override
	public void actualizarRegistro(Hotel hotel){
		try{
			connection =new Conexion().getConnection();
			query = "UPDATE Hotel SET nombre=?, direccionId=?, numerocuartos=?, servicios=?, costo=?, telefono=?," 
					+ "correoElectronico=?, sitioWeb=?, director=?, fechaCreacion=?, fechaAtualizacion=?, fechaEliminacion=?"
                    + "WHERE idHotel=?";

        	statement = connection.PrepareStatement(query);
        	
        	statement.setString(1, hotel.nombre);
        	statement.setString(2, hotel.direccionId);
        	statement.setString(3, hotel.numerocuartos);
        	statement.setString(4, hotel.servicios);
        	statement.setString(5, hotel.costo);
        	statement.setString(6, hotel.telefono);
        	statement.setString(7, hotel.correoElectronico);
        	statement.setString(8, hotel.sitioWeb);
        	statement.setString(9, hotel.director);
        	statement.setString(10, hotel.fechaCreacion);
        	statement.setString(11, hotel.fechaAtualizacion);
        	statement.setString(12, hotel.fechaEliminacion);	

        	resultSet =statement.executeUpdate();

			resulSet.close();
			statement.close();
			connection.close();
		}
		catch(Exception e){
			return null;
		}	                    
	}


	@Override
	public void eliminarRegistro(Integer id){
		Hotel hotel;
		try{
			connection =new Conexion().getConnection();
			query = "DELETE FROM Hotel WHERE idHotel = ?";

        		statement = connection.PrepareStatement(query);
        	         
        		statement.setString(1, hotel.idHotel);	

        		resultSet =statement.executeUpdate();

			resulSet.close();
			statement.close();
			connection.close();
		}
		catch(Exception e){
			return null;
		}

	}	
}

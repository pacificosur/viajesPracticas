/*------------------------------------------------------------*/
/*Autor : Gracía Pérez Mireya Carmen                          */
/*Fecha de Creación: 28 de marzo del 2018                     */
/*Fecha de modificación: 3 de abril del 2018                  */
/*Correo Electronico: mire12car34@gmail.com                   */
/*Descripción: interfaz de la EmpresaDao con sus métodos      */
/*par la inserisión, actualización y eliminación de los datos */
/*a la base de datos                                          */
/*------------------------------------------------------------*/

public class EmpresaDaoImpl implements EmpresaDao{
	private Connection connection;
	private PrepareStatement statement;
	private ResultSet resulSet;
	private String query;

	@Override
	public List<Empresa> obtenerRegistros(){
		ArrayList<Empresa> listaRegistro = new ArrayList<>();
		try{
			connection =new Conexion().getConnection();
			query="SELECT * from Empresa";

			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
			
			while(resulSet.next()){
				Empresa empresa=new Empresa();
				// nombre que esta dentro del paraentesis debe ser igual a la que esta a la 
				// base de datos
				empresa.setIdEmpresa(resultSet.getInt("idEmpresa"));
				listaRegistro.add(empresa);
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
	public Empresa obtenerRegistro(Integer id){
		Empresa empresa;
		try{
			connection =new Conexion().getConnection();
			query="SELECT * from Empresa where idEmpresa=?";

			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
			
			while(resulSet.next()){
				Empresa empresa=new Empresa();
				// nombre que esta dentro del paraentesis debe ser igual a la que esta a la 
				// base de datos
				empresa.setIdEmpresa(resultSet.getInt("idEmpresa"));
				empresa.setNombre(resultSet.getString("nombre"));
				empresa.setCategoria(resultSet.getString("categoria"));
				empresa.setGerente(resultSet.getString("gerente"));
				empresa.setDireccionId(resultSet.getInt("direccionId"));
				empresa.setContactoId(resultSet.getString("contactoId"));
				empresa.setFechaCreacion(resultSet.getString("fechaCreacion"));
				empresa.setFechaActualizacion(resultSet.getString("fechaAtualizacion"));
				empresa.setFechaEliminacion(resultSet.getString("fechaEliminacion"));
				
				
				listaRegistro.add(empresa);
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
	public void crearRegistro(Empresa empresa){
        	
		Empresa empresa;
		
		try{
			connection =new Conexion().getConnection();
			query = "INSERT INTO Empresa (idEmpresa, nombre, categoria, gerente, direccionId, contactoId," 
					+"fechaCreacion, fechaAtualizacion, fechaEliminacion)"+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

			statement = connection.PrepareStatement(query);
			//resultSet = PrepareStatement.executeQuery(query);
			statement.setString(1, empresa.idEmpresa);
        		statement.setString(2, empresa.nombre);
        		statement.setString(3, empresa.categoria);
        		statement.setString(4, empresa.gerente);
        		statement.setString(5, empresa.direccionId);
        		statement.setString(6, empresa.contactoId);
        		statement.setString(7, empresa.fechaCreacion);
        		statement.setString(8, empresa.fechaAtualizacion);
        		statement.setString(9, empresa.fechaEliminacion);

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
	public void actualizarRegistro(Empresa empresa){
		
		try{
			connection =new Conexion().getConnection();
			query = "UPDATE Empresa SET nombre=?, categoria=?, gerente=?, direccionId=?, contactoId=?, fechaCreacion=?, fechaAtualizacion=?, fechaEliminacion=? "
                    + "WHERE idEmpresa=?";

        		statement = connection.PrepareStatement(query);
        	
        		statement.setString(1, empresa.nombre);
        		statement.setString(2, empresa.categoria);
        		statement.setString(3, empresa.gerente);
        		statement.setString(4, empresa.direccionId);
        		statement.setString(5, empresa.contactoId);
        		statement.setString(6, empresa.fechaCreacion);
        		statement.setString(7, empresa.fechaAtualizacion);
        		statement.setString(8, empresa.fechaEliminacion);	

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
		
		Empresa empresa;

		try{
			connection =new Conexion().getConnection();
			query = "DELETE FROM Empresa WHERE idEmpresa = ?";

        		statement = connection.PrepareStatement(query);
        	         
        		statement.setString(1, empresa.idEmpresa);	

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

/*------------------------------------------------------------*/
/* Autor: José Alberto Ruiz Cruz                              */
/* Fecha: 02/04/2018                                          */
/* Fecha Modificación: 23/03/2018                             */
/* Correo: jarc.93.oax@gmail.com                              */
/* Descripción: Clase para modelar la interface Contacto      */
/*------------------------------------------------------------*/

public class ContactoDaoImpl implements ContactoDao {
	private Connection connection;
	private PrepareStatement statement;
	private ResultSet resultSet;
	private String query;

	@Override
	public List<Contacto> obtenerRegistros() {
		ArrayList<Contacto> listaRegistro = new ArrayList<>();
		try {
			connection = new Conexion().getConnection();
			query = "SELECT * FROM Contacto";

			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);

			while(resultSet.next()){
				Contacto contacto = new Contacto();
				contacto.setId(resultSet.getInt("idContacto");
				contacto.setNombre(resultSet.getString("nombre"));
				contacto.setApellidoPaterno(resultSet.getString("apellidoPaterno"));
				contacto.setApellidoMaterno(resultSet.getString("apellidoMaterno"));
				contacto.setTelefono(resultSet.getString("telefono"));
				contacto.setFechaCreación("fechaCreacion");
				contacto.setFechaActualización("fechaActualizacion");
				contacto.setFechaEliminación("fechaEliminacion");
				listaRegistro.add(contacto);
			}
			resultSet.close();
			statement.close();

			return listaRegistro;
		} catch(Exception e) {
			return null;
		}
	}
	@Override
	public Contacto obtenerRegistro(Integer id) {
		Contacto contacto;
		try{
			connection = Conexion().getConnection();
			query = "SELECT * From Contacto WHERE idContacto =?";
			statement = connection.prepareStatement(query);

			statement.setInt(1, id);
			resultSet = statement.executeQuery();

			if(resultSet.next()) {
				contacto = new Contacto();
				contacto.setId(resultSet.getInt("idContacto");
				contacto.setNombre(resultSet.getString("nombre"));
				contacto.setApellidoPaterno(resultSet.getString("apellidoPaterno"));
				contacto.setApellidoMaterno(resultSet.getString("apellidoMaterno"));
				contacto.setTelefono(resultSet.getString("telefono"));
				contacto.setFechaCreación("fechaCreacion");
				contacto.setFechaActualización("fechaActualizacion");
				contacto.setFechaEliminación("fechaEliminacion");

			}
			resultSet.close();
			statement.close();
			return contacto;
		} catch(Exception e) {
			return null;
		}
	}

  @Override
	public void crearRegistro(Contacto contacto) {
		try {
			connection = new Conexion().getConnection();
			query = "INSERT INTO Contacto(nombre, apellidoPaterno, apellidoMaterno, telefono , fechaCreacion,fechaActualizacion, fechaEliminacion) VALUES(?, ?,?, ?,?, ?,?)";

			statement = connection.prepareStatement(query);
			statement.setString(1, contacto.getNombre());
			statement.setString(2, contacto.getApellidoPaterno());
			statement.setString(3, contacto.getApellidoMaterno());
			statement.setString(4, contacto.getTelefono());
			statement.setString(5, contacto.getFechaCreación());
			statement.setString(6, contacto.getFechaActualización());
			statement.setString(7, contacto.getFechaEliminación());
			statement.executeUpdate();

			statement.close();
		} catch(Exception e) {
			return null;
		}
	}

	@Override
	public void actualizarRegistro (Contacto contacto) {
		try {
			connection = new Conexion().getConnection();
			query = "UPDATE Contacto SET nombre = ?, apellidoPaterno = ?,apellidoMaterno = ?, telefono =?, fechaCreacion = ?, fechaEliminacion = ?, fechaEliminacion = ? WHERE idContacto = ?";
			statement = connection.prepareStatement(query);
			statement.setString(1, contacto.getNombre());
			statement.setString(2, contacto.getApellidoPaterno());
			statement.setString(3, contacto.getApellidoMaterno());
			statement.setString(4, contacto.getTelefono());
			statement.setString(5, contacto.getFechaCreación());
			statement.setString(6, contacto.getFechaActualización());
			statement.setString(7,contacto.getFechaEliminación());
			statement.setInt(8, contacto.getId());
			statement.executeUpdate();

			statement.close();
		} catch(Exception e) {
			return null;
		}
	}

	@Override
	public void eliminarRegistro(Integer i) {
		try {
			connection = new Conexion().getConnection();
			query = "DELETE FROM Contacto WHERE idContacto = ?";

			statement = connection.prepareStatement(query);
			statement.setInt(1, contacto.getId());
			statement.executeUpdate();

			statement.close();
		} catch(Exception e) {
			return null;
		}
	}
}
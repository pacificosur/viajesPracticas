/*------------------------------------------------------------*/
/* Autor: Rolando Pedro Gabriel                               */
/* Fecha: 22/03/2018                                          */
/* Fecha Modificación: 23/03/2018                             */
/* Correo: rolando.pedro.gabriel@gmail.com                    */
/* Descripción: Clase para modelar la implementación Usuario  */
/*------------------------------------------------------------*/

public class UsuarioDaoImpl implements UsuarioDao {
	private Connection connection;
	private PrepareStatement statement;
	private ResultSet resultSet;
	private String query;

	@Override
	public List<Usuario> obtenerRegistros() {
		ArrayList<Usuario> listaRegistro = new ArrayList<>();
		try {
			connection = new Conexion().getConnection();
			query = "SELECT * FROM Usuario";

			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);

			while(resultSet.next()){
				Usuario usuario = new Usuario();
				usuario.setId(resultSet.getInt("idUsuario");
				usuario.setNombre(resultSet.getString("nombre"));

				listaRegistro.add(usuario);
			}
			resultSet.close();
			statement.close();

			return listaRegistro;
		} catch(Exception e) {
			return null;
		}
	}
	@Override
	public Usuario obtenerRegistro(Integer id) {
		Usuario usuario;
		try{
			connection = Conexion().getConnection();
			query = "SELECT * From Usuario WHERE idUsuario =?";
			statement = connection.prepareStatement(query);

			statement.setInt(1, id);
			resultSet = statement.executeQuery();

			if(resultSet.next()) {
				usuario.setNombre(resultSet.getString("nombre"));
				usuario.setApellido(resultSet.getString("apellido"));
				// Configurar los demás
			}

			resultSet.close();
			statement.close();
			return usuario;
		} catch(Exception e) {
			return null;
		}
	}

  @Override
	public void crearRegistro(Usuario usuario) {
		try {
			connection = new Conexion().getConnection();
			query = "INSERT INTO Usuario(nombre, apellido) VALUES(?, ?)";

			statement = connection.prepareStatement(query);
			statement.setString(1, usuario.getNombre());
			statement.setString(2, usuario.getApellido());
			statement.executeUpdate();

			statement.close();
		} catch(Exception e) {
			return null;
		}
	}

	@Override
	public void actualizarRegistro (Usuario usuario) {
		try {
			connection = new Conexion().getConnection();
			query = "UPDATE Usuario SET nombre = ?, apellido = ? WHERE idUsuario = ?";

			statement = connection.prepareStatement(query);
			statement.setString(1, usuario.getNombre());
			statement.setString(2, usuario.getApellido());
			statement.setInt(3, usuario.getId());
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
			query = "DELETE FROM Usuario WHERE idUsuario = ?";

			statement = connection.prepareStatement(query);
			statement.setInt(1, usuario.getId());
			statement.executeUpdate();

			statement.close();
		} catch(Exception e) {
			return null;
		}
	}
}

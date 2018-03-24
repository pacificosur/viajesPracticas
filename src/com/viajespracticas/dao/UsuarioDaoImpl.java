/*------------------------------------------------------------*/
/* Autor: Rolando Pedro Gabriel                               */
/* Fecha: 22/03/2018                                          */
/* Fecha Modificación: 23/03/2018                             */
/* Correo: rolando.pedro.gabriel@gmail.com                    */
/* Descripción: Clase para modelar la implementación Usuario  */
/*------------------------------------------------------------*/

public class UsuarioDaoImpl implements UsuarioDao {
	private Connection connection;
	private Statement statement;
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

				listaRegistro.add(usuario);
			}
			resultSet.close();
			statement.close();
			connection.close();
			return listaRegistro;
		} catch(Exception e) {
			return null;
		}
	}

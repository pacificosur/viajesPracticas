/*------------------------------------------------------------*/
/* Autor: Rolando Pedro Gabriel                               */
/* Fecha: 23/03/2018                                          */
/* Correo: rolando.pedro.gabriel@gmail.com                    */
/* Descripción: Clase para modelar la implementación Perfil   */
/*------------------------------------------------------------*/

public class PerfilDaoImpl implements PerfilDao {
	private Connection connection;
	private Statement statement;
	private ResultSet resultSet;
	private String query;

	@Override
	public List<Perfil> obtenerRegistros() {
		ArrayList<Perfil> listaRegistro = new ArrayList<>();
		try {
			connection = new Conexion().getConnection();
			query = "SELECT * FROM Perfil";

			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);

			while(resultSet.next()){
				Perfil perfil = new Perfil();
				perfil.setId(resultSet.getInt("idPerfil");

				listaRegistro.add(perfil);
			}
			resultSet.close();
			statement.close();
			connection.close();
			return listaRegistro;
		} catch(Exception e) {
			return null;
		}
	}

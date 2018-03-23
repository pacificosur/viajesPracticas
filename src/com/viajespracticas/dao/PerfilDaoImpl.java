/*------------------------------------------------------------*/
/* Autor: Rolando Pedro Gabriel                               */
/* Fecha: 23/03/2018                                          */
/* Fecha Modificación: 23/03/2018                             */
/* Correo: rolando.pedro.gabriel@gmail.com                    */
/* Descripción: Clase para modelar la implementación Perfil   */
/*------------------------------------------------------------*/

public class PerfilDaoImpl implements PerfilDao {
	private Connection connection;
	private PrepareStatement statement;
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
				perfil.setId(resultSet.getInt("idPerfil"));
				perfil.setNombre(resultSet.getString("nombre"));

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

        
	@Override
	public Perfil obtenerRegistro(Integer id) {
		Perfil perfil;
		try {
			connection = new Conexion().getConnection();
			query = "SELECT * FROM Perfil WHERE idPerfil=?";

			statement = connection.prepareStatement(query);
			statement.setPrepareStatement(1, id);

			resultSet = statement.executeQuery();

			while(resultSet.next()){
				Perfil perfil = new Perfil();
				perfil.setId(resultSet.getInt("idPerfil"));
				perfil.setNombre(resultSet.getString("nombre"));

				listaRegistro.add(perfil);
			}
			resultSet.close();
			statement.close();
			connection.close();
			return listaRegistro;
		} catch(Exception e) {
			return null;
		}



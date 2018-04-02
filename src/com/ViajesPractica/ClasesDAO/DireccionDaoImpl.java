/*------------------------------------------------------------*/
/* Autor: José Alberto Ruiz Cruz                              */
/* Fecha: 02/04/2018                                          */
/* Fecha Modificación: 23/03/2018                             */
/* Correo: jarc.93.oax@gmail.com                              */
/* Descripción: Clase para modelar la interface Direccion      */
/*------------------------------------------------------------*/

public class DireccionDaoImpl implements DireccionDao {
	private Connection connection;
	private PrepareStatement statement;
	private ResultSet resultSet;
	private String query;

	@Override
	public List<Direccion> obtenerRegistros() {
		ArrayList<Direccion> listaRegistro = new ArrayList<>();
		try {
			connection = new Conexion().getConnection();
			query = "SELECT * FROM Direccion";

			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);

			while(resultSet.next()){
				Direccion Direccion = new Direccion();
				direccion.setId(resultSet.getint("idDireccion"));
				direccion.setNombre(resultSet.getString("Nombre"));
				direccion.setFechaCreación(resultSet.getString("fechaCreacion"));
				direccion.setFechaActualizacion(resultSet.getString("fechaActualizacion"));
				direccion.setFechaEliminación(resultSet.getString("fechaEliminación"));

				listaRegistro.add(direccion);
			}
			resultSet.close();
			statement.close();

			return listaRegistro;
		} catch(Exception e) {
			return null;
		}
	}
	@Override
	public Direccion obtenerRegistro(Integer id) {
		Direccion direccion;
		try{
			connection = Conexion().getConnection();
			query = "SELECT * From Direccion WHERE idDireccion =?";
			statement = connection.prepareStatement(query);

			statement.setInt(1, id);
			resultSet = statement.executeQuery();

			if(resultSet.next()) {
				direccion = new Direccion();

			}
			resultSet.close();
			statement.close();
			return direccion;
		} catch(Exception e) {
			return null;
		}
	}

  @Override
	public void crearRegistro(Direccion direccion) {
		try {
			connection = new Conexion().getConnection();
			query = "INSERT INTO Direccion(nombre, fechaCreacion,fechaActualizacion, fechaEliminacion) VALUES( ?,?, ?,?)";

			statement = connection.prepareStatement(query);
			statement.setString(1, direccion.getNombre());
			statement.setString(2, direccion.getFechaCreación());
			statement.setString(3, direccion.getFechaActualización());
			statement.setString(4, direccion.getFechaEliminación());
			statement.executeUpdate();

			statement.close();
		} catch(Exception e) {
			return null;
		}
	}

	@Override
	public void actualizarRegistro (Direccion direccion) {
		try {
			connection = new Conexion().getConnection();
			query = "UPDATE Direccion SET nombre = ?,fechaCreacion = ?, fechaEliminacion = ?, fechaEliminacion = ? WHERE idDireccion = ?";
			statement = connection.prepareStatement(query);
			statement.setString(1, Direccion.getNombre());
			statement.setString(2, direccion.getFechaCreación());
			statement.setString(3, direccion.getFechaActualización());
			statement.setString(4,Direccion.getFechaEliminación());
			statement.setInt(5, Direccion.getId());
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
			query = "DELETE FROM Direccion WHERE idDireccion = ?";

			statement = connection.prepareStatement(query);
			statement.setInt(1, direccion.getId());
			statement.executeUpdate();

			statement.close();
		} catch(Exception e) {
			return null;
		}
	}
}
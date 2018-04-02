/*------------------------------------------------------------*/
/* Autor: José Alberto Ruiz Cruz                              */
/* Fecha: 02/04/2018                                          */
/* Fecha Modificación: 23/03/2018                             */
/* Correo: jarc.93.oax@gmail.com                              */
/* Descripción: Clase para modelar la interface Presupuesto      */
/*------------------------------------------------------------*/

public class PresupuestoDaoImpl implements PresupuestoDao {
	private Connection connection;
	private PrepareStatement statement;
	private ResultSet resultSet;
	private String query;

	@Override
	public List<Presupuesto> obtenerRegistros() {
		ArrayList<Presupuesto> listaRegistro = new ArrayList<>();
		try {
			connection = new Conexion().getConnection();
			query = "SELECT * FROM Presupuesto";

			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);

			while(resultSet.next()){
				Presupuesto presupuesto = new Presupuesto();
				presupuesto.setId(resultSet.getint("idPresupuesto"));
				presupuesto.setNombre(resultSet.getString("Nombre"));
				presupuesto.setFechaCreación(resultSet.getString("fechaCreacion"));
				presupuesto.setFechaActualizacion(resultSet.getString("fechaActualizacion"));
				presupuesto.setFechaEliminación(resultSet.getString("fechaEliminación"));

				listaRegistro.add(presupuesto);
			}
			resultSet.close();
			statement.close();

			return listaRegistro;
		} catch(Exception e) {
			return null;
		}
	}
	@Override
	public presupuesto obtenerRegistro(Integer id) {
		Presupuesto presupuesto;
		try{
			connection = Conexion().getConnection();
			query = "SELECT * From Presupuesto WHERE idPresupuesto =?";
			statement = connection.prepareStatement(query);

			statement.setInt(1, id);
			resultSet = statement.executeQuery();

			if(resultSet.next()) {
				presupuesto = new Presupuesto();

			}
			resultSet.close();
			statement.close();
			return presupuesto;
		} catch(Exception e) {
			return null;
		}
	}

  @Override
	public void crearRegistro(Presupuesto presupuesto) {
		try {
			connection = new Conexion().getConnection();
			query = "INSERT INTO Presupuesto(nombre , ciudad ,  transporte , fechaCreacion,fechaActualizacion, fechaEliminacion) VALUES( ?,?, ?,?)";

			statement = connection.prepareStatement(query);
			statement.setString(1, presupuesto.getNombre());
			statement.setString(2, presupuesto.getCiudad());
			statement.setString(3, presupuesto.getTransporte());
			statement.setString(4, presupuesto.getFechaCreación());
			statement.setString(5, presupuesto.getFechaActualización());
			statement.setString(6, presupuesto.getFechaEliminación());
			statement.executeUpdate();

			statement.close();
		} catch(Exception e) {
			return null;
		}
	}

	@Override
	public void actualizarRegistro (Presupuesto presupuesto) {
		try {
			connection = new Conexion().getConnection();
			query = "UPDATE Presupuesto SET nombre = ?, ciudad = ? , transporte = ? ,fechaCreacion = ?, fechaEliminacion = ?, fechaEliminacion = ? WHERE idPresupuesto = ?";
			statement = connection.prepareStatement(query);
			statement.setString(1, presupuesto.getNombre());
			statement.setString(2,presupuesto.getCiudad());
			statement.setString(3, presupuesto.getTransporte());
			statement.setString(4, presupuesto.getFechaCreación());
			statement.setString(5, presupuesto.getFechaActualización());
			statement.setString(6,presupuesto.getFechaEliminación());
			statement.setInt(7, Presupuesto.getId());
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
			query = "DELETE FROM Presupuesto WHERE idPresupuesto = ?";

			statement = connection.prepareStatement(query);
			statement.setInt(1, presupuesto.getId());
			statement.executeUpdate();

			statement.close();
		} catch(Exception e) {
			return null;
		}
	}
}
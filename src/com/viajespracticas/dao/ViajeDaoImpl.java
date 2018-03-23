public class ViajeDaoImpl implements ViajeDao{
	private Connection connection;
	private PrepareStatement statement;
	private ResultSet resultSet;
	private String query;

	@Override
	public List<Viaje> obtenerRegistros(){
		ArrayList<Viaje> listaRegistro = new ArrayList<>();
		try{
			connection = new Connection().getConnection();
			query = "SELECT * FROM Viaje";

			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);

			while(resultSet.next()){
				Viaje.viaje = new Viaje();
				viaje.setId(resultSet.getInt("idViaje"));
				viaje.setNombre(resultSet.getString("nombre"));

				listaRegistro.add(perfil);
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
	public Viaje obtenerRegistro(){
		Viaje viaje;
		try{
			connection = new Connection().getConnection();
			query = "SELECT * FROM Viaje WHERE idPerfil=?";

			statement = connection.createStatement();
			statement.setPrepare
			resultSet = statement.executeQuery(query);

			while(resultSet.next()){
				Viaje.viaje = new Viaje();
				viaje.setId(resultSet.getInt("idViaje"));
				viaje.setNombre(resultSet.getString("nombre"));

				listaRegistro.add(perfil);
			}
			resultSet.close();
			statement.close();
			connection.close();
			return listaRegistro;
		}catch(Exception e){
			return null;
		}

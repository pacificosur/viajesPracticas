public class ContactoDaoImpl implements ContactoDao{
	private Connection connection;
	private PrepareStatement statement;
	private ResultSet resultSet;
	private String query;
	@Override
	public List <Perfil> obtenerRegistros (){
		ArrayList<Perfil> ListaRegistro = new ArrayList<>();
		try {
			connection = new Conexion().getConnection();
			query = "SELECT *FROM Contacto";

			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
			while(resultSet.next()){
				Perfil perfil = new Perfil();
				perfil.setId(resultSet.getInt("idContacto");
				perfil.setNombre(resul("nombre"));
				listaRegistro.add(contacto);
			}
			resultSet.close();
			statement.close();
			connection.close();
			return listaRegistro;
		}catch(Exception e){
			return null;
		}
	}
}
	@Override
	public List <Perfil> obtenerRegistros (){
		ArrayList<Perfil> ListaRegistro = new ArrayList<>();
		try {
			connection = new Conexion().getConnection();
			query = "SELECT *FROM Direccion where idDireccion=?";
			statement = connection.prepareStatement(query);


			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
			while(resultSet.next()){
				Perfil perfil = new Perfil();
				perfil.setId(resultSet.getInt("idContacto");
				perfil.setNombre(resul("nombre"));
				listaRegistro.add(contacto);
			}
			resultSet.close();
			statement.close();
			connection.close();
			return listaRegistro;
		}catch(Exception e){
			return null;
		}
	}
}


public class PerfilDaoImpl implements EmpresaDao{
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

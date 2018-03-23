public class AlumnoDaoImpl implements AlumnoDao{
	private Connection connection;
	private PrepareStatement statement;
	private ResultSet resulSet;
	private String query;

	@override
	public List<Alumno> obetenerRegistros(){
		ArrayList <Alumno> listaRegistro = new ArrayList<>();
		try{
			connection = new Conexion().getConnection();
			query = " SELECT * FROM Alumno";
			statement = connection.createStatatement();
			resultSet = statement.executeQuery(query);

			while(resultSet.next()){
				Alumno alumno = new Alumno();
				alumno.setId(resultSet.getInt("idAlumno"));
				alumno.setNombre(resultSet.getString("nombre"));
				alumno.setMatricula(ResultSet.getString("matricula"));

				listaRegistro.add(alumno);
			}
			resultSet.close();
			statement.close();
			connection.close();
			return listaRegistro;
		}catch(Exception e){
			return null;

		}	
}

	@override
	public Alumno obetenerRegistro(Integer id){
		Alumno alumno;
		try{
			connection = new Conexion().getConnection();
			query = " SELECT * FROM Alumno WHERE idPerfil = ?";
			statement = connection.prepareStatatement(quey);
			statement.setPrepareStatement(1,id);
			resultSet = statement.executeQuery();

			while(resultSet.next()){
				Alumno alumno = new Alumno();
				alumno.setId(resultSet.getInt("idAlumno"));
				alumno.setNombre(resultSet.getString("nombre"));
				alumno.setMatricula(ResultSet.getString("matricula"));

				listaRegistro.add(alumno);
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


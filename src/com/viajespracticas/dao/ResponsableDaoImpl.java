/*------------------------------------------------------------*/
/* Autor: García García Araceli Edith*/
/* Fecha: 30/03/2018*/
/* Descripción: CRUD de la entidad Responsable del proyecto viajesPracticas*/
/*------------------------------------------------------------*/
package viajepacticas;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ResponsableDaoImpl implements ResponsableDao {
    private Connection connection;
    private PreparedStatement statement;
    private ResultSet resultSet;
    private String query;

    @Override
    public List<Responsable> obtenerRegistros() {
         ArrayList <Responsable> listaRegistro = new ArrayList<>();
        try{
            connection = new Conexion().getConnection();
            query = " SELECT * FROM Responsable";
            statement = (PreparedStatement) connection.createStatement();
            resultSet = statement.executeQuery(query);

            while(resultSet.next()){
                Responsable responsable = new Responsable();
                responsable.setIdResponsable(resultSet.getInt("idResponsable"));
                responsable.setNombre(resultSet.getString("nombre"));
                responsable.setApellidoPaterno(resultSet.getString("apellidoPaterno"));
                responsable.setApellidoMaterno(resultSet.getString("apellidoMaterno"));
                responsable.setInstituto(resultSet.getString("instituto"));
                responsable.setEdad(resultSet.getInt("edad"));
                responsable.setCorreoelectronico(resultSet.getString("correoElectronico"));
                responsable.setTelefono(resultSet.getString("telefono"));               
                responsable.setSexo(resultSet.getString("sexo"));
                responsable.setFechaNacimiento(resultSet.getDate("fechaNacimiento"));
                responsable.setFechaCreacion(resultSet.getDate("fechaCreacion"));
                responsable.setFechaActualizacion(resultSet.getDate("fechaActualizacion"));
                responsable.setFechaEliminacion(resultSet.getDate("fechaEliminacion"));


                listaRegistro.add(responsable);
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
    public Responsable obtenerRegistro(Integer id) {
        try{
            connection = new Conexion().getConnection();
            query = " SELECT * FROM Alumno WHERE idResponsable = ?";
            statement = connection.prepareStatement(query);
            statement.setInt(1,id);
            resultSet = statement.executeQuery();
                        
                        
            while(resultSet.next()){
                Responsable responsable = new Responsable();
                responsable.setIdResponsable(resultSet.getInt("idResponsable"));
                responsable.setNombre(resultSet.getString("nombre"));
                responsable.setApellidoPaterno(resultSet.getString("apellidoPaterno"));
                responsable.setApellidoMaterno(resultSet.getString("apellidoMaterno"));
                responsable.setInstituto(resultSet.getString("instituto"));
                responsable.setEdad(resultSet.getInt("edad"));
                responsable.setCorreoelectronico(resultSet.getString("correoElectronico"));
                responsable.setTelefono(resultSet.getString("telefono"));               
                responsable.setSexo(resultSet.getString("sexo"));
                responsable.setFechaNacimiento(resultSet.getDate("fechaNacimiento"));
                responsable.setFechaCreacion(resultSet.getDate("fechaCreacion"));
                responsable.setFechaActualizacion(resultSet.getDate("fechaActualizacion"));
                responsable.setFechaEliminacion(resultSet.getDate("fechaEliminacion"));


                return responsable;
            }
            resultSet.close();
            statement.close();
            connection.close();                   
        }catch(Exception e){
            return null;
        }
        return null;
    }   

    

    @Override
    public void crearRegistro(Responsable responsable) {
        ArrayList <Responsable> listaRegistro = new ArrayList<>();
        
        try{
            connection = new Conexion().getConnection();
            query = "insert into Responsable (idResponsable,nombre,apellidoPaterno,apellidoMaterno,instituto,edad,correoElectronico,telefono,sexo,fechaNacimiento,fechaCreacion,fechaActualizacion,fechaEliminacion values(?,?,?,?,?,?,?,?,?,?,?,?,?)) ";
            statement = connection.prepareStatement(query);
            statement.setInt(1,responsable.getIdResponsable());         
            statement.setString(2,responsable.getNombre()); 
            statement.setString(3,responsable.getApellidoPaterno()); 
            statement.setString(4,responsable.getApellidoMaterno()); 
            statement.setString(5,responsable.getInstituto()); 
            statement.setInt(6,responsable.getEdad()); 
            statement.setString(7,responsable.getCorreoElectronico()); 
            statement.setString(8,responsable.getTelefono()); 
            statement.setString(9,responsable.getSexo()); 
            statement.setDate(10, (Date) responsable.getFechaNacimiento()); 
            statement.setDate(11,(Date)responsable.getFechaCreacion()); 
            statement.setDate(12,(Date)responsable.getFechaActualizacion()); 
            statement.setDate(13,(Date)responsable.getFechaEliminacion());              
            statement.executeUpdate();

            listaRegistro.add(responsable);

            resultSet.close();
            statement.close();
            connection.close();
            
        }catch(Exception e){
             System.err.println("Error");;

        }
    }

    @Override
    public void actualizarRegistro(Responsable responsable) {
        try{
            connection = new Conexion().getConnection();
            query = "update Alumno set nombre=?,apellidoPaterno=?,apellidoMaterno=?,instituto=?,edad=?,correoElectronico=?,telefono=?,sexo=?,fechaNacimiento=?,fechaCreacion=?,fechaActualizacion=?,fechaEliminacion=? where idResponsable=? ";
            statement = connection.prepareStatement(query);             


            statement.setString(1,responsable.getNombre()); 
            statement.setString(2,responsable.getApellidoPaterno()); 
            statement.setString(3,responsable.getApellidoMaterno()); 
            statement.setString(4,responsable.getInstituto()); 
            statement.setInt(5,responsable.getEdad()); 
            statement.setString(6,responsable.getCorreoElectronico()); 
            statement.setString(7,responsable.getTelefono()); 
            statement.setString(8,responsable.getSexo()); 
            statement.setDate(9, (Date) responsable.getFechaNacimiento()); 
            statement.setDate(10,(Date)responsable.getFechaCreacion()); 
            statement.setDate(11,(Date)responsable.getFechaActualizacion()); 
            statement.setDate(12,(Date)responsable.getFechaEliminacion());
            statement.setInt(13,responsable.getIdResponsable());  
            statement.executeUpdate();

            statement.executeUpdate();

            resultSet.close();
            statement.close();
            connection.close();                      

        }catch(Exception e){
             System.err.println("Error");;

        }   
    }

    @Override
    public void eliminarRegistro(Integer id) {
        try{
            connection = new Conexion().getConnection();
            query = " delete  FROM Responsable WHERE idResponsable = ?";
            statement = connection.prepareStatement(query);
            statement.setInt(1,id);
            statement.executeUpdate();
            resultSet.close();
            statement.close();
            connection.close();
            
        }catch(Exception e){
            System.err.println("error");
        }
    }
    }
   


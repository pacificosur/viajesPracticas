/*------------------------------------------------------------*/
/* Autor: García García Araceli Edith*/
/* Fecha: 30/03/2018*/
/* Descripción: CRUD de la entidad Reporte del proyecto viajesPracticas*/
/*------------------------------------------------------------*/
package viajepacticas;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.List;


public class ReporteDaoImpl implements ReporteDao{
    private Connection connection;
    private PreparedStatement statement;
    private ResultSet resultSet;
    private String query;
    
    
    @Override
    public List<Reporte> obtenerRegistros() {
        
       ArrayList <Reporte> listaRegistro = new ArrayList<>();
       
        try{
            connection = new Conexion().getConnection();
            query = " SELECT * FROM Reporte";
            statement = (PreparedStatement) connection.createStatement();
            resultSet = statement.executeQuery(query);

            while(resultSet.next()){
                Reporte reporte = new Reporte();
                reporte.setIdReporte(resultSet.getInt("idReporte"));
                reporte.setNombre(resultSet.getString("nombre"));
                reporte.setAlumnoId(resultSet.getInt("alumnoId"));
                reporte.setResponsableId(resultSet.getInt("responsableId"));
                reporte.setDescripcion(resultSet.getString("descripcion"));               
                reporte.setFechaCreacion(resultSet.getDate("fechaCreacion"));
                reporte.setFechaActualizacion(resultSet.getDate("fechaActualizacion"));
                reporte.setFechaEliminacion(resultSet.getDate("fechaEliminacion"));

                listaRegistro.add(reporte);
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
    public Reporte obtenerRegistro(Integer id) {
        try{
            connection = new Conexion().getConnection();
            query = " SELECT * FROM Reporte WHERE idReporte = ?";
            statement = connection.prepareStatement(query);
            statement.setInt(1,id);
            resultSet = statement.executeQuery();
                        
                        
            while(resultSet.next()){
                Reporte reporte = new Reporte();
                reporte.setIdReporte(resultSet.getInt("idReporte"));
                reporte.setNombre(resultSet.getString("nombre"));
                reporte.setAlumnoId(resultSet.getInt("alumnoId"));
                reporte.setResponsableId(resultSet.getInt("responsableId"));
                reporte.setDescripcion(resultSet.getString("descripcion"));               
                reporte.setFechaCreacion(resultSet.getDate("fechaCreacion"));
                reporte.setFechaActualizacion(resultSet.getDate("fechaActualizacion"));
                reporte.setFechaEliminacion(resultSet.getDate("fechaEliminacion"));

                return reporte;
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
    public void crearRegistro(Reporte reporte) {
        ArrayList <Reporte> listaRegistro = new ArrayList<>();
        
        try{
            connection = new Conexion().getConnection();
            query = "insert into Reporte (idReporte,nombre,alumnoId,responsableId,descripcion,fechaCreacion,fechaActualizacion,fechaEliminacion values(?,?,?,?,?,?,?,?)) ";
            statement = connection.prepareStatement(query);
            
            statement.setInt(1,reporte.getIdReporte());         
            statement.setString(2,reporte.getNombre()); 
            statement.setInt(3,reporte.getAlumnoId()); 
            statement.setInt(4,reporte.getResponsableId()); 
            statement.setString(5,reporte.getDescripcion()); 
            statement.setDate(11,(Date)reporte.getFechaCreacion()); 
            statement.setDate(12,(Date)reporte.getFechaActualizacion()); 
            statement.setDate(13,(Date)reporte.getFechaEliminacion());              
            statement.executeUpdate();

            listaRegistro.add(reporte);

            resultSet.close();
            statement.close();
            connection.close();
            
        }catch(Exception e){
             System.err.println("Error");
        }
    }

    @Override
    public void actualizarRegistro(Reporte reporte) {
        try{
            connection = new Conexion().getConnection();
            query = "update Reporte set nombre=?,alumnoId=?,responsableId=?,descripcion=?,fechaCreacion=?,fechaActualizacion=?,fechaEliminacion=? where idReporte=? ";
            statement = connection.prepareStatement(query);             

                    
            statement.setString(1,reporte.getNombre()); 
            statement.setInt(2,reporte.getAlumnoId()); 
            statement.setInt(3,reporte.getResponsableId()); 
            statement.setString(4,reporte.getDescripcion()); 
            statement.setDate(5,(Date)reporte.getFechaCreacion()); 
            statement.setDate(6,(Date)reporte.getFechaActualizacion()); 
            statement.setDate(7,(Date)reporte.getFechaEliminacion());
            statement.setInt(8,reporte.getIdReporte());           
           
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
            query = " delete  FROM Reporte WHERE idReporte = ?";
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
    


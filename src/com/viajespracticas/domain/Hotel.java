/*------------------------------------------------------*/
/*Autor : Gracía Pérez Mireya Carmen                    */
/*Fecha de modificación: 19 de marzo del 2018           */
/*Descripción: Tabla Hotel con sus atributos          */
/*correspondiente a la especificación de la aplicación  */
/* web de viajes  de practicas de la universidad        */ 
/* de la sierra sur                                     */
/*------------------------------------------------------*/
public class Hotel {

    private int idHotel;
    private String nombre;
    private int direccionId;
    private int numerocuartos;
    private String servicios;
    private double costo;
    private String telefono;
    private String correoElectronico;
    private String sitioWeb;
    private String director;
    private Date fechaCreacion;
    private Date fechaAtualizacion;
    private Date fechaEliminacion;

    public Hotel(){
    
    }
    
    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDireccionId() {
        return direccionId;
    }

    public void setDireccionId(int direccionId) {
        this.direccionId = direccionId;
    }

    public int getNumerocuartos() {
        return numerocuartos;
    }

    public void setNumerocuartos(int numerocuartos) {
        this.numerocuartos = numerocuartos;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaAtualizacion() {
        return fechaAtualizacion;
    }

    public void setFechaAtualizacion(Date fechaAtualizacion) {
        this.fechaAtualizacion = fechaAtualizacion;
    }

    public Date getFechaEliminacion() {
        return fechaEliminacion;
    }

    public void setFechaEliminacion(Date fechaEliminacion) {
        this.fechaEliminacion = fechaEliminacion;
    }
    
}

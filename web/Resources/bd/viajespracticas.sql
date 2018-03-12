



--Tabla de registro del viaje del alumno
CREATE TABLE ViajeAlumno(
	viajeId integer,
    alumnoId integer,
    fechaCreacion date,
    fechaActualizacion date,
    fechaEliminacion date,
    FOREIGN KEY(viajeId) REFERENCES Viaje(idViaje),
	FOREIGN KEY(alumnoId) REFERENCES Alumno(idAlumno)    
);
--Tabla de usuario
--En esta tabla se guardarán los registros de los usuarios vinculados con un perfil
CREATE TABLE Usuario(
	idUsuario integer PRIMARY KEY,
    nombre varchar(50),
    apellidoPaterno varchar(20),
    apellidoMaterno varchar(20),
    fechaNacimiento date,
    email varchar(80),
    sexo varchar(12),
    usr varchar(20),
    pass varchar(50),
    telefono varchar(18),
    direccion varchar(200),
    perfilId integer,
    fechaCreacion date,
    fechaActualizacion date,
    fechaEliminacion date,
    FOREIGN KEY(perfilId) REFERENCES Perfil(idPerfil)
);
--Tabla Presupuesto
--En esta tabla se guardarán los registros de los presupuestos utilizados en el viaje de practicas
CREATE TABLE Presupuesto(
	idPresupuesto integer PRIMARY KEY,
    nombre varchar(100),
    /*ciudad varchar(500),*/
    transporte float,
    ospedaje float,
    alimentacion float,
    fechaCreacion date,
    fechaActualizacion date,
    fechaEliminacion date
);
--Tabla Alumno
--En esta tabla se guardarán los registros de los alumnos que asistirán a los viajes de practicas 
CREATE TABLE Alumno(
	idAlumno integer PRIMARY KEY,
    nombre varchar(50),
    apellidoPaterno varchar(50),
    apellidoMaterno varchar(50),
    matricula varchar(10),
    semestre varchar(20),
    carrera varchar(120),
    edad integer,
    correoElectronico varchar(200),
    fechaNacimiento date,
    fechaCreacion date,
    fechaActualizacion date,
    fechaEliminacion date
);
--Tabla Viaje
--En esta tabla se guardarán los registros del viaje en general 
CREATE TABLE Viaje(
	idViaje integer PRIMARY KEY,
    fechaInicio date,
    fechaFin date,
    nombre varchar(150),
    presupuestoId integer,
    fechaCreacion date,
    fechaActualizacion date,
    fechaEliminacion date,
    FOREIGN KEY(presupuestoId) REFERENCES Presupuesto(idPresupuesto)
);
--Tabla Perfil
--En esta tabla se guardarán los registros de los perfiles de los usuarios
CREATE TABLE Perfil(
	idPerfil integer PRIMARY KEY,
    nombre varchar(50),
    fechaCreacion date,
    fechaActualizacion date,
    fechaEliminacion date
);

--Tabla Reporte 
--En esta tabla se guardarán los registros de los reportes que 
--Modifique cuerpo por descripcion
CREATE TABLE Reporte(
	idReporte integer PRIMARY KEY,
    nombre varchar(100),
    autor varchar(100),
    --alumnoId integer,
    --responsableId integer,
    descripcion text,
    fechaCreacion date,
    fechaActualizacion date,
    fechaEliminacion date
    --FOREIGN KEY(alumnoId) REFERENCES Alumno(idAlumno),
	--FOREIGN KEY(responsableId) REFERENCES Responsable(idResponsable)
);
--Tabla ViajeResponsable
----En esta tabla se guardarán los registros de los profesores responsables
CREATE TABLE ViajeResponsable(
	viajeId integer,
    responsableId integer,
    fechaCreacion date,
    fechaActualizacion date,
    fechaEliminacion date,
    FOREIGN KEY(viajeId) REFERENCES Viaje(idViaje),
	FOREIGN KEY(responsableId) REFERENCES Responsable(idResponsable)
);
--Tabla ViajeEmpresa
--En esta tabla se guardarán los registros de las empresas vamos a visitar en el viaje
CREATE TABLE ViajeEmpresa(
	viajeId integer,
    empresaId integer,
    fechaCreacion date,
    fechaActualizacion date,
    fechaEliminacion date,
    FOREIGN KEY(viajeId) REFERENCES Viaje(idViaje),
    FOREIGN KEY(empresaId) REFERENCES Empresa(idEmpresa)
);
--Tabla Incidencias --cambie cuerpo por text
--En esta tabla se guardarán los registros de las incidencias ocurridas en el viaje.
CREATE TABLE Incidencias(
	idIncidencia integer PRIMARY KEY,
    nombre varchar(100),
    alumnoId integer,
    responsableId integer,
    descripcion text,
    fechaCreacion date,
    fechaActualizacion date,
    fechaEliminacion date,
    FOREIGN KEY(alumnoId) REFERENCES Alumno(idAlumno),
    FOREIGN KEY(responsableId) REFERENCES Responsable(idResponsable)
);
--Tabla ViajeHotel
--En esta tabla se guardarán los registros de los hoteles en donde se hospedaron en el viaje.
CREATE TABLE ViajeHotel(
	viajeId integer,
    hotelId integer,
    fechaCreacion date,
    fechaActualizacion date,
    fechaEliminacion date,
    FOREIGN KEY(viajeId) REFERENCES Viaje(idViaje),
    FOREIGN KEY(hotelId) REFERENCES Hotel(idHotel)
);

--Tabla empresa--agregue contacto e hice su tabla
--En esta tabla se guardarán los registros de los datos de las empresas
CREATE TABLE Empresa(
	idEmpresa integer PRIMARY KEY,
    nombre varchar(200),
    categoria varchar(200),
    director varchar(200),
    direccionId integer,
    contactoId integer,
    fechaCreacion date,
    fechaActualizacion date,
    fechaEliminacion date,
    FOREIGN KEY(direccionId) REFERENCES Direccion(idDireccion),
    FOREIGN KEY(contactoId) REFERENCES Contacto(idContacto)
);
--Tabla Contacto --se creo nuevaz tabla
--En esta tabla se guardarán los registros de los contactos que nos ayudaron en el viaje de practicas
CREATE TABLE Contacto(
	idContacto integer PRIMARY KEY,
    nombre varchar(50),
    apellidoPaterno varchar(50),
    apellidoMaterno varchar(50),
    telefono varchar(50),
    fechaCreacion date,
    fechaActualizacion date,
    fechaEliminacion date
);
--Tabla Responsable --sin uss ni contraseña
--En esta tabla se guardarán los registros de los datos personales de los responsables
CREATE TABLE Responsable(
	idResponsable integer PRIMARY KEY,
    nombre varchar(50),
    apellidoPAterno varchar(50),
    apellidoMaterno varchar(50),
    instituto varchar(200),
    edad integer,
    correElectronico varchar(200),
    telefono varchar(18),
    fechaNacimiento date,
    sexo varchar(12),
    fechaCreacion date,
    fechaActualizacion date,
    fechaEliminacion date
);
--Tabla Hotel --cambie directo por gerente y
--En esta tabla se guardarán los registros de los datos del hotel 
CREATE TABLE Hotel(
	idHotel integer PRIMARY KEY,
    nombre varchar(200),
    direccionId integer,
    servicios varchar(400),
    costo float,
    telefono varchar(18),
    correoElectronico varchar(200),
    sitioWeb varchar(500),
    gerente varchar(100),
    fechaCreacion date,
    fechaActualizacion date,
    fechaEliminacion date,
    FOREIGN KEY(DireccionId) REFERENCES Direccion(idDireccion)
);
--Tabla Direccion
--En esta tabla se guardarán los registros de las direcciones utilizadas en los hoteles, empresas, etc
CREATE TABLE Direccion(
	idDireccion integer PRIMARY KEY,
    nombre varchar(500),
    fechaCreacion date,
    fechaActualizacion date,
    fechaEliminacion date
);

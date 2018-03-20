/*------------------------------------------------------------*/
/*			Universidad de la Sierra Sur			   		  */
/*Autor:													  */
/*		Bastida Jiménez Obdulia								  */
/*		García García Araceli Edith							  */
/*		García Pérez Mireya Carmen							  */
/*		Ruiz Cruz José Alberto								  */
/*Fecha de modificación:									  */
/*Sábado 17 de Marzo 2018									  */
/*Descripción:												  */
/*Script de la base de datos de Viajes de prácticas donde se  */
/*especifican las clases establecidas para el proyecto de la  */ 
/*aplicación web.											  */
/*------------------------------------------------------------*/		  


--Tabla que contendra los costos que se requieren al realizar un viaje
CREATE TABLE Presupuesto(
	idPresupuesto integer PRIMARY KEY NOT NULL,
    nombre varchar(100),
    transporte float,
    hospedaje float,
    alimentacion float,
    fechaCreacion date,
    fechaActualizacion date,
    fechaEliminacion date
);

--tabla Alumno contiene toda la informacion referente a un Alumno que participa en los viajes 
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

--Tabla en la que se especifica un tipo de usuario
CREATE TABLE Perfil(
	idPerfil integer PRIMARY KEY NOT NULL,
    nombre varchar(50),
    fechaCreacion date,
    fechaActualizacion date,
    fechaEliminacion date
);

--Tabla que contiene informacion referente a la persona que se contacto en cada empresa visitada
CREATE TABLE Contacto(
	idContacto integer PRIMARY KEY NOT NULL,
    nombre varchar(50),
    apellidoPaterno varchar(50),
    apellidoMaterno varchar(50),
    telefono varchar(50),
    fechaCreacion date,
    fechaActualizacion date,
    fechaEliminacion date
);

--Tabla que contiene datos de la direccion de algun lugar
CREATE TABLE Direccion(
	idDireccion integer PRIMARY KEY NOT NULL,
    nombre varchar(500),
    fechaCreacion date,
    fechaActualizacion date,
    fechaEliminacion date
);

--Tabla que contendra toda la informacion necesaria de un responsable de viaje de practicas
CREATE TABLE Responsable(
	idResponsable integer PRIMARY KEY NOT NULL,
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

--tabla que contendra toda la informacion referente a un Usuario de la app
CREATE TABLE Usuario(
	idUsuario integer PRIMARY KEY NOT NULL,
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
    perfilId integer NOT NULL,
    fechaCreacion date,
    fechaActualizacion date,
    fechaEliminacion date,
    FOREIGN KEY(perfilId) REFERENCES Perfil(idPerfil)
);

--tabla principal en la que especifican cuestiones de un viaje de practicas, esta tabla esta relacionada con muchas otras tablas
CREATE TABLE Viaje(
	idViaje integer PRIMARY KEY NOT NULL,
    fechaInicio date,
    fechaFin date,
    nombre varchar(100),
    presupuestoId integer NOT NULL,
    fechaCreacion date,
    fechaActualizacion date,
    fechaEliminacion date,
    FOREIGN KEY(presupuestoId) REFERENCES Presupuesto(idPresupuesto)
);

--Tabla que contiendra la informacion de los hoteles donde se hospedaron durante el viaje
CREATE TABLE Hotel(
	idHotel integer PRIMARY KEY NOT NULL,
    nombre varchar(50),
    direccionId integer NOT NULL,
    servicios varchar(400),
    costo float,
    telefono varchar(18),
    correoElectronico varchar(100),
    sitioWeb varchar(200),
    gerente varchar(100),
    fechaCreacion date,
    fechaActualizacion date,
    fechaEliminacion date,
    FOREIGN KEY(DireccionId) REFERENCES Direccion(idDireccion)
);

--Tabla que contendra informacion referente a las empresas visitadas durante un viaje
CREATE TABLE Empresa(
	idEmpresa integer PRIMARY KEY NOT NULL,
    nombre varchar(50),
    categoria varchar(50),
    director varchar(100),
    direccionId integer NOT NULL,
    contactoId integer NOT NULL,
    fechaCreacion date,
    fechaActualizacion date,
    fechaEliminacion date,
    FOREIGN KEY(direccionId) REFERENCES Direccion(idDireccion),
    FOREIGN KEY(contactoId) REFERENCES Contacto(idContacto)
);

--Tabla intermediaria para relacionar la tabla Viaje con la tabla Alumno
CREATE TABLE ViajeAlumno(
	viajeId integer NOT NULL,
    alumnoId integer NOT NULL,
    fechaCreacion date,
    fechaActualizacion date,
    fechaEliminacion date,
    FOREIGN KEY(viajeId) REFERENCES Viaje(idViaje),
	FOREIGN KEY(alumnoId) REFERENCES Alumno(idAlumno)    
);

--Tabla en la que se refleja una descripcion de un viaje por parte de un Alumno o un responsable
CREATE TABLE Reporte(
	idReporte integer PRIMARY KEY NOT NULL,
    nombre varchar(100),
    autor varchar(100),
   	alumnoId integer NULL,
    responsableId integer NULL,
    descripcion text,
    fechaCreacion date,
    fechaActualizacion date,
    fechaEliminacion date,
    FOREIGN KEY(alumnoId) REFERENCES Alumno(idAlumno),
	FOREIGN KEY(responsableId) REFERENCES Responsable(idResponsable)
);

--Tabla intermedia para relacionar la tabla Viaje y la tabla Responsable
CREATE TABLE ViajeResponsable(
	viajeId integer NOT NULL,
    responsableId integer NOT NULL,
    fechaCreacion date,
    fechaActualizacion date,
    fechaEliminacion date,
    FOREIGN KEY(viajeId) REFERENCES Viaje(idViaje),
	FOREIGN KEY(responsableId) REFERENCES Responsable(idResponsable)
);
--Tabla intermedia para relacionar la tabla Viaje con la tabla Empresa
CREATE TABLE ViajeEmpresa(
	viajeId integer NOT NULL,
    empresaId integer NOT NULL,
    fechaCreacion date,
    fechaActualizacion date,
    fechaEliminacion date,
    FOREIGN KEY(viajeId) REFERENCES Viaje(idViaje),
    FOREIGN KEY(empresaId) REFERENCES Empresa(idEmpresa)
);

--Tabla que almacenara algun tipo de incidencia durante el transcurso del viaje
CREATE TABLE Incidencia(
	idIncidencia integer PRIMARY KEY NOT NULL,
    nombre varchar(100),
    alumnoId integer NOT NULL,
    responsableId integer NOT NULL,
    descripcion text,
    fechaCreacion date,
    fechaActualizacion date,
    fechaEliminacion date,
    FOREIGN KEY(alumnoId) REFERENCES Alumno(idAlumno),
    FOREIGN KEY(responsableId) REFERENCES Responsable(idResponsable)
);

--Tabla intermedia que relaciona la tabla Viaje con la tabla Hotel
CREATE TABLE ViajeHotel(
	viajeId integer NOT NULL,
    hotelId integer NOT NULL,
    fechaCreacion date,
    fechaActualizacion date,
    fechaEliminacion date,
    FOREIGN KEY(viajeId) REFERENCES Viaje(idViaje),
    FOREIGN KEY(hotelId) REFERENCES Hotel(idHotel)
);

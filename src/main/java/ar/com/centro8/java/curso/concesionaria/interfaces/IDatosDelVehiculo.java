package ar.com.centro8.java.curso.concesionaria.interfaces;

//Esta interfaz establece un contrato para obtener una ficha técnica 
public interface IDatosDelVehiculo {
     // Método que devuelve un texto,
     // Vehiculo la implemeta ,Auto y Moto lo definen ,
     // toString() lo usa para mostrar los vehiculos
     // String: devuelve un texto, obtenerFichaTecnica nombre que le di,
     // () sin parámetros
     String obtenerFichaTecnica();
}

package ar.com.centro8.java.curso.concesionaria.vehiculos;

import lombok.EqualsAndHashCode;
import lombok.Getter;

// Genera getPuertas() para consultar la cantidad de puertas
@Getter

// Genera equals() y hashCode() usando las puertas
// con callSuper= true tambien considera los datos de vehiculo
@EqualsAndHashCode(callSuper = true)

// Auto hereda de Vehiculo los datos y métodos comunes
public class Auto extends Vehiculo {

    // Atributo propio de Auto
    private int puertas;

    // Constructor
    // recibe los datos necesarios para crear un auto
    public Auto(String marca, String modelo, double precio, int puertas) {

        // llamo al constructor de Vehiculo para guardar marca,modelo y precio
        super(marca, modelo, precio);

        // Guardo la cantidad de puertas recibidas en el atributo del auto
        this.puertas = puertas;
    }

    // Método obtenerFichaTecnica()
    // Implemento el método de la interfaz IDatosDelVehiculo que Vehiculo implementa
    // Armo la ficha del auto incluyendo la cantidad de puertas.
    // String significa que el metodo devuelve un texto
    @Override
    public String obtenerFichaTecnica() {

        // Consulto marca y modelo con los getters
        // Uso this.puertas para obtener las puertas del auto actual
        // Llamo a precioConFormato(),heredado de Vehiculo
        // Uno los datos y devuelvo el texto , sin imprimir
        return "Marca: " + getMarca() + " // Modelo: " + getModelo() + " // Puertas: " + this.puertas + " // Precio: "
                + precioConFormato();
    }
}

package ar.com.centro8.java.curso.concesionaria.vehiculos;

import lombok.EqualsAndHashCode;
import lombok.Getter;

//genera getCilindrada() para consultar la cilindrada
@Getter

// Genera equals() para comprara igualdad en los datos de la Moto
// y hashCode() para calcular un código numerico apartir de esos datos
// callSuper=true se concidera los datos de Vehiculo
@EqualsAndHashCode(callSuper = true)

// Moto hereda de Vehiculo los datos y métodos comunes
public class Moto extends Vehiculo {

    // Atributo propio de moto
    private int cilindrada;

    // Constructor
    // Recibe los datos necesarios para crear una Moto
    public Moto(String marca, String modelo, double precio, int cilindrada) {

        // Llamo al constructor de Vehiculo para guardar marca,modelo y precio
        super(marca, modelo, precio);

        // Guardo la cilindrada recibida en el atributo moto
        this.cilindrada = cilindrada;
    }

    // // Método obtenerFichaTecnica()
    // Implemento el método de la interfaz IDatosDelVehiculo que Vehiculo implementa
    // Armo la ficha de la Moto incluyendo la cilindrada.
    // String significa que el metodo devuelve un texto
    @Override
    public String obtenerFichaTecnica() {

        // Consulto marca y modelo con los getters heredados
        // Uso this.cilindrada pra obtener cilindrada de la moto actual
        // Arego la letra c como pide la consigna
        // Llamo a precioConFormato() heredado de Vehiculo
        // Uno los datos y devuelvo e texto sin imprimir
        return "Marca: " + getMarca() + " // Modelo: " + getModelo() + " // Cilindrada: " + this.cilindrada + "c"
                + " // Precio: " + precioConFormato();
    }
}

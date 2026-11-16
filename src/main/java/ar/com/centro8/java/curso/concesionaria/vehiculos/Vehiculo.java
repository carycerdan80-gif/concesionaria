package ar.com.centro8.java.curso.concesionaria.vehiculos;

import ar.com.centro8.java.curso.concesionaria.interfaces.IDatosDelVehiculo;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

//Genera los getters para consultar marca, modelo y precio
//Los uso en Auto,Moto y ServicioDeLaConcesionaria
@Getter

// Genera el constructor que recibe marca,modelo y precio
// Auto y Moto lo llaman con super(marca,modelo,precio)
@AllArgsConstructor

// Genera equals() para comparar igualdad de los datos de los objetos
// y hashCode() para calcular un código numerico a parrir de esos datos
@EqualsAndHashCode
/*
 * Creé la clase Vehiculo para reunir los atributos y métodos comunes de Auto y
 * Moto
 * Es abstracta porque no quiero crear vehiculos directamente
 * sino objetos de us clases hijas
 * 
 * Implementa IDatisDelVehiculo para establecer que deben tener fichaTecnica
 * Auto yMoto se encargan de armara la ficha con sus propios datos
 * 
 * Implemente Comparable<Vehiculo> para definir su orden naural
 * mediante el método compareTo()
 */
public abstract class Vehiculo implements IDatosDelVehiculo, Comparable<Vehiculo> {
    // Atributos comunes de los vehiculos
    // Son privados , los consulto desde otras clases mediante getters
    private String marca;
    private String modelo;
    private double precio;

    // Método precioConFormato(): Devuelve el precio como texto con formato de
    // moneda
    // lo utilizo en Auto,Moto y en la busqueda por letra
    public String precioConFormato() {

        // $ agrega el simbolo moneda.
        // % inicia la indicacion del formato.
        // la coma indica que se arupen los miles y .2 indica los decimales
        // f indica un formato decimal
        // this.precio: utiliza el precio del objeto actual y da valor
        return String.format("$%,.2f", this.precio);
    }

    // Método compareTo() definido en comparable
    // lo uso al ordenar los vehiculos por orden natural en servicio
    @Override

    // int indica que devuleve un número entero,compareTo es el nombre del método
    // Vehiculo es el tipo de objeto que recibo,vehiculo es el nombre del parámetro
    public int compareTo(Vehiculo vehiculo) {

        // Concateno los datos del vehiculo actual y guarda el texto en la variable
        // esteVehiculo
        String esteVehiculo = this.marca + ":" + this.modelo + ":" + this.precio;

        // Concateno los datos del vehiculo recibido y guardo el
        // texto en la variable otroVehiculo
        String otroVehiculo = vehiculo.marca + ":" + vehiculo.modelo + ":" + vehiculo.precio;

        // Comparo los dos textos que guarde en las dos variables 
        // y devuleve un resultado de esa comparación
        return esteVehiculo.compareTo(otroVehiculo);
    }

    // Métoto toString()
    // al imprimir un vehiculo, se muestre la ficha técnica
    // lo escribo en Vehiculo para que Auto y Moto lo hereden
    @Override
    public String toString() {
        //Devuelvo la ficha tecnica con los datos de auto o de la moto
        return obtenerFichaTecnica();
    }
}

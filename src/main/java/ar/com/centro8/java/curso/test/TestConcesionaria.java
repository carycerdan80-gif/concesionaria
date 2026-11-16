package ar.com.centro8.java.curso.test;

import java.util.List;

import ar.com.centro8.java.curso.concesionaria.servicios.ServiciosDeLaConcesionaria;
import ar.com.centro8.java.curso.concesionaria.vehiculos.Vehiculo;

// Uso esta clase para ejecutar y probar el programa
public class TestConcesionaria {
    public static void main(String[] args) {

        // Creo un objeto del ServicioDeLaConcesionaria para poder llamar a sus métodos
        ServiciosDeLaConcesionaria concesionaria = new ServiciosDeLaConcesionaria();
        // Llamo al método que carga los vehiculos y guardo la lista que devuelve
        List<Vehiculo> vehiculos = concesionaria.cargarVehiculos();

        // Recorro la lista e imprimo la ficha de cada vehiculo
        // printIn usa el toString() que heredaron de Vehiculo
        vehiculos.forEach(System.out::println);

        // le paso la lista para buscar y mostrar
        // Vehículo más caro,más barato , que contiene en el modelo la letra ‘Y’:
        concesionaria.buscarVehiculoMasCaro(vehiculos);
        concesionaria.buscarVehiculoMasBarato(vehiculos);
        concesionaria.buscarVehiculoPorLetra(vehiculos, "Y");

        // Muestro
        // Vehículos ordenados por precio de mayor a menor:
        concesionaria.ordenarPorPrecio(vehiculos);

        // Muestro la ficha en el orden definido por compareTo
        // Vehículos ordenados por orden natural (marca, modelo, precio):
        concesionaria.ordenarPorOrdenNatural(vehiculos);

    }

}

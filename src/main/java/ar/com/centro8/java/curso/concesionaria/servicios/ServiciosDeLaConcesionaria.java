package ar.com.centro8.java.curso.concesionaria.servicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import ar.com.centro8.java.curso.concesionaria.vehiculos.Auto;
import ar.com.centro8.java.curso.concesionaria.vehiculos.Moto;
import ar.com.centro8.java.curso.concesionaria.vehiculos.Vehiculo;

// En esta clase reúno la carga,las búsquedas y los ordenamientos
public class ServiciosDeLaConcesionaria {

  // 1)Método CargarVehiculos()
  // Creo y cargo todos los vehiculos en un único método, como pide la consigna
  // Cargo los vehiculos con los datos escritos en el código
  // sin pedir al usuario que lo ingrese
  // List<Vehiculo> indica que devuelve una lista donde pueden estar autos y motos
  public List<Vehiculo> cargarVehiculos() {
    System.out.println();

    // Creo una lista vacia con ArrayList
    // Uso Vehiculo como tipo para poder guardar autos y motos
    List<Vehiculo> vehiculos = new ArrayList<>();

    // Con new creo cada objeto usando el constructor
    // Con add lo agrego a lista
    vehiculos.add(new Auto("Peugeot", "206", 200_000.00, 4));
    vehiculos.add(new Moto("Honda", "Titan", 60_000.00, 125));
    vehiculos.add(new Auto("Peugeot", "208", 250_000.00, 5));
    vehiculos.add(new Moto("Yamaha", "YBR", 80_500.50, 160));

    // Devuelve la lista cargada para poder usarla en los otros métodos
    return vehiculos;
  }

  // 2) Vehículo más caro:
  // Método buscarVehiculoMascaro()
  // Recibe la lista para buscar y mostrar el vehiculo mas caro
  // Uso void porque imprimo el resultado sin devolver un valor
  public void buscarVehiculoMasCaro(List<Vehiculo> vehiculos) {

    // Imprimo el separador con una línea en blanco antes y después
    System.out.println();
    System.out.println("=============================");
    System.out.println();

    // Declaro una variable llamada masCaro de tipo Vehiculo
    // Uso stream() para trabajar con los elementos de la lista
    Vehiculo masCaro = vehiculos.stream()

        // Con .max busco el Vehiculo con mayor precio
        // Con Comparator.comparingDouble indico como comparar usando un número double
        // Con vehiculo::getPrecio indico de donde sacar ese número ,
        // del metodo getPrecio de cada vehiculo
        .max(Comparator.comparingDouble(Vehiculo::getPrecio))

        // Obtengo el vehiculo que encontro max()
        .get();

    // Muestro la marca y el modelo del vehiculo mas caro
    System.out.println("Vehículo más caro: " + masCaro.getMarca() + " " + masCaro.getModelo());

  }

  // 3) Vehículo más barato:
  // Metodo buscarVehiculoMasBarato()
  // Este método busca el vehiculo que tiene el precio mas bajo
  // Recibe la lista de vehiculos para poder compararlos
  public void buscarVehiculoMasBarato(List<Vehiculo> vehiculos) {

    // utilizo el mismo procedimiento que en Vehiculo mas caro solo que uso min
    Vehiculo masBarato = vehiculos.stream()
        .min(Comparator.comparingDouble(Vehiculo::getPrecio))
        .get();
    System.out.println("Vehículo más barato: " + masBarato.getMarca() + " " + masBarato.getModelo());

  }

  // 4) Vehículo que contiene en el modelo la letra ‘Y’:
  // Método buscarVehiculoPorLetra():
  // Recibo la lista y la letra que quiero buscar dentro del modelo
  // Puedo buscar otra letra cambiando el argumento desde test.
  public void buscarVehiculoPorLetra(List<Vehiculo> vehiculos, String letra) {

    // Uso stream()para crear un flujo y trabajar con los vehiculos de la lista
    vehiculos.stream()

        // filter deja pasar los vehiculos que cumplen la condicion
        // v representa cada vehiculo que se esta revisando
        // -> indica que condicion voy evaluar para ese vehiculo
        // v.getModelo() obtengo ese modeo
        // .toLowerCase() convierte el modelo en minuscula
        .filter(v -> v.getModelo().toLowerCase()

            // contains comprueba si el modelo tiene el texto buscado
            // letra.toLowerCase() tamben convierto la letra en minuscula
            .contains(letra.toLowerCase()))

        // forEach recorre los vehiculos que pasaron el filtro e imprimo
        // la letra buscada, la marca el modelo y el precioConFormato
        .forEach(v -> System.out.println("Vehículo que contiene en el modelo la letra '" + letra + "': "
            + v.getMarca() + " "
            + v.getModelo() + " "
            + v.precioConFormato()));
  }

  // 5) Vehículos ordenados por precio de mayor a menor:
  // Metodo ordenarPorPrecio():
  // este metodo ordena los vehiculos por precio desde
  // el mas caro hasta el mas barato
  public void ordenarPorPrecio(List<Vehiculo> vehiculos) {
    System.out.println();
    System.out.println("=============================");
    System.out.println();

    System.out.println("Vehículos ordenados por precio de mayor a menor:");
    // Uso .stream():para trabajar con los vehiculos
    // Con .sorted():ordeno los vehiculos
    // Comparator:indica que se ordenan por precio
    // Con reversed():invierto el orden para que aparezca primero el mas caro o
    // mayor
    vehiculos.stream()
        .sorted(Comparator.comparingDouble(Vehiculo::getPrecio)
            .reversed())
        // Con forEach:muestro los vehiculos ya ordenandos
        // luego solo imprimo marca y modelo
        .forEach(v -> System.out.println(
            v.getMarca() + " " +
                v.getModelo()));

  }

  // 6)Vehículos ordenados por orden natural (marca, modelo, precio):
  // Metodo ordenarPorOrdenNatural():
  // este metodo ordenalos vehiculos por orden natural
  // El orden natural lo define el método compareTo que tengo en la clase Vehiculo
  public void ordenarPorOrdenNatural(List<Vehiculo> vehiculos) {
    System.out.println();
    System.out.println("=============================");
    System.out.println();

    System.out.println("Vehículos ordenados por orden natural (marca, modelo, precio):");
    // stream(): uso para trabajar con la lista
    // sorted():ordeno los vehiculos
    // compareTo():uso para comparar marca, modelo y precio
    vehiculos.stream()
        .sorted(Vehiculo::compareTo)
        // forEach():recorro los vehiculos ordenados
        // printIn:llama al toString() de cada vehiculo y muestra su ficha tecnica
        .forEach(System.out::println);

    System.out.println();
  }

}

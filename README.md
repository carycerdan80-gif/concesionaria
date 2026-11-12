# Concesionaria de autos y motos
Segundo Trabajo Práctico de Programación Orientada a Objetos

# Descripción del trabajo
# El programa simula el funcionamiento de una concesionaria de vehiculos
# Muestra una lista de autos y motos
# Identifica los vehículos mas caro y los mas baratos
# Busca un modelo que contiene letra Y.
# Ordena los vehículos  por precio y por orden natural
# Toda la información se muestra por consola, sin solicitar datos al usuario
//-------------------------------------------------------------------------------------------------------------
# TECNOLOGIAS Y HERRAMIENTAS UTILIZADAS
# Java :17/21: Lenguaje de programación orientada a objetos
# Spring BOOT: frameWork de Java utilizado como base para estructurar, configurar y ejecutar
# Maven : herramienta de gestión y construcción de proyectos
# Lombok : biblioteca de java que reduce códigos repetitivos
# Visual Estudio Code: editor de codigos
# GitHub:plataforma que permite al desarrollador almacenar,gestionar y colaborar en proyectos de códigos.
//---------------------------------------------------------------------------------------------------------------
## CONCEPTOS UTILIZADOS
# Clases: es un molde que define los atributos y métodos que tendrán los objetos
# Objetos: es una instancia de una clase que se crea con new y tiene sus propios datos
# Herencia:permite que una clse hija herede  los atributos y métodos de una clase padre, evitando repetir código
# Clase Abstracta:es una clase que no se puede instanciar directamente , no crea objetos directamente
# Interfaces:es un contrato que establece métodos que deben implemnetar las clases 
# Interfaz comparable:permite establcer el orden natural de los objetos utilizando el metodo compareTO( )
# Encapsulamiento: consiste en proteger los atributos de una clase y controlar el acceso a sus datos
# Polimorfismo: permite trabajar con objetos  de diferentes clases hijas utilizando el tipo de su clase padre
# Constructores:son los encargados de inicializar los atributos cuando se crea un objeto
# Sobre escritura de métodos con @Override:permite implementar un método heredado o declarado en una interfaz con el comportamiento que necesita cada clase
# Colecciones List y ArrayList
.List : es una interfaz que permite trabajar con una lista ordenada de elementos
.ArrayList es una clase que implementa list y permite agregar elementos dinamicos
# API Stream: permite trabajar con los elementos de una colección para realizar busquedas ,filtros y ordenamiento
# Anotaciones Lombok: es una biblioteca que geenera automaticamente  codigo repetetitivos mediante anotaciones

//------------------------------------------------------------------------------------------------------------
## ORGANIZACION DEL PROYECTO
# Interfaz IDatosDelVehiculo
.Primero cree la interfaz IDatosDelVehiculo, donde declaré el método obtenerFichaTecnica().
.Este método establece un contrato para que los distintos  tipos de vehículos  puedan devolver un texto con sus datos técnicos
# Clase abstracta Vehiculo
.Después creé la clase abstracta vehiculo, donde coloqué los atriutos comunes de auto y moto:
.marca,modelo,precio
.También agregue los siguientes métodos:
. precioConFormato(): devuelve el precio con formato de moneda
.compareTo(): compara vehiculos y establece un orden natural
.toString():devuelve la ficha técnica correspondiente a cada vehiculo
.Luego implemente la interfaz comparable< Vehiculo >: para poder ordenar los vehiculos
# Clase Auto
.La clase Auto hereda de Vehiculo
.Agregue el atributo propio puertas, que representa  la cantidad de puertas del auto
.Implemente el método obtenerFichaTecnica() para devolver  la marca, el modelo , las puertas  y el precio 
# Clase Moto
.La clase Moto también hereda de Vehiculo
.Agregue el atributo propio cilindrada
.Implemnete el método obtenerFichaTecnica() para devolver la marca,modelo, cilindrada y precio
# Clase serviciosDeLaConcecionaria
.En esta clase organicé  la lógica del programa 
.Creé un único método para cargar la lista de veículos, utilizando ArrayList y List
.También utilce API Stream para realizar las siguentes operaciones:
.Buscar el vehículo mas caro
.Buscar el vehículo mas barato
.Buscar vehículos que tengan una letra determinada en su modelo
.Ordenar los vehículos por precio de mayor a menor
.Ordenar los vehiculos por orden  natural
# Clase TestConcesionaria
.En esta clase se encuentra el metodo main()
 desde donde comienza la ejecución del programa
 .Creo un objeto de ServiciosDeLaConcesionaraia, cargo la lista del vehículo y lo llamo a los  métodos necesarios para mostrar los resultados por consola


## Desarrollado por:
## CARINA CERDAN

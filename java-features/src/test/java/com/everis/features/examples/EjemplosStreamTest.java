package com.everis.features.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.everis.features.streams.StreamsServiceImpl;
import org.junit.jupiter.api.Test;

import com.everis.features.domain.Automovil;
import com.everis.features.domain.Modelo;
import com.everis.features.domain.Persona;
import com.everis.features.domain.Sexo;

class EjemplosStreamTest {

    List<Persona> listaPersonas = new ArrayList<>();

    StreamsServiceImpl streamsServiceImpl = new StreamsServiceImpl();
    //@Test
    //void primerEjercicio(){
    //  //  streamsServiceImpl.imprimirLista(obtenerLista());
    // }

   // @Test
   // void  segundoEjercicio(){
   //     List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
   //     streamsServiceImpl.dividirPorDos(numbers);
   //    System.out.print(streamsServiceImpl.dividirPorDos(numbers));
   // }

  //  @Test
  //  void tercerEjercicio(){
  //   //  System.out.print( streamsServiceImpl.generarSaludoPersonalizado(obtenerListaPersonas()));
  //  }

  //  @Test
  //  void cuartoEjercicio(){
  //    //  System.out.print(streamsServiceImpl.filtrarPersonas(obtenerListaPersonas()));
  //  }

  //  @Test
  //  void quintoEjercicio(){
  //   //   System.out.print(streamsServiceImpl.obtenerDosModelosPorKilometraje(listaDeVehiculos()));
  //  }

    @Test
    void  sextoEjercicio(){
        List<String> numbers = Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c");
        System.out.print(streamsServiceImpl.ordernarLista(numbers));
    }




//    @Test
//    void map() {
//        // map: Altera los elementos en base a una funci?n y los devuelve alterados.
//        // Tambi?n permite realizar proyecciones de atributos.
//        List<Persona> listaPersonas = obtenerListaPersonas();
//        List<Integer> edadesAlteradas=listaPersonas.stream().map(p -> p.getEdad()+2).collect(Collectors.toList());
//        System.out.println("edadesAlteradas :"+edadesAlteradas);
//        List<Integer> listaDeEdades=listaPersonas.stream().map(Persona::getEdad).collect(Collectors.toList());
//        System.out.println("listaDeEdades :"+listaDeEdades);
//    }

//    @Test
//    void filter() {
//        List<Persona> listaPersonas = obtenerListaPersonas();
//        // filter: Filtra los elementos a partir del la condici?n de la funci?n pasada
//        // como par?metro.
//        List<Persona> listaDeMujeres = listaPersonas.stream().filter(p -> p.getSexo().equals(Sexo.MUJER))
//                .collect(Collectors.toList());
//
//        System.out.println("filter :" + listaDeMujeres);
//    }

//    @Test
//    void sorted() {
//        List<Persona> listaPersonas = obtenerListaPersonas();
//        // sorted: Ordena los elementos siguiendo la condici?n de la funci?n como
//        // par?metro.
//
//        List<Persona> listaDePersonasOrdenadas = listaPersonas.stream()
//                .sorted((p1, p2) -> Integer.compare(p1.getEdad(), p2.getEdad())).collect(Collectors.toList());
//
//        System.out.println("sorted :" + listaDePersonasOrdenadas);
//    }

//    @Test
//    void distinct() {
//        List<Persona> listaPersonas = obtenerListaPersonasRepetidas();
//        // distinct: Retorna un stream con elementos no repetidos bas?ndose en la
//        // comparaci?n entre objetos con la funci?n equals (Object.equals(object)).
//        List<Persona> listaFiltrada =listaPersonas.stream().distinct().collect(Collectors.toList());
//        System.out.println("listaFiltrada :" + listaFiltrada.size());
//    }

//    @Test
//    void distinctConMap() {
//        List<Persona> listaPersonas = obtenerListaPersonasRepetidas();
//        List<Sexo> listaFiltrada =listaPersonas.stream().map(Persona::getSexo).distinct().collect(Collectors.toList());
//        System.out.println("listaFiltrada :" + listaFiltrada);
//
//    }

//    @Test
//    void peek() {
//        List<Persona> listaPersonas = obtenerListaPersonas();
//        // peek: Esta operaci?n no realiza cambios sobre el stream y lo devuelve tal y
//        // como entra.
//        // El prop?sito principal consiste en hacer debugging al ejecutar cualquier otra
//        // operaci?n,
//        // ya que permite imprimir valores de los elementos del stream.
//        List<String> result = listaPersonas.stream()
//                .filter(p -> p.getEdad() > 25)
//                .peek(p -> System.out.println(p))
//                .map(Persona::getSegundoApellido)
//                .peek(p -> System.out.println(p))
//                .collect(Collectors.toList());
//    }

//    @Test
//    void limit() {
//        List<Persona> listaPersonas = obtenerListaPersonas();
//        // limit: Limita el n?mero de elementos que tiene como salida el nuevo stream.
//        List<String> result = listaPersonas.stream().map(Persona::getPrimerApellido).limit(2).collect(Collectors.toList());
//        System.out.println("limit :" + result);
//    }

//    @Test
//    void forEach() {
//        List<Persona> listaPersonas = obtenerListaPersonas();
//        // forEach: Realiza la acci?n de la funci?n por par?metro para cada elemento
//        listaPersonas.parallelStream().limit(5).forEach(System.out::println);
//    }

//    @Test
//    void collect() {
//        List<Persona> listaPersonas = obtenerListaPersonas();
//        // collect: Ejecuta lo que denominan mutable reduction, que consiste en acumular
//        // los resultados en una Collection a medida que los va procesando en la
//        // pipeline del stream.
//        List<Persona> collectPersonas = listaPersonas.parallelStream().limit(1).collect(Collectors.toList());
//        //System.out.println("collect :" + collectPersonas);
//
//    }

//    @Test
//    void collectConAgrupacion() {
//        List<Persona> listaPersonas = obtenerListaPersonas();
//        Map<Sexo, List<Persona>> agrupacionPorSexo = listaPersonas.parallelStream()
//                .collect(Collectors.groupingBy(Persona::getSexo));
//
//        System.out.println("collectConAgrupacion :" + agrupacionPorSexo);
//    }

//    @Test
//    void reduce() {
//        List<Persona> listaPersonas = obtenerListaPersonas();
//        //reduce: Permite hacer una reducci?n de los resultados del stream, lo cual consiste en
//        //acumular el resultado en un resultado resumido de la entrada, por ejemplo,
//        //encontrar la suma de un stream de enteros. Tambi?n hay otras operaciones que utilizan la operaci?n
//        //reduce en background y son terminales, como sum().
//        Integer sumatoriaDeEdades = listaPersonas.stream().filter(p->(null!=p.getEdad())).map(p -> p.getEdad()).reduce(0, Integer::sum);
//        System.out.println("reduce :" + sumatoriaDeEdades);
//    }


    private List<Persona> obtenerListaPersonas() {

        listaPersonas.add(new Persona("Claudio", "Andres", "Quinteros", "Cortes", 38, Sexo.HOMBRE));
        listaPersonas.add(new Persona("Andrea", "Maria", "Gomez", "Perez", 32, Sexo.MUJER));
        listaPersonas.add(new Persona("Benjamin", "Juan", "jarry", "Cortes", 28, Sexo.HOMBRE));
        listaPersonas.add(new Persona("Pablo", "Jose", "Beltran", "Carvajal", 25, Sexo.HOMBRE));
        listaPersonas.add(new Persona("Miguel", "Angel", "Aguirre", "Jimenez", 26, Sexo.HOMBRE));
        listaPersonas.add(new Persona("Dirlene", "Amarando", "Martins", "Santos", 40, Sexo.MUJER));
        listaPersonas.add(new Persona("Ingrid", "Andrea", "Villagran", "Soto", 22, Sexo.MUJER));

        return listaPersonas;
    }

    private List<Persona> obtenerListaPersonasRepetidas() {

        listaPersonas.add(new Persona("Claudio", "Andres", "Quinteros", "Cortes", 38, Sexo.HOMBRE));
        listaPersonas.add(new Persona("Andrea", "Maria", "Gomez", "Perez", 32, Sexo.HOMBRE));
        listaPersonas.add(new Persona("Andrea", "Maria", "Gomez", "Perez", 32, Sexo.HOMBRE));
        listaPersonas.add(new Persona("Benjamin", "Juan", "jarry", "Cortes", 28, Sexo.HOMBRE));
        listaPersonas.add(new Persona("Pablo", "Jose", "Beltran", "Carvajal", 25, Sexo.HOMBRE));
        listaPersonas.add(new Persona("Pablo", "Jose", "Beltran", "Carvajal", 25, Sexo.HOMBRE));
        listaPersonas.add(new Persona("Miguel", "Angel", "Aguirre", "Jimenez", 26, Sexo.HOMBRE));
        listaPersonas.add(new Persona("Dirlene", "Amarando", "Martins", "Santos", 40, Sexo.MUJER));
        listaPersonas.add(new Persona("Dirlene", "Amarando", "Martins", "Santos", 40, Sexo.MUJER));
        listaPersonas.add(new Persona("Ingrid", "Andrea", "Villagran", "Soto", 22, Sexo.MUJER));

        return listaPersonas;
    }

    private List<Automovil> listaDeVehiculos() {

        List<Automovil> vehiculos = new ArrayList<>();
        vehiculos.add(new Automovil("AABB01", Modelo.SUBARU, 220000));
        vehiculos.add(new Automovil("ABAB02", Modelo.NISSAN, 100000));
        vehiculos.add(new Automovil("STRM01", Modelo.TOYOTA, 150000));
        vehiculos.add(new Automovil("LMBD22", Modelo.SUBARU, 333000));
        vehiculos.add(new Automovil("GNRC76", Modelo.NISSAN, 186333));
        vehiculos.add(new Automovil("DFMT44", Modelo.TOYOTA, 186789));
        vehiculos.add(new Automovil("STMT77", Modelo.HONDA, 500000));

        return vehiculos;
    }

    private List<String> obtenerLista(){
        return Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c");
    }
}
package com.everis.features.streams;

import java.util.List;

import com.everis.features.domain.Automovil;
import com.everis.features.domain.Modelo;
import com.everis.features.domain.Persona;

public interface StreamsService {

    

    //Utilizar Streams para imprimir los elementos de una lista
    void imprimirLista(List<String> lista);
    
    //Dividir cada elemento de la lista por 2
    //List<Integer> numbers = asList(10, 20, 30, 40, 50);
    List<Integer> dividirPorDos(List<Integer> lista);
    
    //Generar un saludo para cada persona de la lista con su primer nombre
    List<String> generarSaludoPersonalizado(List<Persona> personas);
    
    //Generar una lista de mujeres mayores a 25 a
    // �os
    List<Persona> filtrarPersonas(List<Persona> personas);
    
    //Seleccionar los dos primeros modelos distintos de los veh�culos
    //un kilometraje igual o menor a 160.000
    List<Modelo> obtenerDosModelosPorKilometraje(List<Automovil> automoviles);

    //Generar metodo Generic que reciba una lista <T> y la ordene
    //Probar con distintos tipos de datos
    //Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c")
    <T> List<T> ordernarLista(List<T> lista);
    
    //Agregar un metodo default que devuelva el primer nombre y primer apellido
    //Dependiendo si es mujer anteponer Mrs. y si es hombre Mr.
}

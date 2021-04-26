package com.everis.features.streams;

import com.everis.features.domain.Automovil;
import com.everis.features.domain.Modelo;
import com.everis.features.domain.Persona;
import com.everis.features.domain.Sexo;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsServiceImpl implements StreamsService{



    @Override
    public void imprimirLista(List<String> lista) {
        lista.stream().forEach(System.out::println);
    }

    @Override
    public List<Integer> dividirPorDos(List<Integer> lista) {
        return lista.stream().map(p -> p/2).collect(Collectors.toList());
    }

    @Override
    public List<String> generarSaludoPersonalizado(List<Persona> personas) {

        return personas.stream().map(p -> "Hola"+  p.getPrimerNombre()).collect(Collectors.toList());
    }

    @Override
    public List<Persona> filtrarPersonas(List<Persona> personas) {
        return personas.parallelStream().filter(p -> p.getSexo().equals(Sexo.MUJER) && p.getEdad() >25 )
                    .collect(Collectors.toList());
    }

    @Override
    public List<Modelo> obtenerDosModelosPorKilometraje(List<Automovil> automoviles) {
      //  return automoviles.stream().map(a::getSexo).distinct().collect(Collectors.toList());
        return automoviles.stream().filter(a -> a.getKilometros() < 160000).map(Automovil::getModelo).distinct().collect(Collectors.toList());
    }

    @Override
    public <T> List<T> ordernarLista(List<T> lista) {
        return (List<T>) lista.stream().sorted().collect(Collectors.toList());
    }

}

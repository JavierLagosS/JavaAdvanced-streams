package com.everis.features.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Automovil {

    private String matricula;
    private Modelo modelo;
    private int kilometros;
}

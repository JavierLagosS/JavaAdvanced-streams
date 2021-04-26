package com.everis.features.genericos;

import lombok.Data;

@Data
public class Dimension<T> {
    
    private T alto;
    private T ancho;
    private T largo;
    
    public Dimension(T alto, T ancho, T largo) {
        super();
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }
}




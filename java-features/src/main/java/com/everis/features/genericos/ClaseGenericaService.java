package com.everis.features.genericos;

public interface ClaseGenericaService<T1,T2> {

    T2 unaOperacion(T1 t);
    T1 otraOperacion(T2 t);
}


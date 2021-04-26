package com.everis.features.genericos;

public class ClaseGenerica<T> {

    private T t;
    
    public void set(T t) { this.t = t; }
    
    public T get() { return t; }
}


package com.everis.features.genericos;

import java.util.ArrayList;
import java.util.List;

public class Genericos<T> {
    
    public void m(T arg){
        System.out.println("Dato ingresado :"+arg);
        List<?> lista=new ArrayList<>();
        
        for (Object object : lista) {
            System.out.println(object);
            
        }
    }

}

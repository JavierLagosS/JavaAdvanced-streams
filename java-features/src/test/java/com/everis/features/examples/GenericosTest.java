package com.everis.features.examples;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.everis.features.genericos.Automovil;
import com.everis.features.genericos.Genericos;
import com.everis.features.genericos.Sedan;
import com.everis.features.genericos.Suv;



class GenericosTest {

    @Test
    void test() {
        genericMethods();
    }
    
    private void genericMethod() {
        
      Genericos<String> primerGenerico=new Genericos<>();
      primerGenerico.m("un String");
      
      Genericos<Integer> segundoGenerico=new Genericos<>();
      segundoGenerico.m(1);
      
      Genericos<?> tercerGenerico=new Genericos<>();
      segundoGenerico.m(3);
      
    }

    private void genericMethods() {
        
        List<? super Automovil> autos=new ArrayList<>();
        Sedan sedan=new Sedan();
        Suv suv=new Suv();
        autos.add(sedan);
        autos.add(suv);
        for (Object object : autos) {
            ((Automovil)object).encender();
               
        }
    }
}

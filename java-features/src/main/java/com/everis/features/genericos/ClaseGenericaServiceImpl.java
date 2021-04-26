package com.everis.features.genericos;

public class ClaseGenericaServiceImpl implements ClaseGenericaService<String,Integer>{


    @Override
    public Integer unaOperacion(String t) {
        
        return t.length();
    }

    @Override
    public String otraOperacion(Integer t) {

        return String.valueOf(t);
    }

}


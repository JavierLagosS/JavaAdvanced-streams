package com.everis.features.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import com.everis.features.domain.Persona;
import com.everis.features.domain.Sexo;
import com.everis.features.fi.VehiculoFI;
import com.everis.features.genericos.ArrayGenerico;
import com.everis.features.genericos.ClaseGenerica;
import com.everis.features.genericos.Dimension;



class ExamplesTddTest {

    @Test
    void test() {
        optionalOfNullable();
        optionalOfNullableObject();  
        streamMap();
        sorted();
        collect();
        match();
        staticMethod();
        lambdaExpression();
        generics();
        lambdaExpressionFI();
    }
    
    private void optionalOfNullable() {
        
        Optional<String> nombre=Optional.ofNullable(null);
        System.out.println("Puso usted su nombre? "+nombre.isPresent());
        System.out.println("Su nombre: "+nombre.orElseGet(()-> "[NADA]"));
        System.out.println(nombre.map(n -> "Holi "+n+"!").orElse("Holi, como te llamas?"));
        
    }
    
    private void optionalOfNullableObject() {
        
        Persona persona=new Persona("Claudio","Andres","Quinteros","Cortes",38,Sexo.HOMBRE);
        Optional<Persona> empleado=Optional.ofNullable(persona);
        System.out.println("Existe ? "+empleado.isPresent());
        System.out.println(empleado.map(n -> "Hola "+n.getPrimerNombre()+" bienvenido!").orElse("Usted no es empleado!"));
        
    }
    
    private void streamsFilter() {
        
        List<String> listaDeNombres = new ArrayList<>();
        listaDeNombres.add("Pedro");
        listaDeNombres.add("Juan");
        listaDeNombres.add("Diego");
        listaDeNombres.add("Pepe");
        
        listaDeNombres.stream().filter((s) -> s.startsWith("P"))
        .forEach(System.out::println);
        
    }
    private void streamMap() {
        
        List<String> listaDeNombres = new ArrayList<>();
        listaDeNombres.add("Pedro");
        listaDeNombres.add("Juan");
        listaDeNombres.add("Diego");
        listaDeNombres.add("Pepe");
        
        listaDeNombres.stream().filter((s) -> s.startsWith("P"))
        .map(String::toUpperCase)
        .forEach(System.out::println);  
        
    }
    private void sorted() {
        
        List<String> listaDeNombres = new ArrayList<>();
        listaDeNombres.add("Pedro");
        listaDeNombres.add("Juan");
        listaDeNombres.add("Diego");
        listaDeNombres.add("Pepe");
        
        listaDeNombres.stream().sorted()
        .map(String::toUpperCase)
        .forEach(System.out::println);
        
    }
    
    private void collect() {
        
        List<String> listaDeNombres = new ArrayList<>();
        listaDeNombres.add("Pedro");
        listaDeNombres.add("Juan");
        listaDeNombres.add("Diego");
        listaDeNombres.add("Pepe");
        
        List<String> memNamesInUppercase = listaDeNombres.stream().sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.print(memNamesInUppercase);
        
    }

    private void match() {
        List<String> listaDeNombres = new ArrayList<>();
        listaDeNombres.add("Pedro");
        listaDeNombres.add("Juan");
        listaDeNombres.add("Diego");
        listaDeNombres.add("Pepe");
        
        boolean matchedResult = listaDeNombres.stream()
                .anyMatch((s) -> s.startsWith("A"));
        System.out.println(matchedResult);
         
        matchedResult = listaDeNombres.stream()
                .allMatch((s) -> s.startsWith("A"));
        System.out.println(matchedResult);
         
        matchedResult = listaDeNombres.stream()
                .noneMatch((s) -> s.startsWith("A"));
        System.out.println(matchedResult);
        
    }
    private void staticMethod() {

        int caballosDeFuerza = VehiculoFI.obtenerCaballosDeFuerza(7000, 301);
        System.out.println("Caballos obtenidos :"+String.valueOf(caballosDeFuerza));
        
    }
   
    private void lambdaExpression() {

        List<String> listaDeNombres = new ArrayList<>();
        listaDeNombres.add("Pedro");
        listaDeNombres.add("Juan");
        listaDeNombres.add("Diego");
        listaDeNombres.add("Pepe");
         
        listaDeNombres.forEach(nombre ->  { System.out.println(nombre); } );
        
    }
    
    private void lambdaExpressionFI() {
        
        Comparator<Persona> empleadosComparator=new Comparator<Persona>() {
            
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getPrimerNombre().compareTo(o2.getPrimerNombre());
            }
        };
      
        Persona primeraPersona=new Persona("Claudio","Andres","Quinteros","Cortes",38,Sexo.HOMBRE);
        Persona segundaPersona=new Persona("Cosme","Fulanito","nn","nn",38,Sexo.HOMBRE);
        
        int result=empleadosComparator.compare(primeraPersona, segundaPersona);
        System.out.println("result *:"+result);
        
        
        Comparator<Persona> empleadosNuevoComparador=(o1,o2)->o1.getEdad().compareTo(o2.getEdad());
        
        System.out.println("empleadosNuevoComparador ->"+String.valueOf(empleadosNuevoComparador.compare(null, null)));
        
    }
    
    private void generics() {
        
        Dimension<Integer> dimension=new Dimension<Integer>(10, 20, 30);
        System.out.println(dimension.getAlto());
        System.out.println(dimension.getAncho());
        System.out.println(dimension.getLargo());
        
        
        
        ClaseGenerica<String> claseGenerica=new ClaseGenerica<>();
        
        claseGenerica.set("Hola soy un String");
        
        List<? extends Number> list = new ArrayList<Long>();
        
        ArrayGenerico<Integer> instancciaArrayGenerico=new ArrayGenerico<>();
        instancciaArrayGenerico.unArrayNoInstanciado=new Integer[10];
        instancciaArrayGenerico.unArrayNoInstanciado[0]=1;
        
        
        Object[] arrayGenerico = new String[10];
        arrayGenerico[0] = "Como en casa!";
        arrayGenerico[1] = 10; // Esto lanzara una ArrayStoreException

        Collection<?> coleccion = new ArrayList<String>();

        List<? extends Number> lista = new ArrayList<Long>();

        Map<String, ?> mapa = new HashMap<String, Integer>();

//        List<? extends Number> nuevaLista = new ArrayList<String>(); 
//        Comparator<? super String> comparador = new RuleBasedCollator(new Integer(100)); 
        
        
    }
    
    
    public static <T> int countAllOccurrences(T[] list, T item) {
        int count = 0;
        if (item == null) {
           for ( T listItem : list )
              if (listItem == null)
                 count++;
        }
        else {
           for ( T listItem : list )
              if (item.equals(listItem))
                 count++;
        }
        return count;
     } 
    
    
}

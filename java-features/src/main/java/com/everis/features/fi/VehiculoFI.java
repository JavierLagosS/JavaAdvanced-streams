package com.everis.features.fi;

@FunctionalInterface
public interface VehiculoFI {

    String moverVehiculo();
    
    static Integer obtenerCaballosDeFuerza(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }
}



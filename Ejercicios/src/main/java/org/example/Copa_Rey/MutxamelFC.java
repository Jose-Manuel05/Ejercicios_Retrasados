package org.example.Copa_Rey;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class MutxamelFC implements FuncionesIntegrantes {

    private String nombre;
    private int edad;

    public MutxamelFC(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

}

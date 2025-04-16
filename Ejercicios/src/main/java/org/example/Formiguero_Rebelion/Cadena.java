package org.example.Formiguero_Rebelion;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;


@Getter @Setter
public class Cadena {

    private String nombre;
    private ArrayList<Programa> listaProgramas;

    public Cadena(String nombre) {
        this.nombre = nombre;
        this.listaProgramas = new ArrayList<>();
    }

    public void agregarPrograma(Programa programa) {
        listaProgramas.add(programa);
    }

    public void eliminarPrograma(Programa programa) {
        listaProgramas.remove(programa);
    }

    @Override
    public String toString() {
        return "Cadena{" +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

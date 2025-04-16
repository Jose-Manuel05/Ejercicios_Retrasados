package org.example.Formiguero_Rebelion;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter @Setter
public class Invitado {

    private String nombre;
    private String profesion;
    private LocalDate fecha_vista;
    private int temporada;

    public Invitado(String nombre, String profesion, int temporada) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.temporada = temporada;
        this.fecha_vista = LocalDate.of(2025, 3, 15);
    }

    @Override
    public String toString() {
        return "Invitado{" +
                "fecha_vista=" + fecha_vista +
                ", nombre='" + nombre + '\'' +
                ", profesion='" + profesion + '\'' +
                ", temporada=" + temporada +
                '}';
    }
}

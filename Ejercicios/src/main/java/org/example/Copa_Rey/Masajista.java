package org.example.Copa_Rey;

import lombok.*;

@Getter @Setter
@ToString
public class Masajista extends MutxamelFC{

    private String titulacion;
    private int anosExperiencia;

    public Masajista(String nombre, int edad, int anosExperiencia, String titulacion) {
        super(nombre, edad);
        this.anosExperiencia = anosExperiencia;
        this.titulacion = titulacion;
    }

    public void darMasaje(Jugador jugador) {
        System.out.println("El masajista " + this.getNombre() + " le da un masaje al jugador " + jugador.getNombre() + ".");
    }


    @Override
    public void concentrarse() {
        System.out.println("El masajista " + this.getNombre() + " se concentra con el equipo.");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El masajista " + this.getNombre() + " viaja a " + ciudad + " con el equipo.");
    }

    @Override
    public void celebrarGol() {
        System.out.println("El masajista " + this.getNombre() + " celebra el gol del equipo." );
    }
}

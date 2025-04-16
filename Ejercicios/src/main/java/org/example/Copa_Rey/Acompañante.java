package org.example.Copa_Rey;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
public class Acompañante extends MutxamelFC{

    private Jugador integrante;
    private String parentesco;

    public Acompañante(String nombre, int edad, Jugador integrante, String parentesco) {
        super(nombre, edad);
        this.integrante = integrante;
        this.parentesco = parentesco;
    }


    @Override
    public void concentrarse() {
        System.out.println("El acompañante " + this.getNombre() + " se concentra con el equipo.");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El acompañante " + this.getNombre() + " viaja a " + ciudad + " con el equipo.");
    }

    @Override
    public void celebrarGol() {
        System.out.println("El acompañante " + this.getNombre() + " celebra el gol del equipo.");
    }

    @Override
    public String toString() {
        return "Acompañante{" +
                "nombre='" + getNombre() +
                ", edad=" + getEdad() +
                ", parentesco='" + parentesco + '\'' +
                '}';
    }
}

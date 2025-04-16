package org.example.Copa_Rey;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Jugador extends MutxamelFC implements  AccionesDeportivas{

    private static List<Jugador> jugadoresRegistrados = new ArrayList<>();;

    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;

    public Jugador(String nombre, int edad, Equipos categoria, int dorsal, Posiciones posicion) {
        super(nombre, edad);
        validarDorsal(dorsal, categoria);
        this.categoria = categoria;
        this.dorsal = dorsal;
        this.posicion = posicion;
        jugadoresRegistrados.add(this);
    }



    public void setDorsal(int dorsal) {
        if (this.dorsal != dorsal) {
            validarDorsal(dorsal, this.categoria);
            this.dorsal = dorsal;
        }
    }

    public void setCategoria(Equipos categoria) {
        if (this.categoria != categoria) {
            validarDorsal(this.dorsal, categoria);
            this.categoria = categoria;
        }
    }

    private void validarDorsal(int dorsal, Equipos categoria) {
        for (Jugador jugador : jugadoresRegistrados) {
            if (jugador != this &&  jugador.getCategoria() == categoria &&  jugador.getDorsal() == dorsal) {
                throw new DorsalDuplicadoException("El dorsal " + dorsal + " ya está asignado a " + jugador.getNombre() +  " en el equipo " + categoria);
            }
        }
    }

    public void calentar() {
        System.out.println("El jugador " + this.getNombre() + " calienta antes del partido.");
    }

    public void descansar() {
        System.out.println("El jugador " + this.getNombre() + " descansa después del partido.");
    }

    public void marcarGol() {
        System.out.println("El jugador " + this.getNombre() + " marca un gol.");
    }

    @Override
    public void concentrarse() {
        System.out.println("El jugador " + this.getNombre() + " se concentra con el equipo.");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El jugador " + this.getNombre() + " viaja a " + ciudad + " con el equipo.");
    }

    @Override
    public void entrenar() {
        System.out.println("El jugador " + this.getNombre() + " entrena con el equipo.");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("El jugador " + this.getNombre() + " juega el partido contra " + rival + ".");
    }

    @Override
    public void celebrarGol() {
        System.out.println("El jugador " + this.getNombre() + " celebra el gol del equipo.");
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + getNombre() +
                ", edad=" + getEdad() +
                ", categoria=" + categoria +
                ", dorsal=" + dorsal +
                ", posicion=" + posicion +
                '}';
    }
}

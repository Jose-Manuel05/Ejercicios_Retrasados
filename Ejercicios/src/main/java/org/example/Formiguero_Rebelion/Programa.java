package org.example.Formiguero_Rebelion;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter @Setter
public class Programa {

    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    public Programa(String nombre, Cadena cadena, String nombreDirector) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = 0;
        this.listaEmpleados = new ArrayList<>();
        this.listaInvitados = new ArrayList<>();
        this.director = new Empleado(nombreDirector,"director",null);
        listaEmpleados.add(director);
        cadena.agregarPrograma(this);
    }

    public void añadirEmpleado(String nombre, String cargo, Empleado director) {
        Empleado empleado = new Empleado(nombre,cargo,director);
        listaEmpleados.add(empleado);
    }

    public void eliminarEmpleado(Empleado empleado) {
        listaEmpleados.remove(empleado);
    }

    public void añadirInvitado(String nombre, String profesion, int temporada) {
        Invitado invitado = new Invitado(nombre,profesion,temporada);
        listaInvitados.add(invitado);
    }

    public void eliminarInvitado(Invitado invitado) {
        listaInvitados.remove(invitado);
    }

    public int invitadosTemporada(int temporada) {
        ArrayList<Invitado> invitadosEnTemporada = new ArrayList<>();

        for (Invitado invitado : listaInvitados) {
            if (invitado.getTemporada() == temporada) {
                invitadosEnTemporada.add(invitado);
            }
        }

        System.out.println("Número de invitados en temporada " + temporada + ": " + invitadosEnTemporada.size());

        if (!invitadosEnTemporada.isEmpty()) {
            System.out.println("Listado de invitados:");
            for (Invitado invitado : invitadosEnTemporada) {
                System.out.println("- Nombre: " + invitado.getNombre() + ", Profesión: " + invitado.getProfesion());
            }
        } else {
            System.out.println("No hay invitados en esta temporada.");
        }

        return invitadosEnTemporada.size();
    }

    public int vecesInvitado(String nombre) {
        int contador = 0;
        for (Invitado invitado : listaInvitados) {
            if (invitado.getNombre().equalsIgnoreCase(nombre)) {
                contador++;
            }
        }
        return contador;
    }

    public void rastrarearInvitado(String nombre) {
        for (Invitado invitado : listaInvitados) {
            if (invitado.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("El invitado " + nombre + " ha estado en la temporada " + invitado.getTemporada() + " el " + invitado.getFecha_vista());
                return;
            }
        }
        System.out.println("El invitado " + nombre + " no ha sido encontrado.");
    }

    public boolean buscarInvitado(String nombre) {
        for (Invitado invitado : listaInvitados) {
            if (invitado.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }

    public String invitadoAntes(String nombre) {
        for (Invitado invitado : listaInvitados) {
            if (invitado.getNombre().equalsIgnoreCase(nombre)) {
                return "El invitado " + nombre + " ha estado en la temporada " + invitado.getTemporada() + " el " + invitado.getFecha_vista();
            }
        }
        return "El invitado " + nombre + " no ha sido encontrado.";
    }

    @Override
    public String toString() {
        return "Programa{" +
                "cadena=" + cadena +
                ", nombre='" + nombre + '\'' +
                ", temporadas=" + temporadas +
                ", director=" + director +
                '}';
    }
}

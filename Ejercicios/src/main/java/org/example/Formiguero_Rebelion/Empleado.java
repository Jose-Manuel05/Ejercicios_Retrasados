package org.example.Formiguero_Rebelion;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Empleado {

    private static int contador = 0;

    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    public Empleado(String nombre, String cargo, Empleado director) {
        id = generarID();
        this.nombre = nombre;
        setCargo(cargo);
        this.director = director;
    }

    public void setCargo(String cargo) {
        if (cargo != null && (
                cargo.equals("director") ||
                        cargo.equals("técnico") ||
                        cargo.equals("presentador") ||
                        cargo.equals("colaborador"))) {
            this.cargo = cargo;
        } else {
            this.cargo = "pte";
        }
    }

    private String generarID() {
        return String.format("EP%03d", contador + 1);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "cargo='" + cargo + '\'' +
                ", id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", director=" + director +
                '}';
    }
}
package org.example.Formiguero_Rebelion;

import java.time.LocalDate;

public class AppProgramas {
    public static void main(String[] args) {

        Cadena tve = new Cadena("TVE");
        Programa programa1 = new Programa("El Hormiguero", tve, );
        Programa programa2 = new Programa("La Resistencia", tve, 5);
        tve.agregarPrograma(programa1);
        tve.agregarPrograma(programa2);

        programa1.añadirEmpleado(new Empleado("Alicia", "técnico", null));
        programa1.añadirEmpleado(new Empleado("Pepe", Cargos.COLABORADOR));
        programa1.añadirEmpleado(new Empleado("Hector"));

        programa1.añadirInvitado(new Invitado("Will Smith", "Actor", 3, LocalDate.of(2025, 3, 15)));
        programa1.añadirInvitado(new Invitado("Will Smith", "Actor", 8, LocalDate.of(2023, 10, 1)));
        programa2.añadirInvitado(new Invitado("Will Smith", "Actor", 5, LocalDate.of(2025, 3, 15)));
        programa1.añadirInvitado(new Invitado("Cristina Pedroche", "Presentadora", 10, LocalDate.of(2025, 3, 2)));
        programa1.añadirInvitado(new Invitado("Cristina Pedroche", "Presentadora", 10, LocalDate.of(2025, 3, 2)));

        programa1.invitadosTemporada(10);
        programa1.rastrarearInvitado("Will Smith");
        tve.invitadoAntes("Will Smith");

        System.out.println();
        System.out.println("Cadena de '" + programa1.getNombre() + "': " + programa1.getCadena());
        tve.eliminarPrograma(programa1);
        System.out.println("Cadena de '" + programa1.getNombre() + "': " + programa1.getCadena());

    }
}

package org.example.Copa_Rey;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppMantenimiento {

    static Scanner sc = new Scanner(System.in);
    static List<Jugador> jugadores = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("=== MENÚ PRINCIPAL DE MANTENIMIENTO ===");
            System.out.println("1. Mantenimiento de jugadores");
            System.out.println("2. Mantenimiento de entrenadores");
            System.out.println("3. Mantenimiento de masajistas");
            System.out.println("4. Mantenimiento de acompañantes");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    mostrarMenuJugadores();
                    break;
                case 2:
                    mantenimientoEntrenadores();
                    break;
                case 3:
                    mantenimientoMasajistas();
                    break;
                case 4:
                    mantenimientoAcompanantes();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    public static void mostrarMenuJugadores() {
        int opcion;
        do {
            System.out.println("\n=== MANTENIMIENTO DE JUGADORES ===");
            System.out.println("1. Añadir jugador");
            System.out.println("2. Modificar datos de jugador existente");
            System.out.println("3. Crear acompañantes (solo SENIORS)");
            System.out.println("4. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    añadirJugador();
                    break;
                case 2:
                    modificarJugador();
                    break;
                case 3:
                    crearAcompañantes();
                    break;
                case 4:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 4);
    }

    private static void añadirJugador() {
        try {
            System.out.print("Nombre: ");
            String nombre = sc.next();

            System.out.print("Edad: ");
            int edad = sc.nextInt();

            System.out.print("Categoría (JUVENIL, SENIOR, etc.): ");
            Equipos categoria = Equipos.valueOf(sc.next().toUpperCase());

            System.out.print("Dorsal: ");
            int dorsal = sc.nextInt();

            System.out.print("Posición (PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO): ");
            Posiciones posicion = Posiciones.valueOf(sc.next().toUpperCase());

            Jugador jugador = new Jugador(nombre, edad, categoria, dorsal, posicion);
            jugadores.add(jugador);
            System.out.println("Jugador añadido correctamente: " + jugador);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: Datos introducidos no válidos.");
        } catch (DorsalDuplicadoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void modificarJugador() {

        listarJugadores();

        System.out.print("Introduce el nombre del jugador a modificar: ");
        String nombre = sc.next();

        Jugador jugador = null;
        for (Jugador j : jugadores) {
            if (j.getNombre().equalsIgnoreCase(nombre)) {
                jugador = j;
                break;
            }
        }

        if (jugador == null) {
            System.out.println("Jugador no encontrado.");
            return;
        }

        try {
            System.out.println("Jugador encontrado: " + jugador);
            System.out.print("Nuevo dorsal (actual " + jugador.getDorsal() + "): ");
            int nuevoDorsal = sc.nextInt();
            jugador.setDorsal(nuevoDorsal);

            System.out.print("Nueva categoría (actual " + jugador.getCategoria() + "): ");
            Equipos nuevaCategoria = Equipos.valueOf(sc.next().toUpperCase());
            jugador.setCategoria(nuevaCategoria);

            System.out.print("Nueva posición (actual " + jugador.getPosicion() + "): ");
            Posiciones nuevaPosicion = Posiciones.valueOf(sc.next().toUpperCase());
            jugador.setPosicion(nuevaPosicion);

            System.out.println("Jugador modificado: " + jugador);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: Datos no válidos.");
        } catch (DorsalDuplicadoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void crearAcompañantes() {

        listarJugadores();

        System.out.print("Introduce el nombre del jugador para añadir acompañante: ");
        String nombre = sc.next();

        Jugador jugador = null;
        for (Jugador j : jugadores) {
            if (j.getNombre().equalsIgnoreCase(nombre)) {
                jugador = j;
                break;
            }
        }

        if (jugador == null) {
            System.out.println("Jugador no encontrado.");
            return;
        }

        if (jugador.getCategoria() != Equipos.SENIOR) {
            System.out.println("Solo los jugadores SENIOR pueden tener acompañantes.");
            return;
        }

        System.out.print("Nombre del acompañante: ");
        String nombreAcomp = sc.next();
        System.out.print("Edad del acompañante: ");
        int edadAcomp = sc.nextInt();

        if (edadAcomp < 18) {
            System.out.println("El acompañante debe ser mayor de edad.");
            return;
        }

        Acompañante acompaniante = new Acompañante(nombreAcomp, edadAcomp, jugador, "Familiar");
        System.out.println("Acompañante creado para " + jugador.getNombre() + ": " + acompaniante);
    }

    private static void listarJugadores() {
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores registrados.");
            return;
        }

        System.out.println("==== JUGADORES DISPONIBLES ====");
        for (int i = 0; i < jugadores.size(); i++) {
            Jugador j = jugadores.get(i);
            System.out.println("Nombre: " + j.getNombre() + " - Edad:  " + j.getEdad() + " - Dorsal: " + j.getDorsal() + " - Categoría: " + j.getCategoria());
        }
    }

    private static void mantenimientoEntrenadores() {
        System.out.println("== Mantenimiento de Entrenadores ==");
    }

    private static void mantenimientoMasajistas() {
        System.out.println("== Mantenimiento de Masajistas ==");
    }

    private static void mantenimientoAcompanantes() {
        System.out.println("== Mantenimiento de Acompañantes ==");
    }

}
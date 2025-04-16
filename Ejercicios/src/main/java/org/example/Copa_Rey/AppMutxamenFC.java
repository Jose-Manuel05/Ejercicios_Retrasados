package org.example.Copa_Rey;

public class AppMutxamenFC {
    public static void main(String[] args) {

        // Crear jugadores para el equipo SENIOR
        Jugador jugador1 = new Jugador("Carlos Vela", 28, Equipos.SENIOR, 10, Posiciones.DELANTERO);
        Jugador jugador2 = new Jugador("Sergio Ramos", 30, Equipos.SENIOR, 4, Posiciones.DEFENSA);
        Jugador jugador3 = new Jugador("Andrés Iniesta", 32, Equipos.SENIOR, 8, Posiciones.CENTROCAMPISTA);
        Jugador jugador4 = new Jugador("David De Gea", 29, Equipos.SENIOR, 1, Posiciones.PORTERO);
        Jugador jugador5 = new Jugador("Gerard Piqué", 31, Equipos.SENIOR, 3, Posiciones.DEFENSA);

        // Crear entrenador del equipo SENIOR
        Entrenador entrenador = new Entrenador("Luis Enrique", 45, Equipos.SENIOR, "4-3-3");

        // Crear masajistas del club
        Masajista masajista1 = new Masajista("Juan Pérez", 40, 15, "Fisioterapia Deportiva");
        Masajista masajista2 = new Masajista("Ana López", 35, 10, "Osteopatía");

        // Crear acompañantes para algunos jugadores
        Acompañante acompañante1 = new Acompañante("María Vela", 50, jugador1, "Madre");
        Acompañante acompañante2 = new Acompañante("Carmen Ramos", 55, jugador2, "Padre");

        System.out.println("\n=== CONCENTRACIÓN DEL EQUIPO ===");
        jugador1.concentrarse();
        jugador2.concentrarse();
        entrenador.concentrarse();
        masajista1.concentrarse();
        acompañante1.concentrarse();

        System.out.println("\n=== ENTRENAMIENTO ===");
        entrenador.entrenar();
        jugador1.entrenar();
        jugador2.entrenar();

        System.out.println("\n=== MASAJES ===");
        masajista1.darMasaje(jugador3);

        System.out.println("\n=== VIAJE A MADRID ===");
        jugador1.viajar("Madrid");
        jugador2.viajar("Madrid");
        entrenador.viajar("Madrid");
        masajista1.viajar("Madrid");
        acompañante1.viajar("Madrid");

        System.out.println("\n=== PLANIFICACIÓN Y ENTRENAMIENTO ===");
        entrenador.palnificarEntrenamiento();
        jugador1.entrenar();
        jugador2.entrenar();

        System.out.println("\n=== DESCANSO ===");
        jugador1.descansar();
        jugador2.descansar();

        System.out.println("\n=== PREPARACIÓN PARA EL PARTIDO ===");
        jugador1.calentar();
        jugador2.calentar();
        jugador3.calentar();

        System.out.println("\n=== PARTIDO ===");
        entrenador.jugarPartido("Barcelona FC");
        jugador1.jugarPartido("Barcelona FC");
        jugador2.jugarPartido("Barcelona FC");

        System.out.println("\n=== ANIMAR AL EQUIPO ===");
        System.out.println(acompañante1.getNombre() + " anima al equipo desde la grada.");
        System.out.println(acompañante2.getNombre() + " anima al equipo desde la grada.");

        System.out.println("\n=== CAMBIOS ===");
        entrenador.hacerCambios();

        System.out.println("\n=== GOL ===");
        jugador1.marcarGol();

        System.out.println("\n=== CELEBRACIÓN ===");
        jugador1.celebrarGol();
        jugador2.celebrarGol();
        entrenador.celebrarGol();
        masajista1.celebrarGol();
        acompañante1.celebrarGol();

        System.out.println("\n=== MASAJES POST-PARTIDO ===");
        masajista1.darMasaje(jugador1);
        masajista2.darMasaje(jugador2);
        masajista2.darMasaje(jugador3);

        System.out.println("\n=== REGRESO A MUTXAMEL ===");
        jugador1.viajar("Mutxamel");
        jugador2.viajar("Mutxamel");
        entrenador.viajar("Mutxamel");
        masajista1.viajar("Mutxamel");
        acompañante1.viajar("Mutxamel");

        System.out.println("\n=== DESCANSO FINAL ===");
        jugador1.descansar();
        jugador2.descansar();

    }
}

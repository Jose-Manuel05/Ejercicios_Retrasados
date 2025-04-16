package org.example.Batalla_Samurais;

import java.util.Scanner;
import java.util.Random;

public class batallaSamurais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] equipo1, equipo2;

        System.out.println("Equipo 1");
        equipo1 = pedirPotencias(sc);

        System.out.println("Equipo 2");
        equipo2 = pedirPotencias(sc);

        System.out.println("¡Empieza la batalla!");
        batalla(equipo1, equipo2);
    }

    public static int[] pedirPotencias(Scanner sc) {
        int[] equipo = new int[7];

        while (true) {
            try {
                System.out.print("Introduce potencia de los samurais: ");
                String linea = sc.nextLine();
                String[] partes = linea.trim().split(" ");

                if (partes.length != 7) {
                    System.out.println("ERROR. Debes introducir exactamente 7 números.");
                    continue;
                }

                int suma = 0;
                boolean valoresInvalidos = false;

                for (int i = 0; i < 7; i++) {
                    equipo[i] = Integer.parseInt(partes[i]);

                    if (equipo[i] < 1 || equipo[i] > 24) {
                        System.out.println("ERROR. La potencia debe estar entre 1 y 24.");
                        valoresInvalidos = true;
                        break;
                    }

                    suma += equipo[i];
                }

                if (valoresInvalidos) {
                    continue;
                }

                if (suma != 30) {
                    System.out.println("ERROR. La potencia total no suma 30.");
                    continue;
                }

                System.out.println("Equipo completado.");
                break;

            } catch (NumberFormatException e) {
                System.out.println("ERROR. Solo se permiten números enteros.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        return equipo;
    }

    public static void batalla(int[] equipo1, int[] equipo2) {
        Random rand = new Random();
        int inicio = rand.nextInt(7);
        System.out.println("La batalla inicia con el Samurai " + (inicio + 1) + ".");

        int bajas1 = 0;
        int bajas2 = 0;

        for (int i = 0; i < 7; i++) {
            int index = (inicio + i) % 7;
            int p1 = equipo1[index];
            int p2 = equipo2[index];

            System.out.print("Samurai " + (index + 1) + ". ");
            if (p1 == 0 && p2 == 0) {
                System.out.println("Ambos están muertos. Se salta ronda.");
                continue;
            }

            if (p1 > p2) {
                equipo2[index] = 0;
                bajas2++;
                System.out.println("Gana Equipo 1. " + p1 + " vs " + p2);
            } else if (p2 > p1) {
                equipo1[index] = 0;
                bajas1++;
                System.out.println("Gana Equipo 2. " + p1 + " vs " + p2);
            } else {
                equipo1[index] = 0;
                equipo2[index] = 0;
                bajas1++;
                bajas2++;
                System.out.println("Empate. Mueren ambos. " + p1 + " vs " + p2);
            }

            if (bajas1 >= 4 && bajas2 >= 4) {
                System.out.println("¡EMPATE! Ambos equipos han tenido 4 o más bajas al mismo tiempo.");
                return;
            } else if (bajas1 >= 4) {
                System.out.println("¡Equipo 2 GANA! Equipo 1 ha tenido " + bajas1 + " bajas.");
                return;
            } else if (bajas2 >= 4) {
                System.out.println("¡Equipo 1 GANA! Equipo 2 ha tenido " + bajas2 + " bajas.");
                return;
            }
        }

        if (bajas1 > bajas2) {
            System.out.println("¡Equipo 2 GANA! Equipo 1 ha tenido " + bajas1 + " bajas contra " + bajas2 + " del Equipo 2.");
        } else if (bajas2 > bajas1) {
            System.out.println("¡Equipo 1 GANA! Equipo 2 ha tenido " + bajas2 + " bajas contra " + bajas1 + " del Equipo 1.");
        } else {
            System.out.println("¡EMPATE! Ambos equipos terminaron con " + bajas1 + " bajas.");
        }
    }


}

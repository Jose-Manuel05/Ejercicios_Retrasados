package org.example.Numero_suerte;

import java.util.Scanner;

public class numeroSuerte {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa): ");
        String fecha = sc.nextLine();

        String [] fechaSeparada = fecha.split("/");
        int dia = Integer.parseInt(fechaSeparada[0]);
        int mes = Integer.parseInt(fechaSeparada[1]);
        int anio = Integer.parseInt(fechaSeparada[2]);

        int suma = dia + mes + anio;
        System.out.println(dia + "+" + mes + "+" + anio + " = " + suma);

        String sumafecha = Integer.toString(suma);
        String operacion = "";
        for (int i = 0; i < sumafecha.length(); i++) {
            operacion += sumafecha.charAt(i);
            if (i != sumafecha.length() - 1) {
                operacion += "+";
            }
        }

        int numeroSuerte = 0;
        while (suma > 0) {
            numeroSuerte += suma % 10;
            suma /= 10;
        }

        System.out.println(operacion + " = " + numeroSuerte);
        System.out.println("Tu número de la suerte es " + numeroSuerte);

    }
}

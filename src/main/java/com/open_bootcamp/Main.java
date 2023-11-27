package com.open_bootcamp;

import java.util.Scanner;

import static com.open_bootcamp.Errores.*;

public class Main {

    public static void main(String[] args) {

       /* errorEjecucion();
        errorLogico();
        try {
            divide(4, 0);
        }   catch (Exception e) {
        System.out.println("Error");
        }*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos números: ");

        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();

        int resultado = numeroA / numeroB;
        System.out.println("Resultado es: " + resultado);
    }
}
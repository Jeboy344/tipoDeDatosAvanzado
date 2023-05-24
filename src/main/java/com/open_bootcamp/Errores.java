package com.open_bootcamp;

import java.util.Scanner;

public class Errores {

    // Tipo de errores

    // 1) Error en tiempo de ejecución: se producen cuando se ejecute el programa y genera que el programa aborte la ejecución
    public static void errorEjecucion(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos números: ");

        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();

        int resultado = numeroA / numeroB;
        System.out.println("Resultado: " + resultado);
    }

    // 2) Error de compilación: ocurren durante el proceso de compilación de un programa de computadora. La compilación es el proceso de convertir el código fuente de un programa escrito
    // Ej: int numeroB = scanner.nextInt() Dará error de compilación, ya que falta ";"

    // 3) Error lógico: Basicamente son errores de malas instrucciones dadas al programa, errores humanos
    public static void errorLogico() {

        Scanner scaTemp = new Scanner(System.in);
        System.out.println("Introduce la temperatura actual: ");

        int temperatura = scaTemp.nextInt();
        if (temperatura < 15) {
            System.out.println("Hace frío");
        } else if (temperatura  < 30) {
            System.out.println("El clima es ideal");
        }else if (temperatura > 30){
            System.out.println("Hace calor");
        }
    }
}

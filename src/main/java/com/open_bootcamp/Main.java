package com.open_bootcamp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
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
        //ToDo: InputStream

        try {
            InputStream fichero = new FileInputStream("/etc/passwd");

            try {
                byte datos []= new byte[5];
                int dato = fichero.read(datos);
                while (dato != -1){
                    // "EOF" (End of File)
                    System.out.print(datos.toString());
                    dato = fichero.read(datos);
                }

            } catch (IOException e) {
                System.out.println("No puedo leer el fichero: " + e.getMessage());;
            }

        } catch (FileNotFoundException e) {
            System.out.println("El programa da error: " + e.getMessage());
        }
    }
}
package com.open_bootcamp;

import static com.open_bootcamp.Errores.*;

public class Main {

    public static void main(String[] args) {

        errorEjecucion();
        errorLogico();
        try {
            divide(4, 0);
        }   catch (Exception e) {
        System.out.println("Error");
        }
    }
}
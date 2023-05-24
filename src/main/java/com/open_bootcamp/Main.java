package com.open_bootcamp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        // ToDo STRING
        /* String cadena = "Mensaje DE TEXTo";

        int cadenaLen = cadena.length();
        System.out.println("La longitud de mi cadena es de: " + cadenaLen);

        String cadenaMinus = cadena.toLowerCase();
        System.out.println("La cadena ahora es: " + cadenaMinus);

        String cadenaMayus = cadena.toUpperCase();
        System.out.println("La cadena ahora es: " + cadenaMayus);

        boolean resultado = cadena.startsWith("Men"); // .endsWith("") (verifica que la cadena acabe por el valor que pasemos por parametro)
        if (resultado) {
            System.out.println("Empieza por lo que estoy buscando");
        } else {
            System.out.println("No empieza por lo que quiero");
        }

        char letra = cadena.charAt(0); // Me indica el caracter según el valor que la posición que le pase por parametro.
        System.out.println("Caracter es: " + letra);

        for (int i = 0; i < cadena.length(); i++) { //Recorrer un string
            System.out.println("Caracter actual: " + cadena.charAt(i));
        }

        //ToDo ARRAYS
        int[] arrayUno = {1, 2, 3, 4, 5};

        for (int i : arrayUno) {
            System.out.println(i);
        }

        String[] nombres = {
                "Andrea",
                "Jesús",
                "Guadalupe"
        };

        System.out.println("Longitud del array: " + nombres.length);

        for (String nombre : nombres){ // Forma corta de recorrer un array
            System.out.println("Nombre actual: " + nombre);
        }

        for (int i = 0; i < nombres.length; i++) { // Forma larga de recorrer un array (Se obtiene la posición)
            System.out.println("Nombre actual: " + nombres[i] + " en posición: " + i);
        }

        int contador = 0; // Recorrer un array con un bucle while
        while (contador < nombres.length) {
            System.out.println("Nombre actual: " + nombres[contador] + " en posición: " + contador);
            contador++;
        }

        int[][] arrayBidi = new int[2][4];
        arrayBidi[0][0] = 1;
        arrayBidi[0][1] = 2;
        arrayBidi[0][2] = 3;
        arrayBidi[0][3] = 4;

        arrayBidi[1][0] = 10;
        arrayBidi[1][1] = 20;
        arrayBidi[1][2] = 30;
        arrayBidi[1][3] = 40;

        for (int i = 0; i < arrayBidi.length; i++) { // Recorrer un array Bidi
            System.out.println("Valor de i: " + i);

            for (int j = 0; j < arrayBidi[1].length; j++) {
                System.out.println("Estoy en i = " + i + ", j = " + j);
                System.out.println(arrayBidi[i][j]);
            }
        }

        // 2 filas x 4 columnas
        int[][] arrayBidi1 = {
                {1, 2, 3, 4},
                {10, 20, 30, 40}
        };

        String nombres1[] = {"Andrea", "Jesús"};
        nombres1[0] = "Guadalupe";
        nombres1[1] = "Enrique";

        for (String nombre1 : nombres1) {
            System.out.println(nombre1);
        }

        // ToDo VECTORES
        Vector<Integer> vector = new Vector(16); // Se puede agregagar la capacidad inicial y la capacidad de incremento una vez superada la capacidad
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);

        System.out.println("Datos del vector: " + vector);

        vector.remove(2);
        System.out.println("Datos del vector: " + vector);

        System.out.println("Vector tamaño: " + vector.size() + " y capacidad: " + vector.capacity());

        Vector<Integer> vector2 = new Vector();
        vector2.add(1);
        vector2.add(2);

        boolean resultado = vector.equals(vector2);
        System.out.println("Son iguales? " + resultado);

        for (int i : vector) { // Recorrer un vector sin poder acceder a su posición
            System.out.println("Valor actual en vector: " + i);
        }

        for (int i = 0; i < vector.size(); i++) { // Recorrer un vector accediendo a su posición
            if (i % 2 == 0) {
                vector.remove(i);
                continue;
            }

            System.out.println("Valor es: " + vector.get(i) + " en posición: " + i);
        }

        System.out.println(vector.get(3));
        vector.remove(3);
        System.out.println(vector.get(3));

        System.out.println("Capacidad de vector: " + vector.capacity() + " Tamaño: " + vector.size());
        vector.trimToSize(); // Decrece el tamaño del vector al tamaño actual
        System.out.println("Capacidad de vector: " + vector.capacity() + " Tamaño: " + vector.size());

        // ToDo ARRAYLIST
        // CapacidadArrayList = CapacidadArrayList + (CapacidadArrayList * 0.5); Los ArrayList solo aumentan el 50% de su capacidad inicial
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");

        lista.remove(2);
        System.out.println("Contenido: " + lista);

        for (String nombre : lista) {
            System.out.println(nombre);
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        String array[] = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            array[i] = lista.get(i);
        }
        for (String elemento : array) {
            System.out.println("Elemento es: " + elemento);
        }

        for(Object arrayObjeto : lista.toArray()){
            System.out.println(arrayObjeto.toString());
        }

        // ToDo LINKEDLIST
        LinkedList<String> listaEnlazada = new  LinkedList<String>();

        // ToDo BigDecimal
        BigDecimal valorA = new BigDecimal(3.14);
        BigDecimal valorB = new BigDecimal(3.15);

        // Suma el BigDecimal "valorB" a "ValorA"
        BigDecimal resultado = valorA.add(valorB);

        // Imprime la suma
        System.out.println(resultado.toString()); */


    }
}
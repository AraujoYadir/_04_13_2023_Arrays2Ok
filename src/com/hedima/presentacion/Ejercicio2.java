package com.hedima.presentacion;

import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Dado los siguientes arrays, hacer un bloque de código que construya un array de la siguiente manera:
        //char[] cars1 = new char[]{'1','2','3','4','5','6'};
        //char[] cars2 = new char[]{'a','e','r','t','y','u'};
        //El array resultado que se debe de construir es el siguiente:
        //char[] result = new char[]{'1','a','2','e','3','r','4','t','5','y','6','u'};
        char[] cars1 = new char[]{'1','2','3','4','5','6'};
        char[] cars2 = new char[]{'a','e','r','t','y','u'};

        // Este Ej se entiende mejor

        char[] result = new char[cars1.length + cars2.length];
        int index = 0;
        for (int i = 0; i < cars1.length; i++) {
            result[index]= cars1[i];
            index++;
            result[index]= cars2[i];
            index++;
        }
        System.out.println(Arrays.toString(result));

    }
}

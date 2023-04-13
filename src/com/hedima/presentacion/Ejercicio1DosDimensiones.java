package com.hedima.presentacion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1DosDimensiones {
    public static void main(String[] args) {
        //Declarar un array de 2x2
        //Dar valor a cada una de las celdas por la consola

        int[][] array = new int[2][2];
        Scanner SC1= new Scanner(System.in);
        for (int i=0; i< array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                System.out.println("intrudocir fila" + i + " columna" + j + " ");
                array[i][j] = SC1.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));

    }
}

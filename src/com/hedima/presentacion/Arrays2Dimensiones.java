package com.hedima.presentacion;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2Dimensiones {
    public static void main(String[] args) {
        int[][] numeros = new int[3][2] ;// numero de filas 3 y numeros de columnas 2
        numeros [0][0]=5;
        numeros [0][1]=3;
        numeros [0][2]=10;
        numeros [0][3]=12;
        numeros [0][4]=19;
        numeros [0][5]=13;

        System.out.println(Arrays.deepToString(numeros));

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Fila " + i);
            for (int j = 0; j<numeros[i].length; j++){ //La cantidad de columnas se obtiene de las filas
                System.out.println("Elemento de la Fila " + i + " Columna " + j+ "->" + numeros[i][j]);
            }
        }

    }
}

package com.hedima.presentacion;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio2DosDimesiones {
    public static void main(String[] args) {
        int[][] nums = new int[3][];
        nums[0]= new int[3];
        nums[1]= new int[4];
        nums[2]= new int[5];
        Random r1 = new Random(); // Para asignar los numeros aleatorios

        for(int i=0; i<nums.length; i++) {
            System.out.println("Fila " + i);
            for (int j=0; j<nums[i].length; j++) {
                nums[i][j] = r1.nextInt(50); // Para que asigne los valores hasta 50
            }
        }
        System.out.println(Arrays.deepToString(nums));

    }
}

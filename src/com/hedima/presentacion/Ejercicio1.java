package com.hedima.presentacion;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8};
        for (int a =1; a<num.length; a++) {
            if (num[a]%2==0) {
                System.out.println(num[a] + "Par");
            }
            else {
                System.out.println(num[a] + "Impar");
            }
            if (num[a]%3==0) {
                System.out.println(num[a] + "Multiplo de 3");
            }
        }

    }
}

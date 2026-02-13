package ExercicioArray;

/*
* Escreva um programa em Java para ordenar um array de números inteiros
* em ordem decrescente sem usar funções de ordenação nativas.
*/

import java.util.Arrays;

public class Exercicio2 {
    public static void main(String[] args){

        int [] array1 = {1789, 2035, 1899, 1456, 2013, 1458, 2458,
                1254, 1472, 2365, 1456, 2165, 1457, 2456};

        for (int i = 0; i < array1.length - 1; i++) {
            for (int j = 0; j < array1.length - 1 - i; j++) {
                if (array1[j] < array1[j + 1]) {
                    int temp = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}

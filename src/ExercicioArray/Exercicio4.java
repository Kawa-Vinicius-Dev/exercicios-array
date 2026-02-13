package ExercicioArray;

/*
* Escreva um programa em Java para ordenar um vetor de números
* de ponto flutuante usando o algoritmo de ordenação por seleção.
*/

import java.util.Arrays;

public class Exercicio4 {
    public static void main(String[] args){
        int [] array1 = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};

        for (int i = 0; i < array1.length - 1; i++){
            int menor = i;
            for (int j = i + 1; j < array1.length; j++){
                if (array1[j] < array1[menor]){
                    menor = j;
                }
            }
            int temp = array1[menor];
            array1[menor] = array1[i];
            array1[i] = temp;
        }
        System.out.println(Arrays.toString(array1));
    }
}

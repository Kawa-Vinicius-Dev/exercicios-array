package ExercicioArray;

/*
* Escreva um programa em Java para ordenar um array de
* strings com base em seu comprimento, em ordem crescente.
*/

import java.util.Arrays;

public class Exercicio3 {
    public static void main(String[] args){

        String[] array1 = {"Java", "Python", "PHP", "C#", "Programação em C", "C++"};

        for (int i = 0; i < array1.length - 1; i++) {
            for (int j = 0; j < array1.length - 1 - i; j++) {
                if (array1[j].length() > array1[j + 1].length()) {
                    String temp = array1[j+1];
                    array1[j+1] = array1[j];
                    array1[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}

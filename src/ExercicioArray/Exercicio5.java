package ExercicioArray;

/*
 * Escreva um programa em Java para ordenar um array de palavras
 * pelo número de letras que cada palavra contém.
 */

import java.util.Arrays;

public class Exercicio5 {
    public static void main(String[] args) {
        String[] array1 = {"Java", "Python", "PHP", "C#", "C Programming", "C++", "Ruby", "C"};

        for (int i = 0; i < array1.length - 1; i++) {
            int menor = i; // INDICE 0 = MENOR

            for (int j = i + 1; j < array1.length; j++) {
                if (array1[j].length() < array1[menor].length()) {
                    menor = j;
                }
            }

            if (menor != i) {
                String temp = array1[i];
                array1[i] = array1[menor];
                array1[menor] = temp;
                System.out.println("Troquei " + array1[menor] + " com " + array1[i]);
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}

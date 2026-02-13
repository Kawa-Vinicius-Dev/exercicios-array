package ExercicioArray;

/*
* Escreva um programa em Java para ordenar um array numérico e um array de strings.
*/

import java.util.Arrays;

public class Exercicio1 {
    public static void main(String[] args){

        int [] array1 = {1,3,6,2,4,9,7,8,5};
        String [] array2 = {"Java", "Python", "C", "C+", "JavaScript", "CSS", "HTML"};

        System.out.println(gerarTexto(array1,array2));
        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println(gerarTexto(array1,array2));
    }
    private static String gerarTexto (int [] array1, String [] array2){
        return "Array dos números: " + Arrays.toString(array1) +
                "\nArray das Strings: " + Arrays.toString(array2);
    }
}
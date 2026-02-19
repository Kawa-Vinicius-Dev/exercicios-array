package ExercicioArray;

/*
* Write a Java program to find the sum of alternate elements in an array.
*/

public class Exercicio7 {
    public static void main(String[] args){
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int soma = 0;
        for ( int i = 0; i < array1.length; i++){ // ou int i : array1
            if (i % 2 == 0){
                System.out.println(array1[i]);
                int temp = array1[i];
                soma = soma + temp;
            }
        }
        System.out.println( "Soma: " + soma);
    }
}

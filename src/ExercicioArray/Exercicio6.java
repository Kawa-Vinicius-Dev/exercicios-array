package ExercicioArray;

/*
* Write a Java program to sum values of an array.
*/

public class Exercicio6 {
    public static void main(String[] args){

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int soma = 0;
        //inicia com i = 0 ... continua ate a variavel i ser menor que array 1; a cada repetição soma 1 ao i.
        for (int i = 0; i < array1.length; i++){
            soma = array1[i] + soma;
        }
        System.out.println(soma);
    }
}

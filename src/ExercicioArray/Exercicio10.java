package ExercicioArray;

/*
* Write a Java program to calculate the sum of an array using recursion.
*/

public class Exercicio10 {
    public static void main(String[] args) {

        int[] myarray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int soma = soma(myarray, 0);
        System.out.println(soma);

    }

    private static int soma(int[] myarray, int indice) {
        if (indice == myarray.length) {
            return 0;
        } else {
            return myarray[indice] + soma(myarray, indice + 1);
        }
    }

    private static int maiorNumero(int[] myarray, int indice) {
        if (indice == myarray.length - 1) {
            return myarray[indice];

        } else {
            int maior = maiorNumero(myarray, indice + 1);
            if (maior > myarray[indice]) {
                return maior;
            } else {
                return myarray[indice];
            }
        }
    }
}

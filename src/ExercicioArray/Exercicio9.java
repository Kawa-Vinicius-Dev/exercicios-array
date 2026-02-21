package ExercicioArray;

/*
* Write a Java program to find the sum of digits of each element in an array.
*/

public class Exercicio9 {
    public static void main(String[] args) {

        int[] numero = {111, 222, 333, 444, 555, 666, 777, 888, 999};

        for (int i = 0; i < numero.length; i++) {

            int numeroAtual = numero[i];
            int soma = 0;

            while (numeroAtual > 0){
                int ultimoDigito = numeroAtual % 10;
                soma += ultimoDigito;
                numeroAtual /= 10;
            }
            System.out.println("A soma dos números: " + numero[i] + " é igual a: " + soma );
        }
    }
}
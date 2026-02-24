package ExercicioArray;

/*
 * Write a Java program to find the average of prime numbers in an integer array.
 */

public class Exercicio18 {
    public static void main(String[] argst) {

        int[] numeros = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int soma = 0;
        // numeros primos == 1 e divido por ele mesmo == 1 , 3 , 5 , 7 , 11

        for (int i = 0; i < numeros.length; i++) {// percorre meu array
            int num = numeros[i];
            boolean ehPrimo = true;
            if (num <= 1) {
                continue;
            }
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo) {
                soma += num;
            }
        }
        System.out.println("Soma dos numeros primos: " + soma);
    }
}
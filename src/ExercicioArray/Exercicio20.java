package ExercicioArray;

/*
* Write a Java program to compute the average of elements greater than a specified threshold.
*/

public class Exercicio20 {
    public static void main(String[] args){
        int [] numeros = new int[]{5, 10, 15, 20, 25, 30, 35};
        int soma = 0;
        int contador = 0;

        for (int numero : numeros){
            int valorMim = 20;
            if (numero > valorMim) {
                soma += numero;
                contador++;
            }
        }
        if(contador > 0){
            double media = (double) soma / contador;
            System.out.println("média: " + media);
        }else {
            System.out.println("Dividendo é igual a zero.");
        }

    }
}

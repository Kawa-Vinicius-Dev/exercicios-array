package ExercicioArray;

/*
* Write a Java program to calculate the moving average of a given list of numbers.
*/

public class Exercicio19 {
    public static void main(String[] args){
        int [] numeros = new int[]{5, 10, 15, 20, 25, 30, 35};
        int janela = 3;

        for (int i = 0; i < numeros.length - janela + 1; i++){
            int soma = 0;

            for (int j = 0; j < janela ; j++){
            soma += numeros[i+j];
            }
            System.out.println("a média da janela " + i + " é igual: " + (double) soma / janela);
        }
    }
}

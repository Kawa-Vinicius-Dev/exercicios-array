package ExercicioArray;

/*
* Write a Java program to calculate the weighted average of numbers in an array.
*/

public class Exercicio17 {
    public static void main(String[] args){
        int [] notas = new int[] {640, 720, 680, 700, 900};
        int [] pesos = new int[] {2, 3, 2, 2, 4};

        int multi = 0;
        int soma =0;

        for (int i = 0; i < notas.length; i++){
            multi += notas[i] * pesos[i];
            soma += pesos[i];
        }
        int mediaFinal = multi / soma;
        System.out.println("média ponderada: " + mediaFinal);
    }
}

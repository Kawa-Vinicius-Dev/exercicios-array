package ExercicioArray;

/*
*
*/

public class Exercicio8 {
    public static void main(String[] args){
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int somaPar = 0;
        int somaImpar = 0;
        for (int i = 0; i < array1.length; i++){
            if (array1[i] % 2 == 0) {
                System.out.println("O valor de (" + array1[i] + ") no índice (" + i + ") é par" );
                somaPar = array1[i] + somaPar;
            }else{
                System.out.println("O valor de (" + array1[i] + ") no índice (" + i + ") é ímpar" );
                somaImpar += array1[i];
            }
        }
        System.out.println("Soma dos números pares == " + somaPar);
        System.out.println("Soma dos números ímpares == " + somaImpar);
    }
}

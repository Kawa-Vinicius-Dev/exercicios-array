package ExercicioArray;

/*
* Calculate the average value of array elements
*/

public class Exercicio16 {
    public static void main(String[] args){

        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        int soma = 0;

        for (int i = 0; i < numbers.length; i++){
            soma += numbers[i];
        }
        double media = (double) soma / numbers.length;
        System.out.printf("soma: %.2f", media);
    }
}

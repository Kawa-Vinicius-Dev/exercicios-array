package ExercicioArray;

/*
 * Write a Java program to print a Pascal’s triangle using an array.
 */

public class Exercicio15 {
    public static void main(String[] args) {
        // triangulo de pascal... inicial = 1 e final = 1
        int[][] myarray = new int[7][7];

        for (int i = 0; i < myarray.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    myarray[i][j] = 1;
                } else {
                    myarray[i][j] = myarray[i - 1][j - 1] + myarray[i - 1][j];
                }
                System.out.print(myarray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

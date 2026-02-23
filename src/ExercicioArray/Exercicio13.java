package ExercicioArray;

/*
 * Write a Java program to print a checkerboard pattern using a 2D array.
 */

public class Exercicio13 {
    public static void main(String[] argsS) {

        int[][] myarray = new int[10][10];

        for (int i = 0; i < myarray.length; i++) {
            for (int j = 0; j < myarray.length; j++) {

                if ((i + j) % 2 > 0) {
                    System.out.print("*");
                } else {
                    System.out.print(myarray[i][j]);
                }
            }
            System.out.println();
        }
    }
}


package ExercicioArray;

/*
* Print the specified grid
*/

public class Exercicio11 {
    public static void main(String[] args) {
        int[][] a = new int[10][10];

        int[][] myarray = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(myarray[i][j]);
            }
            System.out.println();
        }
    }
}



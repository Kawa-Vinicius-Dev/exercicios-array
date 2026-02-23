package ExercicioArray;

/*
* Write a Java program to print a diagonal pattern of stars in a square matrix.
*/

public class Exercicio12 {
    public static void main(String[] args){

        int [][] myarray = new int[5][5];

        for (int i = 0; i < myarray.length; i++){

            for (int j = 0; j < myarray.length; j++){

                if (i == j){

                    System.out.print("*");

                }else {
                    System.out.print(myarray[i][j]);
                }
            }
            System.out.println();
        }
    }
}

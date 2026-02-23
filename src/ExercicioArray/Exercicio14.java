package ExercicioArray;

/*
* Write a Java program to print a triangle pattern with increasing numbers.
*/

public class Exercicio14 {
    public static void main (String[] args){

        int [][] myarray = new int[5][5];

      for (int i = 0; i < 5  ; i++){

          int somaIndices = 1;

          for (int j = 0; j <= i; j++){

              myarray[i][j] = somaIndices++;
              System.out.print(myarray[i][j]);
          }
          System.out.println();
      }

    }
}

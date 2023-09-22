package RepasoExcepciones;

import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {

        int[][] arr = new int[2][3];
        for (int i=0;i< arr.length;i++){
            for (int j = 0;j<1;j++){

                arr[i][j]=i;

            }
        }

        for (int i=0;i<arr.length-1;i++){
            for (int j = 0;j<1;j++){

                System.out.println(arr[i][j]);

            }
        }






    }
}

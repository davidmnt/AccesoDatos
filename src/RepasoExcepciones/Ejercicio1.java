package RepasoExcepciones;

import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {

        int[][] arr = new int[2][3];

        for (int i=0;i<arr.length;i++){
            for (int j = 0;j<2;j++){

                arr[i][j]=i+j;

            }
        }

try {
    System.out.println(arr[2][3]);
}catch (ArrayIndexOutOfBoundsException e){
    System.out.println("No me puedes dar una dimension mas grande que el array");
}







    }
}

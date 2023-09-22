package RepasoExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        //Usando printStackTrace() te da la excepcion que genera

        //Ejercicio2
        int num = 10;
        int num1 = 0;

        try {
            System.out.println(num / num1);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        //Ejercicio3

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero entero");

        try {
            num = sc.nextInt();

        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

    }

}

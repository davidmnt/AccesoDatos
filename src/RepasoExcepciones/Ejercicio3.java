package RepasoExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        //Vamos a forzar la excepcion pidiendole al usuario por pantalla un numero
        //y a la hora de introducir un numero le voy a introducir otro tipo de dato

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero entero");
        try {
            num = sc.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Error introduceme un numeor por favor");
        }
    }
}

package RepasoJava;

import org.apache.commons.io.FileUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n1.Ej1. \n2.Ej2. \n3.Ej3. \n4.Ej4. \n5.Ej5." +
                "\n6.Ej6. \n7.Ej7. \n8.Ej8.");

        System.out.println("Elige un ejercicio");
        int opcion = sc.nextInt();

        switch (opcion){

            case 1: Ejercicios.ej1();
            break;
            case 2: Ejercicios.ej2();
            break;
            case 3: Ejercicios.ej3();
            break;
            case 4: Ejercicios.ej4();
            break;
            case 5: Ejercicios.Ej5();
            break;
            case 6: Ejercicios.ej6();
            break;
            case 7: Ejercicios.ej7();
            break;
            case 8: Ejercicios.ej8();

        }


    }

}

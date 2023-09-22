package RepasoExcepciones;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime que has sacado en AD");
        int nota = sc.nextInt();

        switch (nota) {

            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                throw new Exception("Has suspendido");

            case 5:
                System.out.println("Suficuente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");

        }
    }
}

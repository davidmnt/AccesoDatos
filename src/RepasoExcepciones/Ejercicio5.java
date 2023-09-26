package RepasoExcepciones;

import java.util.Scanner;

public class Ejercicio5 {


    public static void main(String[] args) throws Exception {

        System.out.println(b());

        //Lo que sucede si pones una excepcion en la funcion c()
        //sera la propagacion de la excepcion en la funcion b() y en el main() throws Exception

    }

    private static int b() throws Exception {
        return c();
    }

    private static int c() throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int num = sc.nextInt();

        if (num <= 0) {
            throw new Exception("No me introduzcas valores negativos o cero");
        }


        return num;

    }

}

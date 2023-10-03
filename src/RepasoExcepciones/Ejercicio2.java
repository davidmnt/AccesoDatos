package RepasoExcepciones;
public class Ejercicio2 {
    public static void main(String[] args) {

        int num = 10;
        int num1 = 0;

        try {
            System.out.println(num / num1);
        } catch (ArithmeticException e) {
            System.out.println("No puedes introducir un numero menos a uno");
        }
    }
}

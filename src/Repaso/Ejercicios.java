package Repaso;

import javax.swing.*;
import java.util.*;

public class Ejercicios {

    public static Scanner sc = new Scanner(System.in);

    public static void ej1() {


        System.out.println("Dime el nombre de usuario");
        String usuario = sc.nextLine();
        System.out.println("Dime la edad");
        int edad = sc.nextInt();
        System.out.println("Buenos dias: " + usuario + "," + edad);

    }

    public static void ej2() {

        ArrayList num = new ArrayList<>();


        System.out.println("Dime un numero");
        int numero1 = sc.nextInt();
        System.out.println("Dime otro numero");
        int numero2 = sc.nextInt();
        System.out.println("Dime un ultimo numero");
        int numero3 = sc.nextInt();

        num.add(numero1);
        num.add(numero2);
        num.add(numero3);
        Collections.sort(num);

        for (Object a : num) {
            System.out.println(a);
        }


    }

    public static void ej3() {

        String palabra = JOptionPane.showInputDialog("Dime una palabra poniendo");

        char[] arr = new char[palabra.length()];

        arr = palabra.toCharArray();


        for (int i = 0; i < arr.length; i++) {

            if (Character.isLowerCase(arr[i])) {
                JOptionPane.showMessageDialog(null, "El caracter: " + arr[i] + "" + " esta en minuscula");
            } else if (Character.isDigit(arr[i])) {
                JOptionPane.showMessageDialog(null, "No es un caracter");
            } else {
                JOptionPane.showMessageDialog(null, "El caracter: " + arr[i] + "" + " esta en mayuscula");
            }
        }

    }

    public static void ej4() {
        System.out.println("Dime que has sacado en AD");
        int nota = sc.nextInt();

        switch (nota) {

            case 0:
                System.out.println("Insuficiente");
                break;
            case 1:
                System.out.println("Insuficiente");
                break;
            case 2:
                System.out.println("Insuficiente");
                break;
            case 3:
                System.out.println("Insuficiente");
                break;
            case 4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficuente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
                System.out.println("Notable");
                break;
            case 8:
                System.out.println("Notable");
                break;
            case 9:
                System.out.println("Notable");
                break;
            case 10:
                System.out.println("Sobresaliente");

        }
    }

    public static void Ej5() {

        int numRnadom = (int) (Math.random() * 100);
        boolean numAcertado = false;

        System.out.println(numRnadom);

        do {
            System.out.println("Adivina el numero");
            int num = sc.nextInt();
            if (num == numRnadom) {
                System.out.println("¡Muy bien has acertado!");
                numAcertado = true;

            } else if (num != numRnadom) {
                System.out.println("No es el numero acertado");

                if (num > numRnadom) {
                    System.out.println("El numero es menor");
                } else if (num < numRnadom) {
                    System.out.println("El numero es mayor");

                }
            }

        } while (numAcertado != true);
    }

    public static void ej6() {


        System.out.println("Dime un numero del 0 al 10");
        int num = sc.nextInt();

        if (num < 0 && num > 10) {
            System.out.println("Me has introducido un valor incorrecto");
        } else if (num >= 0 && num <= 10) {

            for (int i = 0; i < 20; i++) {
                int result = num * i;
                System.out.println(result);

            }

        }
    }

    public static void ej7() {

        int[] arrNum = new int[5];


        System.out.println("Dime 1 numero");
        int num1 = sc.nextInt();
        arrNum[0] = num1;
        System.out.println("Dime 2 numero");
        int num2 = sc.nextInt();
        arrNum[1] = num2;
        System.out.println("Dime 3 numero");
        int num3 = sc.nextInt();
        arrNum[2] = num3;
        System.out.println("Dime 4 numero");
        int num4 = sc.nextInt();
        arrNum[3] = num4;
        System.out.println("Dime 5 numero");
        int num5 = sc.nextInt();
        arrNum[4] = num5;

        for (int i = 0; i < arrNum.length; i++) {

            System.out.println(arrNum[i]);

        }


        System.out.println("La media del array es: " + calcularMediaArray(arrNum));

    }

    private static int calcularMediaArray(int[] num) {


        int media = 0;
        int result = 0;

        for (int i = 0; i < num.length; i++) {

            media = num[i] + media;


        }
        result = media / 5;

        return result;
    }

    public static void ej8() {

        ArrayList<String> marca = new ArrayList<>();

        System.out.println("Dime una marca de coches");
        String marca1 = sc.nextLine();
        marca.add(marca1);
        System.out.println("Dime una marca de coches");
        String marca2 = sc.nextLine();
        marca.add(marca2);
        System.out.println("Dime una marca de coches");
        String marca3 = sc.nextLine();
        marca.add(marca3);
        System.out.println("Dime una marca de coches");
        String marca4 = sc.nextLine();
        marca.add(marca4);

       for (Object a:pares(marca)){

           System.out.println("Marca: " + a);
       }
    }

    private static ArrayList pares(ArrayList<String> arr) {
        ArrayList<String> marca = new ArrayList<>();

       for(int i = 0;i<arr.size();i++){

           if(i % 2==0){

               marca.add(arr.get(i));

           }
       }

        return marca;
       }
}
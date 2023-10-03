package EjercicioFicheros;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaramos el fichero
        File f = new File("Ejercicio2");
        //Declaramos fichero 1 y 2
        File f1 = new File(f,"Fichero1.txt");
        File f2 = new File(f,"Fichero2.txt");

        //Abrimos un try catch para la excepcion IOException y dentro cremos el directorio y los ficheros
        try {

            f.mkdir();
            f1.createNewFile();
            f2.createNewFile();

            //Declaro un Scanner para pedir al usuario si desea eliminar todo de esta forma compruebo si lo crea y despues si lo elimina correctamente

            System.out.println("¿Quieres eliminar todo? s or n");
            char opcion = sc.next().charAt(0);
            if(opcion == 's') {

                f1.delete();
                f2.delete();
                f.delete();

            }
        }catch (IOException e){
            System.out.println("No se ha creado corectamente");
        }
    }
}

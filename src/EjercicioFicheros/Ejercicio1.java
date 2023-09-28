package EjercicioFicheros;

import java.io.*;

public class Ejercicio1 {
    public static void main(String[] args) {

        //Declaramos el fichero
        File f = new File("Ejercicio1");
        //Declaramos fichero 1 y 2
        File f1 = new File(f,"Fichero1.txt");
        File f2 = new File(f,"Fichero2.txt");
        File rename = new File(f,"Fichero1_copia.txt");



        try {

            f.mkdir();
            f1.createNewFile();
            f2.createNewFile();
            f1.renameTo(rename);


        }catch (IOException e){
            System.out.println("No se ha creado corectamente");
        }







    }


}

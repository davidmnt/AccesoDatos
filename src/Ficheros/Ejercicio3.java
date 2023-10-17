package Ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args)  {

        File ficher1 = new File("FichText.txt");

        try {
            ficher1.createNewFile();


            FileWriter fw = new FileWriter(ficher1);

            fw.write("Esto es texto escrito en un fichero de texto");

            fw.close();

        }catch (IOException e){
            System.out.println("Error");
        }

    }
}

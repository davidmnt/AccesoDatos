package Ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio4 {
    public static void main(String[] args) {

        File f1 = new File("FichText.txt");
        String cadena;

        try {

            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);

            cadena = br.readLine();

            System.out.println(cadena);

            br.close();

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}

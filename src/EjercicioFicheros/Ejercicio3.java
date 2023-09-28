package EjercicioFicheros;

import java.io.File;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) {
        int cont = 0;
        File d = new File("C:\\Users\\DavidMontejanoM\\IdeaProjects\\AccesoDatos\\");

            //Creas un Array del tipo File[] = directorio.listFiles()

            File[] ficheros = d.listFiles();

            //Despes haces un for para recorrer el array de ficheros


            for (int i=0;i< ficheros.length;i++){
               cont++;
            }

            System.out.println(cont);





    }
}

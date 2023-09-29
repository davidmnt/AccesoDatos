package EjercicioFicheros;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Ejercicio8 {
    public static void main(String[] args) {

        File d = new File("Ejercicio8");
        //Creamos el fichero en la carpera padre
        File f = new File("F2");

        try {

            d.mkdir();
            f.createNewFile();

            //Despues de crear todo copiamos el fichero que habiamos creado en el padre
            // y lo copiamos al directorio creado
            FileUtils.moveFileToDirectory(f,d,true);
            System.out.println("Fichero copiado");
        }catch (IOException e){
            System.out.println("Error");
        }

    }



}

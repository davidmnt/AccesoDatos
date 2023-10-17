package EjercicioFicheros;



import java.io.File;
import java.io.IOException;

public class Ejercicio7 {
    public static void main(String[] args) {

        File d = new File("Ejercicio7");
        //Creamos el fichero en la carpera padre
        File f = new File("F1");

        try {

            d.mkdir();
            f.createNewFile();

            //Despues de crear todo copiamos el fichero que habiamos creado en el padre
            // y lo copiamos al directorio creado
          //  FileUtils.copyFileToDirectory(f, d);
            System.out.println("Fichero copiado");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}

package EjercicioFicheros;

import java.io.File;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) {
        int cont = 0;
        File d = new File("C:\\Users\\DavidMontejanoM\\IdeaProjects\\AccesoDatos\\");

            //Creas un Array del tipo File[] = directorio.listFiles()
            File[] ficheros = d.listFiles();

            //Despues haces un for para recorrer el array de ficheros
            for (int i=0;i< ficheros.length;i++){
                //Usamos el contador para ver las veces que recorre el array de ficheros
               cont++;
            }
            //Imprimimos la cantidad de veces que recorre el array
            System.out.println(cont);
    }
}

package EjercicioFicheros;

import java.io.File;

public class Ejercicio5 {
    public static void main(String[] args) {

        File d = new File("C:\\Users\\DavidMontejanoM\\IdeaProjects\\AccesoDatos");

        File[] ficheros = d.listFiles();

        for (int i=0;i< ficheros.length;i++){

                System.out.println(ficheros[i].getName() + " es fichero? " + ficheros[i].isFile());

        }


    }
}

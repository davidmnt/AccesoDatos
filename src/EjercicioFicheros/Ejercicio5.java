package EjercicioFicheros;

import java.io.File;

public class Ejercicio5 {
    public static void main(String[] args) {

        //crear un file para acceder a un directorio del ordenador

        File d = new File("C:\\Users\\DavidMontejanoM\\IdeaProjects\\AccesoDatos");

        //Creamos un array con los ficheros del directorio creado antes

        File[] ficheros = d.listFiles();

        //Y lo recorremos en el array para ver si es un fichero o un directorio
        for (int i=0;i< ficheros.length;i++){

                System.out.println(ficheros[i].getName() + " es fichero? " + ficheros[i].isFile());

        }
    }
}

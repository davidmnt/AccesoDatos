package EjercicioFicheros;

import java.io.File;

public class Ejercicio4 {
    public static void main(String[] args) {

        File f = new File("C:\\Users\\DavidMontejanoM\\IdeaProjects\\AccesoDatos");

        System.out.println("Informacion sobre el fichero:");
        System.out.println("Nombre del fichero: " + f.getName());
        System.out.println("Ruta: " + f.getPath());
        System.out.println("Ruta absoluta: "+ f.getAbsolutePath());
        System.out.println("Se puede leer: " + f.canRead());
        System.out.println("Se puede escribir: " + f.canWrite());
        System.out.println("Tamanyo: " + f.length());
        System.out.println("Es un directorio: " + f.isDirectory());
        System.out.println("Es un fichero: " + f.isFile());
        System.out.println("Nombre del directorio padre: " + f.getParent());


    }
}

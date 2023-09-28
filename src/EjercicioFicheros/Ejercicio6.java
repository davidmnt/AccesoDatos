package EjercicioFicheros;

import java.io.File;
import java.io.IOException;

public class Ejercicio6 {
    public static void main(String[] args) throws IOException {

        File d = new File("C:\\Users\\DavidMontejanoM\\IdeaProjects\\AccesoDatos");
        File f1 = new File(d,"Fichero1.txt");
        File f2 = new File(d,"Fichero2.txt");

        f1.createNewFile();
        f2.createNewFile();

        File fichero;

        for(int i = 0;i< d.list().length;i++){
            fichero = new File(d,d.list()[i]);
            for (int j = 0;j< args.length;j++){
                if(fichero.getName().equals(args[j])){
                    System.out.println("Nombre del fichero: " + fichero.getName() + " ¿Es un fichero? " + fichero.isFile() + " ¿Es un directorio? " + fichero.isDirectory());
                }
            }
        }

    }
}

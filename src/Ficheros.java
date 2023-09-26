import java.io.*;
import java.util.Scanner;

public class Ficheros {
    public static void main(String[] args) {

        //Declaramos el fichero
        File f = new File("NuevoFic");
        //Declaramos fichero 1 y 2
        File f1 = new File(f,"Fichero1.txt");
        File f2 = new File(f,"Fichero2.txt");
        File rename = new File(f,"Fichero2_copia.txt");



        try {

            f.mkdir();
            f1.createNewFile();
            f2.createNewFile();
            f2.renameTo(rename);


        }catch (IOException e){
            System.out.println("No se ha creado corectamente");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Quieres borrar el fichero 1");
        char opcion = sc.next().charAt(0);
        if(opcion == 's'){
            f1.delete();
            System.out.println("Borrado correctamente");
        }else {
            System.out.println("No se ha borrado el fichero");
        }






    }


}

package ObjetosFicheros;

import java.io.*;
import java.util.ArrayList;

public class ficherosBinariosPersona {

    private static ArrayList<Persona> arrPer = new ArrayList<Persona>();
    private static Persona p;
    private static Persona p2;

    public static void main(String[] args) {

        File f = new File("Personas.txt");
        File dir = new File("C:\\Users\\DavidMontejanoM\\IdeaProjects\\AccesoDatos");
        File[] ficheros = dir.listFiles();
        try{

            for(int i = 0; i < ficheros.length; i++){

                if(ficheros[i].equals(f)){
                    f.delete();
                    System.out.println("Fichero eliminado");
                }
            }
            f.createNewFile();
            System.out.println("Fichero creado");

        }catch (IOException e){
            System.out.println("Error al crear el archivo");
        }

        guardarObjeto(f);
        recuperarObjeto(f);


    }

    private static void guardarObjeto(File f){
        p = new Persona("David",21,"12345S");
        p2 = new Persona("Miguel",20,"123698Q");

        arrPer.add(p);
        arrPer.add(p2);

        try {

            FileOutputStream fs = new FileOutputStream(f);
            ObjectOutputStream os = new ObjectOutputStream(fs);

            for (Persona personas : arrPer) {
                os.writeObject(personas);
            }



            os.close();
            fs.close();


        }catch (IOException e){
            System.out.println(e.fillInStackTrace());

        }
    }

    private static void recuperarObjeto(File f){

        try {

            FileInputStream fs = new FileInputStream(f);
            ObjectInputStream os = new ObjectInputStream(fs);

            for (Persona personas : arrPer) {
                System.out.println(os.readObject());
            }


            os.close();
            fs.close();


        } catch (ClassNotFoundException | IOException e) {
            System.out.println(e.fillInStackTrace());
        }
    }




}

package EjercicioFicheros;

import java.io.File;
import java.io.IOException;

public class Ejercicio9 {

    public static void main(String[] args) throws IOException {


        File DirPDPpequesAZ = new File("DFirPDPpequesAZ");
        File DirPDFMayores = new File("DFirPDFMayores");
        File dir = new File("C:\\Users\\DavidMontejanoM\\Desktop");

        File[] ficheros = dir.listFiles();


        DirPDPpequesAZ.mkdir();
        DirPDFMayores.mkdir();

        //Recorremos el array
        for (int i = 0;i< ficheros.length;i++){


            //Nos quedamos solo con los ficheros

          if (ficheros[i].isFile()) {

            //Creamos una condicion para quedarnos solo con los archos menos de 1000

              if (ficheros[i].length() <= 1000) {
                    //Creamos una condicion para quedanos solo con los ficheros que empiecen de la A a la N
                    if(ficheros[i].getName().toLowerCase().charAt(0) <= 'n') {

                      //  FileUtils.copyFileToDirectory(ficheros[i], DirPDPpequesAZ, true);
                    }
                    //En caso de que sea mayor lo metemos en el directorio PDFMayores
                }else {

//                    FileUtils.copyFileToDirectory(ficheros[i], DirPDFMayores, true);
                }
            }
        }

    }
}

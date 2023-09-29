package EjercicioFicheros;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Ejercicio9 {

    public static void main(String[] args) throws IOException {


        File DirPDPpequesAZ = new File("DFirPDPpequesAZ");
        File dir = new File("C:\\Users\\DavidMontejanoM\\Desktop");

        File[] ficheros = dir.listFiles();

        DirPDPpequesAZ.mkdir();

        for (int i = 0;i< ficheros.length;i++){
            File ficNombre = new File( ficheros[i].getName());

            if (ficNombre.isFile()) {
                if (dir.listFiles().length <= 1000) {

                    FileUtils.moveFileToDirectory(ficNombre, DirPDPpequesAZ, true);

                }
            }
        }



    }
}

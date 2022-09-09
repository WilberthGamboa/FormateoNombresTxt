package utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class LeerArchivo {

    public LinkedList<String> muestraContenido() throws FileNotFoundException, IOException {
        // lectura archivo
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte la ruta de su archivo");
        String name = sc.nextLine();
        // Linked list para para guardar los datos
        LinkedList<String> nombresSinConvertir = new LinkedList<String>();

        File archivo = new File(name);

        VerificarArchivo verificarArchivo = new VerificarArchivo();
        archivo = verificarArchivo.verificarExistenciaArchivo(archivo, sc);
        archivo = verificarArchivo.verificarExtension(archivo, sc);

        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);

        String cadenaActual;
        while ((cadenaActual = b.readLine()) != null) {
            nombresSinConvertir.push(cadenaActual);
        }
        b.close();
        sc.close();
        return nombresSinConvertir;
    }

}

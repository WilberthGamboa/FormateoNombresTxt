package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class LeerArchivo {

    public LinkedList<String> muestraContenido() throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte la ruta de su archivo");
        String name = sc.nextLine();
        LinkedList<String> nombresSinConvertir = new LinkedList<String>();
        String cadenaActual;
        FileReader f = new FileReader(name);
        BufferedReader b = new BufferedReader(f);
        while ((cadenaActual = b.readLine()) != null) {
            nombresSinConvertir.push(cadenaActual);
        }
        b.close();
        sc.close();
        return nombresSinConvertir;
    }

}

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
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserte la ruta de su archivo");

        String name = sc.nextLine();
        LinkedList<String> nombresSinConvertir = new LinkedList<String>();
        String cadenaActual;
        File archivo = new File(name);
       
        while (!archivo.exists()) {
            System.out.println("El archivo no existe, por favor ingresa una ruta valida");
             name = sc.nextLine();
             archivo = new File(name);
            
        }

        String extension = archivo.getName().substring(archivo.getName().length()-4,archivo.getName().length());
        System.out.println(extension);

        while (!extension.equals(".txt")) {
            System.out.println("El archivo se encontró, pero no es un archivo de texto, (requiere extension)");
            name = sc.nextLine();
             archivo = new File(name);
             while (!archivo.exists()) {
                System.out.println("El archivo no existe, por favor ingresa una ruta valida");
                 name = sc.nextLine();
                 archivo = new File(name);
                
            }
            extension = archivo.getName().substring(archivo.getName().length()-4,archivo.getName().length());
        }

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

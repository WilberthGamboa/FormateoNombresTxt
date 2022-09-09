package utilities;

import java.io.File;
import java.util.Scanner;

public class VerificarArchivo {

    public File verificarExistenciaArchivo(File archivo){
        Scanner sc = new Scanner(System.in);
        while (!archivo.exists()) {
            System.out.println("El archivo no existe, por favor ingresa una ruta valida");
            
            String name = sc.nextLine();
             archivo = new File(name);
            
        }
     
        return archivo;
    }

    public File verificarExtension(File archivo){
        Scanner sc = new Scanner(System.in);
        String extension = archivo.getName().substring(archivo.getName().length()-4,archivo.getName().length());
        System.out.println(extension);

        while (!extension.equals(".txt")) {
            System.out.println("El archivo se encontró, pero no es un archivo de texto, (requiere extension)");
                String name = sc.nextLine();
             archivo = new File(name);
             archivo = verificarExistenciaArchivo(archivo);
            extension = archivo.getName().substring(archivo.getName().length()-4,archivo.getName().length());
        }
        return archivo;

    }
    
}

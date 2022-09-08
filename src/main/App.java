package main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;

import utilities.ConvertirCadena;
import utilities.ImprimirNombres;
import utilities.LeerArchivo;
import utilities.OrdenarAlfabeticamente;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException, IOException
    {
        //Variables
     //   String direccionArchivo ="C:/Users/Wilberth/Desktop/lector/nombres.txt";
        LeerArchivo leerArchivo = new LeerArchivo();
        ConvertirCadena convertirCadena = new ConvertirCadena();
        ImprimirNombres imprimirNombres = new ImprimirNombres();
        OrdenarAlfabeticamente ordenarAlfabeticamente = new OrdenarAlfabeticamente();
        //Funciones llamadas
        LinkedList<String> linkedListAuxiliar = new LinkedList<String>();
        linkedListAuxiliar = leerArchivo.muestraContenido();
        linkedListAuxiliar= convertirCadena.convertirCadena(linkedListAuxiliar);
        linkedListAuxiliar=ordenarAlfabeticamente.ordenamiento(linkedListAuxiliar);

        imprimirNombres.imprimirCadena(linkedListAuxiliar);
        

    }
}

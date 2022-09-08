package utilities;

import java.util.LinkedList;

public class ConvertirCadena {

    public LinkedList<String> convertirCadena(LinkedList<String> nombresSinConvertir) {

        LinkedList<String> cadenasDeNombreConvertidas = new LinkedList<String>();

        for (String nombreSinConvertirActual : nombresSinConvertir) {
            // Separamos los distintos nombres
            String[] nombreSinConvertirPartes = nombreSinConvertirActual.split(" ");
            String nombreFinal = "";

            for (int j = 0; j < nombreSinConvertirPartes.length; j++) {

                String mayuscula = nombreSinConvertirPartes[j].substring(0, 1);
                mayuscula = mayuscula.toUpperCase();
                String minuscula = nombreSinConvertirPartes[j].substring(1);
                minuscula = minuscula.toLowerCase();

                // juntamos los string
                nombreFinal = nombreFinal + mayuscula + minuscula + " ";

            }
            // Quitamos el espacio vacio del final
            nombreFinal = nombreFinal.substring(0, nombreFinal.length() - 1);
            // Agregamos a la linkedList convertida
            cadenasDeNombreConvertidas.add(nombreFinal);

        }
        return cadenasDeNombreConvertidas;
    }
}

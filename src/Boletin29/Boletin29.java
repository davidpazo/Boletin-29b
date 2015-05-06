package Boletin29;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DAVID
 */
public class Boletin29 {

    public void precioAlquiler() {

    }

    public static void main(String[] args) {
        ArrayList<Barcos> listaB = new ArrayList();
        Modelo obj = new Modelo();
        int opc;
        do {
            opc = JOptionPane.showOptionDialog(
                    null, "MENU", "Que barco desea alugar?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                        "Velero",
                        "Deportivo",
                        "Yates",
                        "Carguero",
                        "Mostrar lista de barcos",
                        "Salir"},
                    "Exit") + 1;

            switch (opc) {
                case 1:
                    obj.añadirVelero(listaB);
                    break;
                case 2:
                    obj.añadirDeportivo(listaB);
                    break;
                case 3:
                    obj.añadirYate(listaB);
                    break;
                case 4:
                    obj.añadirCarguero(listaB);
                case 5:
                    for (Barcos bar : listaB) {
                        obj.amosar(bar);
                    }
                    break;
                case 6:
                    System.exit(0);
            }
        } while (opc != 0 && opc != 6);
    }

}

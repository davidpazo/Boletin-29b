package Boletin29;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DAVID
 */
public class Modelo {

    public ArrayList<Integer> listaB;

    public Modelo() {
    }

    public Modelo(ArrayList<Integer> listaB) {
        this.listaB = listaB;
    }

    public void añadirVelero(ArrayList<Barcos> listaB) {
        listaB.add(new Veleros(this.pedirMatricula(), this.pedirEslora(), this.pedirDias(), this.pedirMastil()));
    }

    public void añadirDeportivo(ArrayList<Barcos> listaB) {
        listaB.add(new Deportivos(this.pedirMatricula(), this.pedirEslora(), this.pedirDias(), this.pedirPotencia()));
    }

    public void añadirYate(ArrayList<Barcos> listaB) {
        listaB.add(new Yates(this.pedirMatricula(), this.pedirEslora(), this.pedirDias(), this.pedirPotencia(), this.pedirCam()));
    }

    public void añadirCarguero(ArrayList<Barcos> listaB) {
        listaB.add(new Bcarga(this.pedirMatricula(), this.pedirEslora(), this.pedirDias(), this.pedirCarga()));
    }

    public void amosar(Barcos b) {
        if (b instanceof Veleros) {
            JOptionPane.showMessageDialog(null, "Velero:\nMatricula: " + b.getMatricula() + "\nEslora: "+b.getEslora() +"\nNumero de dias: "+ b.getNdias() + "\nNumero de mastiles"+((Veleros) b).getMastiles()+ "\nPrecio"+b.calcularAlq(b.calcularModulo(b)));
        }
        if (b instanceof Deportivos) {
            JOptionPane.showMessageDialog(null, "Deportivo:\nMatricula: " + b.getMatricula() + "\nEslora: "+b.getEslora() +"\nNumero de dias: "+ b.getNdias()+ "\nCV: "+((Deportivos)b).getDeporCV()+"\nPrecio alquiler: "+b.calcularAlq(b.calcularModulo(b)));
        }
        if (b instanceof Yates) {
            JOptionPane.showMessageDialog(null, "Yate:\nMatricula: " + b.getMatricula() + "\nEslora: "+b.getEslora() +"\nNumero de dias: "+ b.getNdias() +"\nPotencia: "+ ((Yates) b).getPotencia() + "\nNumero de camarotes: "+((Yates) b).getNumcamarotes()+ "\nPrecio: "+ b.calcularAlq(b.calcularModulo(b)));
        }
        if (b instanceof Bcarga) {
            JOptionPane.showMessageDialog(null, "Carguero:\nMatricula: " + b.getMatricula() + "\nEslora: "+b.getEslora() +"\nNumero de dias: "+ b.getNdias() +"\nCarga:"+ ((Bcarga)b).getCarga()+"\nPrecio alquiler: "+b.calcularAlq(b.calcularModulo(b)));
        }
        
    }
    

    public String pedirMatricula() {
        String matricula;

        matricula = (JOptionPane.showInputDialog("Introduce matricula:"));

        return matricula;
    }

    public int pedirEslora() {
        int eslora = 0;
        do {
            eslora = Integer.parseInt(JOptionPane.showInputDialog("Introduce eslora:"));
            if (eslora <= 0) {
                JOptionPane.showInputDialog("Eslora no valida");
            }
        } while (eslora <= 0);
        return eslora;
    }

    public int pedirDias() {
        int ndias = 0;
        do {
            ndias = Integer.parseInt(JOptionPane.showInputDialog("Numero de dias:"));
            if (ndias <= 0) {
                JOptionPane.showInputDialog("Dias no validos");
            }
        } while (ndias <= 0);
        return ndias;
    }

    public int pedirPotencia() {
        int potencia = 0;
        do {
            potencia = Integer.parseInt(JOptionPane.showInputDialog("Introduce potencia:"));
            if (potencia <= 0) {
                JOptionPane.showInputDialog("Potencia no valida");
            }
        } while (potencia <= 0);
        return potencia;
    }

    public int pedirCam() {
        int numcam = 0;
        do {
            numcam = Integer.parseInt(JOptionPane.showInputDialog("Introduce camarotes"));
            if (numcam <= 0) {
                JOptionPane.showInputDialog("Numero de camarotes no validos");
            }
        } while (numcam <= 0);
        return numcam;
    }

    public int pedirMastil() {
        int mastiles = 0;
        do {
            mastiles = Integer.parseInt(JOptionPane.showInputDialog("Introduce Numero de Mastiles:"));
            if (mastiles <= 0) {
                JOptionPane.showInputDialog("Numero de Mastiles no validos");
            }
        } while (mastiles <= 0);
        return mastiles;
    }

    public int pedirCarga() {
        int carga = 0;
        do {
            carga = Integer.parseInt(JOptionPane.showInputDialog("Introduce Carga:"));
            if (carga <= 0) {
                JOptionPane.showInputDialog("Carga no valida");
            }
        } while (carga <= 0);
        return carga;
    }

    public void amosar() {
        for (int i = 0; i < listaB.size(); i++) {
            JOptionPane.showMessageDialog(null, "Barco: " + i + "tipo:" + listaB.get(i));
        }
    }
}

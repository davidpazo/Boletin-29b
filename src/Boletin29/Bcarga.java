package Boletin29;

/**
 *
 * @author DAVID
 */
public class Bcarga extends Barcos {

    private int carga;

    public Bcarga() {
    }

    public Bcarga(int carga) {
        this.carga = carga;
    }

    public Bcarga(String matricula, int eslora, int ndias, int carga) {
        super(matricula, eslora, ndias);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public int calcularModulo(Barcos barco) {
        int mod;
        mod = 10 * barco.getEslora() + carga;
        return mod;
    }

}

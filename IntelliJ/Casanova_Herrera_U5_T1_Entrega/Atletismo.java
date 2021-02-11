package Casanova_Herrera_U5_T1_Entrega;

public class Atletismo extends Deporte {
    private int numPruebas;

    public Atletismo(String nombre, String pabellon, int numPruebas) {
        super(nombre, pabellon);
        this.numPruebas = numPruebas;
    }

    public int getNumPruebas() {
        return numPruebas;
    }

    public void setNumPruebas(int numPruebas) {
        this.numPruebas = numPruebas;
    }

    @Override
    public String toString() {
        return "Atletismo{" +
                "numPruebas=" + numPruebas +
                '}';
    }
}

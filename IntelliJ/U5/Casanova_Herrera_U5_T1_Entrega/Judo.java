package Casanova_Herrera_U5_T1_Entrega;

public class Judo extends Deporte {

    private int numTatamis;

    public Judo(String nombre, String pabellon, int numTatamis) {
        super(nombre, pabellon);
        this.numTatamis = numTatamis;
    }

    public int getNumTatamis() {
        return numTatamis;
    }

    public void setNumTatamis(int numTatamis) {
        this.numTatamis = numTatamis;
    }

    @Override
    public String toString() {
        return "Judo{" +
                "numTatamis=" + numTatamis +
                '}';
    }
}

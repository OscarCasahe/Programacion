package Casanova_Herrera_U5_T1_Entrega;

public class Baloncesto extends Deporte{

    private int numEquipos;

    public Baloncesto(String nombre, String pabellon, int numEquipos) {
        super(nombre, pabellon);
        this.numEquipos = numEquipos;
    }

    public int getNumEquipos() {
        return numEquipos;
    }

    public void setNumEquipos(int numEquipos) {
        this.numEquipos = numEquipos;
    }


    @Override
    public String toString() {
        return "Baloncesto{" +
                "numEquipos=" + numEquipos +
                '}';
    }
}

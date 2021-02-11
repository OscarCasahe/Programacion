package Casanova_Herrera_U5_T1_Entrega;

public class Judokas extends Participante implements Pelear{

    private int peso;

    public Judokas(String nombre, int edad, int peso) {
        super(nombre, edad);
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Judokas{" +
                "peso=" + peso +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", inscrito=" + inscrito +
                '}';
    }

    @Override
    public void hacerJuramento() {
        System.out.println("Yo, "+getNombre()+" como judoka, juro los valores deportivos mundiales");
    }

    @Override
    public void pelear() {
        System.out.println("Voy a pelear");
    }
}

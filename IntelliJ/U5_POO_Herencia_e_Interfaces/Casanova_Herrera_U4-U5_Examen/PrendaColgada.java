public class PrendaColgada extends Prendas implements Colgar {

    private double altura;

    public PrendaColgada(double precio, String nombre, String codBarras, double peso, double altura) {
        super(precio, nombre, codBarras, peso);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "PrendaColgada{" +
                "altura=" + altura +
                ", precio=" + precio +
                ", nombre='" + nombre + '\'' +
                ", codBarras='" + codBarras + '\'' +
                ", peso=" + peso +
                '}';
    }
}

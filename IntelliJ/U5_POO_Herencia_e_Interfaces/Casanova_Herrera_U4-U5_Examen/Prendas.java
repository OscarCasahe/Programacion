import java.lang.reflect.Array;
import java.util.Arrays;

public  class Prendas implements Devolver, Doblar{

    protected double precio;
    protected String nombre;
    protected String codBarras;
    protected double peso;
    int numPrendas=0;

    public Prendas(double precio, String nombre, String codBarras, double peso) {
        this.precio = precio;
        this.nombre = nombre;
        this.codBarras = codBarras;
        this.peso = peso;
        numPrendas++;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getNumPrendas() {
        return numPrendas;
    }

    public void setNumPrendas(int numPrendas) {
        this.numPrendas = numPrendas;
    }

    @Override
    public String toString() {
        return "Prendas{" +
                "precio=" + precio +
                ", nombre='" + nombre + '\'' +
                ", codBarras='" + codBarras + '\'' +
                ", peso=" + peso +
                '}';
    }



}

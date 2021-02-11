package Casanova_Herrera_U5_T1_Entrega;

import java.util.Comparator;

public class Pais implements Comparable<Pais>, Comparator<Pais> {

    private String nombre;
    private int numPart;


    public Pais(String nombre, int numPart) {
        this.nombre = nombre;
        this.numPart = numPart;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPart() {
        return numPart;
    }

    public void setNumPart(int numPart) {
        this.numPart = numPart;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", numPart=" + numPart +
                '}';
    }

    @Override
    public int compareTo(Pais o) {
        return this.nombre.compareTo(o.nombre);
    }


    @Override
    public int compare(Pais o1, Pais o2) {
        return o2.numPart-o1.numPart;
    }
}

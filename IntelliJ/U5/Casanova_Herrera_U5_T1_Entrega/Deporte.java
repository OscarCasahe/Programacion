package Casanova_Herrera_U5_T1_Entrega;

import java.util.Arrays;
import java.util.Comparator;

public abstract class Deporte {
    private String nombre;
    private String pabellon;
    private Participante[] partInscritos = new Participante[0];


    public Deporte(String nombre, String pabellon) {
        this.nombre = nombre;
        this.pabellon = pabellon;
        this.partInscritos = partInscritos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPabellon() {
        return pabellon;
    }

    public void setPabellon(String pabellon) {
        this.pabellon = pabellon;
    }

    public Participante[] getPartInscritos() {
        return partInscritos;
    }

    public void setPartInscritos(Participante[] partInscritos) {
        this.partInscritos = partInscritos;
    }

    @Override
    public String toString() {
        return "Deporte{" +
                "nombre='" + nombre + '\'' +
                ", pabellon='" + pabellon + '\'' +
                ", partInscritos=" + Arrays.toString(partInscritos) +
                '}';
    }

    public void mostrarParticipantes(){
        Arrays.sort(partInscritos, new Comparator<Participante>() {
            @Override
            public int compare(Participante o1, Participante o2) {
                return o1.edad-o2.edad;
            }
        });
    }

}

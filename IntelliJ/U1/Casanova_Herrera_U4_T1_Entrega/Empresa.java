package Casanova_Herrera_U4_T1_Entrega;

import java.util.Arrays;

public class Empresa {
    private String nombre;
    private Departamento[] departamentos= new Departamento[0];

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamento[] departamentos) {
        this.departamentos = departamentos;
    }

    void addDepart(Departamento d){

        this.departamentos= Arrays.copyOf(this.departamentos, this.departamentos.length+1);
        this.departamentos[this.departamentos.length-1]=d;

    }


    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", departamentos=" + Arrays.toString(departamentos) +
                '}';
    }
}

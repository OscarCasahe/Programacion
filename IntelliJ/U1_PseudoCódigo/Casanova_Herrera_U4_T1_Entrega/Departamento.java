package Casanova_Herrera_U4_T1_Entrega;

import java.util.Arrays;

public class Departamento {

    private String nombre;
    private String sede;
    private String extension;
    private Empleado[] empleados= new Empleado[0];


    public Departamento(String nombre, String extension) {
        this.nombre = nombre;
        this.extension = extension;
        this.sede = "Castilleja";
    }

    public Departamento(String nombre, String sede, String extension) {
        this.nombre = nombre;
        this.sede = sede;
        this.extension = extension;
    }



    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                ", sede='" + sede + '\'' +
                ", extension='" + extension + '\'' +
                ", empleados=" + Arrays.toString(empleados) +
                '}';
    }

    void addEmpleado(Empleado e){
        this.empleados= Arrays.copyOf(this.empleados, this.empleados.length+1);
        this.empleados[this.empleados.length-1]=e;

    }


   /* Empleado [] removeEmpleado(Empleado e){
        Empleado [] resultado;

        resultado= Arrays.copyOf(this.empleados, this.empleados.length-1);

        for (int i = 0; i <this.empleados.length; i++) {

            if (this.empleados[i].equals(e)){

            }else{
                this.empleados[i]=resultado[i];
            }

        }
        return resultado;
    }*/

}

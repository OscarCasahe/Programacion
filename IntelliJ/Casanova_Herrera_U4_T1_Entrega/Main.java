package Casanova_Herrera_U4_T1_Entrega;

import java.util.Arrays;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        Empresa emp = new Empresa("Microsoft");
        Departamento d1 = new Departamento("A753", "Bormujos","+34");
        Departamento d2 = new Departamento("A456", "Tomares","+35");
        Departamento d3 = new Departamento("A159", "+36");

        Empleado e1 = new Empleado("Óscar Casanova Herrera", "987654321", "640698745", TipoEmpleado.administrativo);
        Empleado e2 = new Empleado("Mary Poppins Ceballos", "727654321", "644698321", TipoEmpleado.directivo);
        Empleado e3 = new Empleado("Diego Delgado Delgado", "127654321", "645859745", TipoEmpleado.técnico);
        Empleado e4 = new Empleado("Daniel Casanova Herrera", "987654321", "375689148", TipoEmpleado.administrativo);
        Empleado e5 = new Empleado("Juan Casanova González ", "485915475", "789153466");
        Empleado e6 = new Empleado("Encarni Herrera Pizano ", "485918795", "319465466");



        //Mostramos los departamentos vacios
        System.out.println((d1));
        System.out.println((d2));
        System.out.println((d3));
        System.out.println();



        //Añadimos empleados a los departamentos
        d1.addEmpleado(e1);
        d1.addEmpleado(e2);
        d2.addEmpleado(e3);
        d2.addEmpleado(e6);
        d3.addEmpleado(e5);
        d3.addEmpleado(e4);

        //Mostramos empleados

        System.out.println((d1));
        System.out.println((d2));
        System.out.println((d3));



        //Añadimos los depatamentos a la empresa

        emp.addDepart(d1);
        emp.addDepart(d2);
        emp.addDepart(d3);


        System.out.println(emp);


        //Quitamos un empleado

       /* d1.removeEmpleado(e1);
        System.out.println(d1);*/

    }




}

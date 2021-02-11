import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sueldo=1, junior = 950, senior = 1200, jefe = 1600, viajes=0, viajesT,bruto;
        String cargo;
double irpf=0.20,neto,brutoIR;

        System.out.println("¿Cual es su cargo? junior/ senior/ jefe");
        cargo = sc.nextLine();

        System.out.println("Viajes realizados:");
        viajes = sc.nextInt();

        viajesT=viajes*30;

        bruto=viajesT+sueldo;
        if (cargo.equals("junior")) {

            System.out.println("Sueldo base               " + (double)junior);
            sueldo=junior;

        }

        if (cargo.equals("senior")) {

            System.out.println("Sueldo base               " + (double)senior);
            sueldo=senior;
        }

        if (cargo.equals("jefe")) {

            System.out.println("Sueldo base          " + (double)jefe);
            sueldo=jefe;
        }
        System.out.println("Dietas "+"("+viajes+" viajes)"+"          "+(double)viajesT);
        System.out.println("");

        System.out.println("- - - - - - - - - - - - - - - - - -");

        System.out.println("");
        System.out.println("Sueldo bruto               "+(double)(viajesT+sueldo));

        bruto=viajesT+sueldo;

        System.out.println("Retención  IRPF  (20%)    "+bruto*irpf);
        System.out.println("");
        brutoIR=bruto*irpf;
        System.out.println("- - - - - - - - - - - - - - - - - -");

        System.out.println("");

        neto=bruto-brutoIR;
        System.out.println("Sueldo neto               "+neto);

    }
}
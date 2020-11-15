import java.util.Scanner;

public class Ejercicio_4_TareaEntregable {
    public static void main(String[] args) {
        int h, min, seg, inc;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número de horas");
        h = sc.nextInt();

        System.out.println("Introduzca un número de minutos");
        min = sc.nextInt();

        System.out.println("Introduzca un número de segundos");
        seg = sc.nextInt();

        System.out.println("Introduzca segundos a incrementar");
        inc = sc.nextInt();

        System.out.println("Aumentando la hora...");

        for (int i = 0; i < inc; i++) {

            if  (seg>60)
                seg = 0;
            min++;}


            else if (min > 60){
                min = 0;
            h++;}

           else  (h > 24)
    {
               h = 0;
               min = 0;
            seg = 0;

           h++;
        }


    }
}

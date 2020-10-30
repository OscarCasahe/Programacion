import java.util.Scanner;

public class Ejercicio_1_TareaEntregable {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int altura;
        int piernas;
        System.out.println("Introduce la altura");
        altura = sc.nextInt();

        for (int i = 0; i <=altura ; i++) {



            if (i== (altura-1)|| i == altura ) {
                System.out.println("******");
            } else {
                System.out.println("***");
            }
            }


        }
        }



import java.util.Scanner;

public class Ejercicio_3_TareaEntregable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n1, n2, n3;
String boleto;
        System.out.println("Introduzca sus números favoritos");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        System.out.println("Introduzca el número de la lotería de 5 caracteres");

        
        boleto= sc.nextLine();

        //Soy consciente de que si no es en el orden que he propuesto no se realizará
        // el ejercicio debidamente pero es la solución más cercana que he hallado

        if (boleto.contains(n1+n2+n3+"45")){
            System.out.println("Este número te dará suerte");
        }else{
            System.out.println("Este número no te dará suerte");
        }
    }
}

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tam, tam1,num;
        System.out.println("Introduce el tamaño del primer vector");
        tam= sc.nextInt();

        System.out.println("Introduce el tamaño del segundo vector");
        tam1= sc.nextInt();


        int[] a= new int[tam];
        int[] b= new int[tam];
        int[] resultado_a= new int[a.length];
        int[] resultado_b= new int[b.length];

        for (int i = 0; i <a.length ; i++) {
            a[i]=(int)(Math.random()*10);

        }

        System.out.println("v1 = "+ Arrays.toString(a));

        for (int i = 0; i <b.length ; i++) {
            a[i]=(int)(Math.random()*10);

        }

        System.out.println("v2 = "+ Arrays.toString(b));


        System.out.println("Introfuzca un número para comprobar si se encuentra en el vector");
        num= sc.nextInt();

        if (esta(a,num)==true){
            System.out.println("Ese número se encuentra actualmente en el vector a");

            for (int i = 0; i <resultado_a.length ; i++) {
                    resultado_a= Arrays.copyOf(a,a.length-1);


            }
        }else return;

        if (esta(b,num)==true){
            System.out.println("Ese número se encuentra actualmente en el vector a");


            for (int i = 0; i <resultado_b.length ; i++) {
                resultado_b= Arrays.copyOf(b,b.length-1);


            }
        }else return;






        System.out.println(unirSinRepetidos(a,b));
    }
    public static boolean esta(int[] vector, int num){

        for (int i = 0; i < vector.length; i++) {
            if (vector[i]==num){

            return true;
            }
            else  return false;

        }
        return true;
    }
    public static int[] unirSinRepetidos(int v1[],int[] v2){
        int[] resultado=new int[v1.length];

        for (int i = 0; i < v2.length ; i++) {
            resultado=Arrays.copyOf(v1,v1.length+1);
            resultado[resultado.length-1]=v2[i];


        } return resultado;
    }
}

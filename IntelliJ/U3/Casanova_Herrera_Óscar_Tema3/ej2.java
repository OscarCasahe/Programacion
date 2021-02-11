import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tam;
        System.out.println("Introduzca el tamaño para su vector");
        tam= sc.nextInt();
        int[] v1= new int[tam];

        System.out.println("Su vector como cadena sería:");

        System.out.println(convierteArrayEnString(v1));

    }
    public static String convierteArrayEnString(int[] a){

        String resultado="";
        for (int i = 0; i <a.length ; i++) {
            if (a[i]==1){
                resultado= resultado+"1";
            }
            else if (a[i]==2){
                resultado= resultado+"2";
            }
            else if (a[i]==3){
                resultado= resultado+"3";
            }
            else if (a[i]==4){
                resultado= resultado+"4";
            }
            else if (a[i]==5){
                resultado= resultado+"5";
            }
            else if (a[i]==6){
                resultado= resultado+"6";
            }
            else if (a[i]==7){
                resultado= resultado+"7";
            }
            else if (a[i]==8){
                resultado= resultado+"8";
            }
            else if (a[i]==9){
                resultado= resultado+"9";
            }
            else if (a[i]==0){
                resultado= resultado+"0";
            }

        }return resultado;
    }
}

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);


        int num,sumapares=0, sumaimpares=0;
        String pares="", impares="";


        System.out.println("Por favor, introduzca un número entero positivo:");
        num = sc.nextInt();



        for (int i = 0; i < Math.floor(Math.log10(num)); i++) {

            if (i%2==0 && i!=0){
                pares=pares+i+" ";
                sumapares= sumapares+i;
            }else if (i!=0){

                impares=impares+" "+i+" ";
                sumaimpares= sumaimpares+i;
            }

        }

        System.out.println("Dígitos pares:"+pares);
        System.out.println("Dígitos impares:"+impares);
        System.out.println("Suma de los dígitos pares:"+sumapares);
        System.out.println("Suma de los dígitos impares:"+sumaimpares);
    }
}

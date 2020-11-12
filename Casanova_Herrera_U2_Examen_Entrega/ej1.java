import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String numpares1="", numimpares1="",numpares2="", numimpares2="";
        int num1, num2;
        double resultado1, resultado2,  comp_num1=0,  comp_num2=0;


        System.out.println("Por favor, introduzca un número:");
        num1 = sc.nextInt();


        for (int i = 0; i < Math.floor(Math.log10(num1)); i++) {
            resultado1= num1-Math.pow(10,Math.floor(Math.log10(num1)));
            comp_num1= comp_num1+resultado1;
            if (resultado1%2==0){
                numpares1=numpares1+resultado1;
            }else{
                numimpares1=numpares1+resultado1;
            }
        }


        System.out.println("Por favor, introduzca otro número:");
        num2 = sc.nextInt();

        for (int i = 0; i < Math.floor(Math.log10(num2)); i++) {
            resultado2= num2-Math.pow(10,Math.floor(Math.log10(num2)));

            comp_num2= comp_num2+resultado2;
            if (resultado2%2==0){
                numpares1=numpares2+resultado2;
            }else{
                numimpares2=numpares2+resultado2;
            }
        }

        System.out.println("El número formado por los dígitos pares es"+numpares1+numpares2);
        System.out.println("El número formado por los dígitos impares es"+numimpares1+numimpares2);
    }
}

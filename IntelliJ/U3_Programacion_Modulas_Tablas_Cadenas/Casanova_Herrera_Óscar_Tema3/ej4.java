import java.util.Arrays;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][] matriz1= {{"a","b","c"},{"d","e","f"},{"g","h","i"}};
        String [][] matriz2= {{"j","k","l"},{"m","n","o"},{"p","q","r"}};

        System.out.println(Arrays.toString( unirMatrices(matriz1,matriz2)));
    }
    public static String [][] unirMatrices(String[][]a,String[][]b){
        String [][] resultado= Arrays.copyOf(a,a.length+b.length);

        for (int i = 0; i < resultado.length ; i++) {
            for (int j = 0; j < resultado[j].length ; j++) {
                resultado=Arrays.copyOf(a,a.length+1);
                resultado[resultado.length-1]=b[i];

            }


        }
    }
}

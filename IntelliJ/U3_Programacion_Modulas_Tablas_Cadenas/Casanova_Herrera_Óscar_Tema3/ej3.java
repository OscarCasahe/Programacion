import java.lang.reflect.Array;
import java.util.Arrays;

public class ej3 {
    public static void main(String[] args) {
       String [] pais = {"España", "Rusia", "Japón", "Australia"};
        int [] alt_e= new int[10];
        int [] alt_r= new int[10];
        int [] alt_j= new int[10];
        int [] alt_a= new int[10];

        int min=alt_e[0];int max=alt_e[0];int sum=0;
        int minr=alt_r[0];int maxr=alt_r[0];int sumr=0;
        int minj=alt_j[0];int maxj=alt_j[0];int sumj=0;
        int mina=alt_a[0];int maxa=alt_a[0];int suma=0;

        for (int i = 0; i < alt_e.length ; i++) {
            alt_e[i]=(int)(Math.random()*(140)+80);
            sum= sum+alt_e[i];

            if (alt_e[i]>max){
                max=alt_e[i];
            }
            if (alt_e[i]<min){
                min=alt_e[i];
            }
        }


        for (int i = 0; i < alt_r.length ; i++) {
            alt_r[i]=(int)(Math.random()*(140)+80);
            sumr= sumr+alt_r[i];

            if (alt_r[i]>maxr){
                maxr=alt_r[i];
            }
            if (alt_e[i]<minr){
                minr=alt_r[i];
            }
        }



        for (int i = 0; i < alt_j.length ; i++) {
            alt_j[i]=(int)(Math.random()*(140)+80);
            sumj= sumj+alt_j[i];

            if (alt_j[i]>maxj){
                maxj=alt_j[i];
            }
            if (alt_j[i]<minj){
                minj=alt_j[i];
            }
        }



        for (int i = 0; i < alt_a.length ; i++) {
            alt_a[i]=(int)(Math.random()*(140)+80);
            suma= suma+alt_a[i];

            if (alt_a[i]>maxa){
                maxa=alt_a[i];
            }
            if (alt_a[i]<mina){
                mina=alt_a[i];
            }

        }


        System.out.println("                                                             MED  MIN MAX");
        System.out.println(pais[0]+"  "+Arrays.toString(alt_e)+" | "+"  "+sum/10+" "+min+" "+max);
        System.out.println(pais[1]+"     "+Arrays.toString(alt_r)+" | "+"  "+sum/10+" "+minr+" "+maxr);
        System.out.println(pais[2]+"     "+Arrays.toString(alt_j)+" | "+"  "+sum/10+" "+minj+" "+maxj);
        System.out.println(pais[3]+" "+Arrays.toString(alt_a)+" | "+" "+sum/10+" "+mina+" "+maxa);
    }
}

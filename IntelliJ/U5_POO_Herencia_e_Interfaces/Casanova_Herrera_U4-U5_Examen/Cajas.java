import java.util.Arrays;

public class Cajas {

    private Prendas[] capacidadMax= new Prendas[5];
    private int idCaja;
    static int generadorid=1;


    public Cajas(int idCaja) {
        this.idCaja = idCaja;
    }

    public void addPrenda(Prendas p1, Prendas[] contenido){

        contenido = Arrays.copyOf(contenido, contenido.length+1);
        contenido[contenido.length]= p1;

    }

    public Prendas[] removePrenda(Prendas p1, Prendas[] contenido){

        Prendas[] aux= new Prendas[0];

        for (int i = 0; i < contenido.length ; i++) {

            if (!contenido[i].equals(p1)){

                aux= Arrays.copyOf(aux, aux.length+1);
                aux[aux.length]=contenido[i];

            }


        }
        return aux;
    }


}

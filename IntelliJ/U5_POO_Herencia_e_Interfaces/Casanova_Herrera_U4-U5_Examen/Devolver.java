import java.util.Arrays;

public interface Devolver {

    public default Prendas[] devolver(Prendas p1, Prendas[] contenido) {

        Prendas[] aux = new Prendas[0];

        for (int i = 0; i <contenido.length ; i++) {
            if (!contenido[i].equals(p1)){

                aux= Arrays.copyOf(aux, aux.length+1);
                aux[aux.length]=contenido[i];


            }
            System.out.println("Devolviendo prenda con nombre "+p1.nombre+" y precio "+p1.precio);
        }
        return aux;
    }


}

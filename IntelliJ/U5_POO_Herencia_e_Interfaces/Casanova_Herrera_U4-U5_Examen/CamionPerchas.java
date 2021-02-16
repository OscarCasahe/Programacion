import java.util.Arrays;

public class CamionPerchas extends Vehiculos implements DescargarPrendas, Comparable<CamionPerchas>{

    PrendaColgada[] prendasColgadas = new PrendaColgada[0];
    int numPrendas=0;


    public CamionPerchas(String matricula, int cargaMax, Conductor conductor) {
        super(matricula, cargaMax, conductor);
        this.prendasColgadas = prendasColgadas;
    }

    public PrendaColgada[] getPrendasColgadas() {
        return prendasColgadas;
    }

    public void setPrendasColgadas(PrendaColgada[] prendasColgadas) {
        this.prendasColgadas = prendasColgadas;
    }

    @Override
    public String toString() {
        return "CamionPerchas{" +
                "prendasColgadas=" + Arrays.toString(prendasColgadas) +
                ", matricula='" + matricula + '\'' +
                ", carga=" + cargaMax +
                ", conductor=" + conductor +
                '}';
    }


    public void addPrenda(PrendaColgada p1, PrendaColgada[] contenido){

        contenido = Arrays.copyOf(contenido, contenido.length+1);
        contenido[contenido.length-1]= p1;
        numPrendas++;

    }


    public Prendas[] removePrenda(PrendaColgada p1, PrendaColgada[] contenido){

        PrendaColgada[] aux= new PrendaColgada[0];

        for (int i = 0; i < contenido.length ; i++) {

            if (!contenido[i].equals(p1)){

                aux= Arrays.copyOf(aux, aux.length+1);
                aux[aux.length]=contenido[i];

            }


        }
        numPrendas--;
        return aux;
    }

    @Override
    public void descargarPrendas(int a) {
        System.out.println("Descargando "+a+" prendas");
    }

    @Override
    public int compareTo(CamionPerchas o) {
        return this.numPrendas-o.numPrendas;
    }
}

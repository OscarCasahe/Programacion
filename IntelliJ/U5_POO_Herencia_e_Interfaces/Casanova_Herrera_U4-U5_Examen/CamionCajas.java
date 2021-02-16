import java.util.Arrays;
import java.util.Comparator;

public class CamionCajas extends Vehiculos implements Descargar, Comparable<CamionCajas> {

    Cajas[] cajas = new Cajas[0];
    int numCajas = 0;


    public CamionCajas(String matricula, int cargaMax, Conductor conductor) {
        super(matricula, cargaMax, conductor);
        this.cajas= cajas;
    }

    public Cajas[] getCajas() {
        return cajas;
    }

    public void setCajas(Cajas[] cajas) {
        this.cajas = cajas;
    }

    @Override
    public String toString() {
        return "CamionCajas{" +
                "cajas=" + Arrays.toString(cajas) +
                ", matricula='" + matricula + '\'' +
                ", carga=" + cargaMax +
                ", conductor=" + conductor +
                '}';
    }


    public void addCaja(Cajas c1, Cajas[] cajas){

       cajas = Arrays.copyOf(cajas, cajas.length+1);
       cajas[cajas.length-1]= c1;
       numCajas++;
    }

    public Cajas[] removeCaja(Cajas c1, Cajas[] cajas){

        Cajas[] aux= new Cajas[0];

        for (int i = 0; i < cajas.length ; i++) {

            if (!cajas[i].equals(c1)){

                aux= Arrays.copyOf(aux, aux.length+1);
                aux[aux.length]=cajas[i];

            }


        }
        numCajas--;
        return aux;
    }

    @Override
    public void descargar(int numCajas, int numPrendas) {
        System.out.println("Descargando "+numCajas+" cajas y "+numPrendas+" prendas.");
    }

    @Override
    public int compareTo(CamionCajas o) {
        return this.numCajas-o.numCajas;
    }



}

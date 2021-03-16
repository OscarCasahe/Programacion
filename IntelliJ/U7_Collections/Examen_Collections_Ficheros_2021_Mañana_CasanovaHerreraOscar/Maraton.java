import com.sun.source.tree.Tree;

import java.io.*;
import java.util.*;

public class Maraton implements Serializable {

    TreeMap<String, TreeSet<Atleta>> atletas = new TreeMap<>();

    public static void imprimirMenu(){
        System.out.println("Cargar Atletas que recogerá la información de todos los atletas que ya se hayan inscrito y la almacenará en la estructura de datos oportuna. Esos datos estarán recogidos en el fichero binario maraton.dat\n");
        System.out.println("Guardar Atletas que escribirá en el fichero anteriormente nombrado los atletas que se han inscrito.\n");
        System.out.println("Incribir Atleta que solicitará por pantalla los datos del atleta y realizará la inscripición. Tened en cuenta que el número de dorsal que se adjudica a los atletas es por orden de inscripción.\n");
        System.out.println("Guardar Tiempo que recibirá el dorsal del atleta y un tiempo y guardará el tiempo asociado a dicho atleta modificando también su estado para que sea considerado \"finisher\"\n");
        System.out.println("Borrar Atleta que pedirá un número de dorsal y dará de baja del maratón a dicho atleta.\n");
        System.out.println("MostrarListaFinishers() que mostrará la lista de los atletas que han acabado ordenados por tiempos.\n");
        System.out.println("MostrarListaCategoria() que mostrará la lista de los atletas de una determinada categoría (que se pasa como parámetro), ordenador por tiempos.\n");
        System.out.println("ParticipantesPorPaís() que recibe el nombre de un país y nos dice el número de inscritos de dicho país.\n");
        System.out.println("Salir");
    }


    public void cargarAtletas(){

        try {
            ObjectInputStream ios = new ObjectInputStream(new FileInputStream("maraton.dat"));

            String cadena = (String) ios.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }



    public void guardarAtletas(){
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("maraton.dat"));

            ArrayList<Atleta> lista = new ArrayList<>();
            Iterator it = lista.iterator();

            while (it.hasNext()) {
                Atleta a = (Atleta) it.next();
                os.writeObject(it.next());
            }

            os.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }




    public void inscribirAtleta(){
        Scanner sc = new Scanner (System.in);
        String dorsal, nombre, pais, categoria;
        boolean finisher;
        int marca;

        System.out.println("Introduzca los datos de la siguiente manera: nombre, pais, finisher(true/false), marca (en s) y  categoría (JUNIOR, SENIOR o VETERAONO");

        nombre = sc.nextLine();
        pais = sc.nextLine();
        finisher = sc.nextBoolean();
        marca = sc.nextInt();
        categoria = sc.nextLine();

        Atleta a = new Atleta(nombre, pais, categoria);
        atletas.get(categoria).add(a);

    }

    public boolean borrarAtleta(Atleta a) {

        if (atletas.containsKey(a.getDorsal())){
            if (atletas.get(a.getDorsal()).contains(a)) {
                atletas.get(a.getDorsal()).remove(a);
                return true;
            }else{
                System.out.println("Atleta no inscrito");
                return false;
            }
        }else{
            System.out.println("Atleta no inscrito");
            return false;
        }

    }

    public void guardarTiempo(int dorsal, int marca){

        ArrayList<Atleta> lista = new ArrayList<Atleta>();

        for (Atleta a : lista){

        }


    }



    public void MostrarListaCategoria(String categoria){

        if (atletas.containsKey(categoria)){

        }


    }


}







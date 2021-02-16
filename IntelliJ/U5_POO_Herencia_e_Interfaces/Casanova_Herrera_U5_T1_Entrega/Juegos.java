package Casanova_Herrera_U5_T1_Entrega;

import java.util.Arrays;
import java.util.Comparator;

public class Juegos {

    private int year;
    private String sede;
    private Pais [] paises = new Pais[0];
    private Deporte[] deportes = new Deporte[0];

    public Juegos(int year, String sede) {
        this.year = year;
        this.sede = sede;
        this.paises = paises;
        this.deportes = deportes;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public Pais[] getPaises() {
        return paises;
    }

    public void setPaises(Pais[] paises) {
        this.paises = paises;
    }

    public Deporte[] getDeportes() {
        return deportes;
    }

    public void setDeportes(Deporte[] deportes) {
        this.deportes = deportes;
    }

    
    public void addPais(Pais p){
        
        Pais[] aux = Arrays.copyOf(paises, paises.length+1);
        aux[paises.length]=p;
        
        paises = aux;
        
    }

    public void removePais(String nombrePais){

        Pais[] aux = Arrays.copyOf(paises, paises.length-1);

        for (int i = 0; i < paises.length ; i++) {
            if (paises[i].getNombre().equals(nombrePais)){

            }else {

                aux = Arrays.copyOf(aux,aux.length+1);
                aux[aux.length-1]=paises[i];

            }
        }

        paises = aux;

    }



    public void addDeporte(Deporte d){

        Deporte[] aux = Arrays.copyOf(deportes, deportes.length+1);
        aux[deportes.length]=d;

        deportes = aux;

    }


    public void removeDeporte(String nombreDeporte){

        Deporte[] aux = Arrays.copyOf(deportes, deportes.length-1);

        for (int i = 0; i < deportes.length ; i++) {
            if (deportes[i].getNombre().equals(nombreDeporte)){

            }else {

                aux = Arrays.copyOf(aux,aux.length+1);
                aux[aux.length-1]=deportes[i];

            }
        }

        deportes = aux;

    }


    public void mostrarPaisesParaCeremonia(){
        Arrays.sort(paises);
    }



    public void mostrarPaises(){
        Arrays.sort(paises, new Comparator<Pais>() {
            @Override
            public int compare(Pais o1, Pais o2) {
                return o2.getNumPart()-o1.getNumPart();
            }
        });
    }





    @Override
    public String toString() {
        return "Juegos{" +
                "year=" + year +
                ", sede='" + sede + '\'' +
                ", paises=" + Arrays.toString(paises) +
                ", deportes=" + Arrays.toString(deportes) +
                '}';
    }
}

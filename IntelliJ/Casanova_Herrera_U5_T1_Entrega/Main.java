package Casanova_Herrera_U5_T1_Entrega;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Juegos Rio = new Juegos(2010, "A23");
        Juegos Rusia  = new Juegos(2020, "B24");

        Judokas j1 = new Judokas("Manuel", 19, 10);
        Atletas a1 = new Atletas("Paco", 24, "Cuartos de final");
        JugadoresBaloncesto b1 = new JugadoresBaloncesto("Jesús", 22, 2.05);
        JugadoresBaloncesto[] jugadores = new JugadoresBaloncesto[0];
        Participante[] participantes = new Participante[0];

        Pais[] paises = new Pais[0];
        Pais España = new Pais("España",54);
        Pais Alemania = new Pais("Alemania",65);
        Pais China = new Pais("China",84);
        Pais Andorra = new Pais("Andorra",12);

        participantes.





        j1.pelear();
        j1.hacerJuramento();
        a1.correr();
        a1.hacerJuramento();
        b1.encestar();
        b1.hacerJuramento();


        Rio.addPais(España);
        Rio.addPais(Alemania);

        Rio.mostrarPaises();
        Rio.mostrarPaisesParaCeremonia();


        Rio.removePais("España");

        Rio.mostrarPaises();
        Rio.mostrarPaisesParaCeremonia();

        Rio.addDeporte(Judo);
        Rio.removeDeporte("Judo");





        public void mostrarJugadoresDeBaloncestoPorAltura(){
            Arrays.sort(jugadores, new Comparator<JugadoresBaloncesto>() {
                @Override
                public int compare(JugadoresBaloncesto o1, JugadoresBaloncesto o2) {

                    if (o1.getAltura()-o2.getAltura()>0){
                        return 1;

                    }else if (o1.getAltura()-o2.getAltura()<0){
                        return -1;

                    }else{
                        return 0;
                    }
                }
            });
        }

    }
}

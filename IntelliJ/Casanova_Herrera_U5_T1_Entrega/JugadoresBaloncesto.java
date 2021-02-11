package Casanova_Herrera_U5_T1_Entrega;

import java.util.Comparator;

public class JugadoresBaloncesto extends Participante implements Encestar, Comparator <JugadoresBaloncesto> {

    private double altura;

    public JugadoresBaloncesto(String nombre, int edad, double altura) {
        super(nombre, edad);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    @Override
    public String toString() {
        return "JugadoresBaloncesto{" +
                "altura=" + altura +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", inscrito=" + inscrito +
                '}';
    }

    @Override
    public void hacerJuramento() {
        System.out.println("Yo, "+getNombre()+" como jugador de baloncesto, juro los valores deportivos mundiales");
    }

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
}

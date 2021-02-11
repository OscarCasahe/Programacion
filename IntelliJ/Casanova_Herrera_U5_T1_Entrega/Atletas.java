package Casanova_Herrera_U5_T1_Entrega;

public class Atletas extends Participante implements Correr{

    private String prueba;




    public Atletas(String nombre, int edad, String prueba) {
        super(nombre, edad);
        this.prueba = prueba;
    }

    public String getPrueba() {
        return prueba;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }

    @Override
    public String toString() {
        return "Atletas{" +
                "prueba='" + prueba + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", inscrito=" + inscrito +
                '}';
    }

    @Override
    public void hacerJuramento() {
        System.out.println("Yo, "+getNombre()+" como atleta, juro los valores deportivos mundiales");
    }



}

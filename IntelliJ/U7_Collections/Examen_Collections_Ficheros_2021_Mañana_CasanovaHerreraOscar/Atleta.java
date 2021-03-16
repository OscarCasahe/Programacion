public class Atleta {

    private int dorsal;
    private static int generadorDorsal=1;
    private String nombre;
    private String pais;
    private int marca;
    private String categoria;
    private boolean finisher;


    public Atleta( String nombre, String pais, String categoria) {
        this.dorsal = generadorDorsal;
        generadorDorsal++;
        this.nombre = nombre;
        this.pais = pais;
        this.categoria = categoria;

    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isFinisher() {
        return finisher;
    }

    public void setFinisher(boolean finisher) {
        this.finisher = finisher;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", marca=" + marca +
                ", categoria='" + categoria + '\'' +
                ", finisher=" + finisher +
                '}';
    }
}

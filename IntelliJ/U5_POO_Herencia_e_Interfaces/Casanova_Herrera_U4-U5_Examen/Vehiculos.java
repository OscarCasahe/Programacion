public abstract class Vehiculos {

   protected String matricula;
   protected int cargaMax;
   protected Conductor conductor;

    public Vehiculos(String matricula, int carga, Conductor conductor) {
        this.matricula = matricula;
        this.cargaMax = carga;
        this.conductor = conductor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCarga() {
        return cargaMax;
    }

    public void setCarga(int carga) {
        this.cargaMax = carga;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    @Override
    public String toString() {
        return "Vehiculos{" +
                "matricula='" + matricula + '\'' +
                ", carga=" + cargaMax +
                ", conductor=" + conductor +
                '}';
    }
}

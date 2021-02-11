package Casanova_Herrera_U4_T1_Entrega;

import java.util.Calendar;

public class Empleado {

    private String fullName;
    private String nss;
    private String tlf;
    private Calendar fecha;
    private TipoEmpleado tipo;

    public Empleado(String fullName, String nss, String tlf, TipoEmpleado tipo) {
        this.fullName = fullName;
        this.nss = nss;
        this.tlf = tlf;
        this.fecha = Calendar.getInstance();
        this.tipo = tipo;
    }

    public Empleado(String fullName, String nss, String tlf) {
        this.fullName = fullName;
        this.nss = nss;
        this.tlf = tlf;
        this.fecha = Calendar.getInstance();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public TipoEmpleado getTipo() {
        return tipo;
    }

    public void setTipo(TipoEmpleado tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        String dia, mes, annio;
        Calendar c = Calendar.getInstance();
        dia = Integer.toString(c.get(Calendar.DATE));
        mes = Integer.toString(c.get(Calendar.MONTH));
        annio = Integer.toString(c.get(Calendar.YEAR));

        return "Empleado{" +
                "fullName='" + fullName + '\'' +
                ", nss='" + nss + '\'' +
                ", tlf='" + tlf + '\'' +
                ", fecha=" + dia + "/"+ mes +"/"+annio +
                ", tipo=" + tipo +
                '}';
    }
}

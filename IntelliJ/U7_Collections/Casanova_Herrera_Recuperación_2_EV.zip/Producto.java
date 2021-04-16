import java.util.Objects;

public class Producto {

    private String nombre;
    private int cantidad;
    private double precio;
    private int codigo;
    private static int generadorCodigo=0;

    public Producto(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.codigo = generadorCodigo;

        generadorCodigo++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() { return precio; }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                ", codigo=" + codigo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto)) return false;
        Producto producto = (Producto) o;
        return getCantidad() == producto.getCantidad() && Double.compare(producto.getPrecio(), getPrecio()) == 0 && getCodigo() == producto.getCodigo() && getNombre().equals(producto.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getCantidad(), getPrecio(), getCodigo());
    }
}

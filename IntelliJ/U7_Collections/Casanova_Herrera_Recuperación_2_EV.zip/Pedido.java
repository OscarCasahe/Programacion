import java.util.Calendar;
import java.util.Set;
import java.util.TreeSet;

public abstract class Pedido {

    protected String id;
    protected Set<Producto> carrito = new TreeSet<>();
    protected String fechaPedido;
    protected String fechaEntrega;
    private static int agenda = 0;

    public Pedido(String id, String fechaPedido, String fechaEntrega) {
        this.id = id;
        this.carrito=carrito;
        this.fechaPedido = fechaPedido;
        this.fechaEntrega = fechaEntrega;
        agenda++;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Set<Producto> getCarrito() {
        return carrito;
    }

    public void setCarrito(Set<Producto> carrito) {
        this.carrito = carrito;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", carrito=" + carrito +
                ", fechaPedido=" + fechaPedido +
                ", fechaEntrega=" + fechaEntrega +
                '}';
    }



    public void anadirProducto(Producto p, int cantidad){

        if (carrito.contains(p)){

            for (Producto p1 : carrito){

                if (p1.getCodigo()==p.getCodigo()){
                    cantidad = p1.getCantidad() ;
                 //p1.getPrecio() +=p1.getPrecio()*cantidad;
                }
            }
        }else{
            carrito.add(p);
            cantidad = p.getCantidad();
        }

    }


    public boolean borrarProducto(Producto p){
        if (carrito.contains(p)){
            carrito.remove(p);
            return true;
        }

        return false;
    }


   /* public static int numPedidosRealizados{

        return agenda;
    }*/


    public int calcularTotal(){
        int suma=0;


        for (Producto p : carrito){
            suma += p.getPrecio();
        }
        return suma;

    }








}

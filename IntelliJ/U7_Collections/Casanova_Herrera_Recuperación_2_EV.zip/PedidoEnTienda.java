import java.util.Calendar;

public class PedidoEnTienda extends Pedido{

    private String direccion;


    public PedidoEnTienda(String id, String fechaPedido, String fechaEntrega, String direccion) {
        super(id, fechaPedido, fechaEntrega);
        this.direccion = direccion;

    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "PedidoEnTienda{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                '}';
    }




}

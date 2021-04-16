import java.util.Calendar;

public class PedidoOnline extends Pedido implements Log, Comparable<PedidoOnline>{
    private String ip;
    private Metodo metodoPago;


    public PedidoOnline(String id, String fechaPedido, String fechaEntrega, String ip, Metodo metodoPago) {
        super(id,fechaPedido,fechaEntrega);
        this.ip = ip;
        this.metodoPago = metodoPago;

    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Metodo getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(Metodo metodoPago) {
        this.metodoPago = metodoPago;
    }

    @Override
    public String toString() {
        return "PedidoOnline{" +
                "id=" + id +
                ", ip='" + ip + '\'' +
                ", metodoPago=" + metodoPago +
                '}';
    }

    @Override
    public void printLog() {
        System.out.println("Fecha de la realización del pedido: "+fechaPedido);
        System.out.println("Fecha de entrega del pedido: "+fechaEntrega);
        System.out.println("Método de pago usado: "+metodoPago);
        System.out.println("Coste total del pedido: "+calcularTotal());

    }


    @Override
    public int compareTo(PedidoOnline o) {
        return this.calcularTotal()-o.calcularTotal();
    }
}

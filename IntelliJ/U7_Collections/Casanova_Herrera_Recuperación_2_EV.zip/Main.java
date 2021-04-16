import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        EmpresaOnline emp = new EmpresaOnline("Amazon");

        Pedido po1 = new PedidoOnline("111111X", "21-5-12", "21-5-17","192.127.0.1",Metodo.Tarjeta);
        Pedido po2 = new PedidoOnline("222222X", "21-12-19", "21-12-24","192.127.0.1",Metodo.Tarjeta);
        Pedido po3 = new PedidoOnline("333333X", "21-7-24", "21-7-30","192.127.0.1",Metodo.Tarjeta);
        Pedido po4 = new PedidoOnline("444444X", "21-1-5", "21-1-10","192.127.0.1",Metodo.Tarjeta);

        Pedido pt1 = new PedidoEnTienda("555555Y","21-2-2", "21-2-10","Avenida Tienda");
        Pedido pt2 = new PedidoEnTienda("666666Y","21-7-14", "21-2-22","Avenida Segunda Tienda");

        Producto p1 = new Producto("Leche", 1, 0.8);
        Producto p2 = new Producto("Mantequilla", 1, 1.55);
        Producto p3 = new Producto("Bolsa de Pan", 1, 1);
        Producto p4 = new Producto("Fideos Orientales", 1, 2.5);
        Producto p5 = new Producto("Leche", 1, 0.8);



        emp.CargarPedidosOnline();

        po1.anadirProducto(p1,1);
        po1.anadirProducto(p2,2);
        po1.anadirProducto(p1,2);

        for (Producto p : po1.carrito){
            System.out.println(p);
        }

        po2.anadirProducto(p4,1);
        po2.anadirProducto(p3,2);
        po2.anadirProducto(p1,1);

        for (Producto p : po2.carrito){
            System.out.println(p);
        }

        po3.anadirProducto(p3,2);
        po3.anadirProducto(p2,3);
        po3.anadirProducto(p5,1);

        for (Producto p : po3.carrito){
            System.out.println(p);
        }

        po4.anadirProducto(p5,6);

        for (Producto p : po4.carrito){
            System.out.println(p);
        }

        po3.borrarProducto(p5);

        for (Producto p : po3.carrito){
            System.out.println(p);
        }


        System.out.println("El coste total del pedido 4 es de "+po4.calcularTotal()+"€");


        System.out.println("Los pedidos ordenados por coste de importe: ");
        emp.mostrarPedidosOrdenados();

        System.out.println("¿Se ha vendido mantequilla?");
        emp.vendidoProducto(2);


        System.out.println("¿Se ha vendido chocolate?");
        emp.vendidoProducto(15);


        System.out.println("*Guardando...*");
        emp.EscribirPedidosOnline();



    }
}

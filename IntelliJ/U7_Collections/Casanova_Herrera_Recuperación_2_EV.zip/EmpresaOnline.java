import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeSet;

public class EmpresaOnline {

    Map<String, TreeSet<PedidoOnline>> registroPedidos;
    String nombre;

    public EmpresaOnline(String nombre) {
        this.nombre = nombre;
    }


    public  void CargarPedidosOnline(){

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("online.dat"));

            while(true){
                PedidoOnline p = (PedidoOnline) ois.readObject();
            }

        } catch (Exception e) {

        }

    }


    public  void EscribirPedidosOnline (){

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("online.dat"));

            for ( TreeSet<PedidoOnline> lista : registroPedidos.values()){
                for (PedidoOnline p : lista){
                    System.out.println(p);
                }
            }

            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public void mostrarPedidosOrdenados(){
        ArrayList<PedidoOnline> pedidosOnline = new ArrayList(registroPedidos.values());

        Collections.sort(pedidosOnline);

       for (PedidoOnline p : pedidosOnline){
           System.out.println(p);
       }
    }


    public void vendidoProducto(int codigo){

        if (registroPedidos.values().contains(codigo)){
            System.out.println("Este producto se ha vendido recientemente.");
        }else{
            System.out.println("Este producto no se ha vendido hasta ahora.");
        }

    }

}

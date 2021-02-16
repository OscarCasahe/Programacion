import java.lang.invoke.CallSite;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        Prendas p1 = new Prendas(6,"Camiseta","111111111", 0.3);
        Prendas p2 = new Prendas(12,"Pantalones","222222222", 0.85);
        Prendas p3 = new Prendas(15,"Sudadera","333333333", 0.7);

        PrendaColgada p4 = new PrendaColgada(20,"Camisa","444444444", 0.2, 85);
        PrendaColgada p5 = new PrendaColgada(25,"Chinos","555555555", 0.6, 110);
        PrendaColgada p6 = new PrendaColgada(45,"Americana","666666666", 0.2, 92);

        Cajas caja1 = new Cajas(123);
        Cajas caja2 = new Cajas(456);
        Cajas caja3 = new Cajas(789);



        Conductor conductor1 = new Conductor("Pepe", "Pérez", "111222333");
        Conductor conductor2 = new Conductor("Paco", "Mer", "444555666");

        CamionCajas c1 = new CamionCajas("A1111",150,conductor1);
        Cajas[] cajasCamion = c1.cajas;

        CamionPerchas c2 = new CamionPerchas("B2222",17,conductor2);
        PrendaColgada[] prendasColgadas = c2.prendasColgadas;


        System.out.println("AÑADIR Y QUITAR CAJAS");
        System.out.println();

        c1.addCaja(caja1, cajasCamion);
        c1.addCaja(caja2, cajasCamion);
        c1.addCaja(caja3, cajasCamion);
        System.out.println(Arrays.toString(cajasCamion));
        System.out.println();
        System.out.println("Ordenamos:");
        Arrays.sort(cajasCamion);
        System.out.println(Arrays.toString(cajasCamion));

        c1.removeCaja(caja2, cajasCamion);
        System.out.println(Arrays.toString(cajasCamion));


        System.out.println("-----------------------");


        System.out.println("AÑADIR Y QUITAR PRENDAS");
        System.out.println();

        c2.addPrenda(p4, prendasColgadas);
        c2.addPrenda(p5, prendasColgadas);
        c2.addPrenda(p6, prendasColgadas);
        System.out.println(Arrays.deepToString(prendasColgadas));

        System.out.println("Ordenamos:");
        Arrays.sort(prendasColgadas);
        System.out.println(Arrays.deepToString(prendasColgadas));

        System.out.println();

        c2.removePrenda(p4, prendasColgadas);
        System.out.println(Arrays.deepToString(prendasColgadas));


        System.out.println("");
        System.out.println("METODOS COLGAR, DOBLAR, DEVOLVER Y DESCARGAR");

        p4.colgar(p4);
        p1.devolver(p1, prendasColgadas);
        c1.descargar(2,5);
        c2.descargarPrendas(4);







    }
}

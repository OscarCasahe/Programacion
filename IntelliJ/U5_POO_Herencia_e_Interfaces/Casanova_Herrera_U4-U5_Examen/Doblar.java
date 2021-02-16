public interface Doblar {

    public default void Doblar(Prendas p1){

        if (p1 instanceof PrendaColgada){
            System.out.println("La prenda "+p1.nombre+" no se puede doblar");
        }else {
            System.out.println("La prenda "+p1.nombre+" se puede doblar");
        }

    }

}

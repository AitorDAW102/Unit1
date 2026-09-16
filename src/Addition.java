public class Addition {
    //constante a
    static int A =150;

    //variables numericas para operarlas
    public  static void main(String[] args){
        int b = 50;
        int c = sum(b);

        //resultado de la operacion
        System.out.println("La suma de "+ A +" y "+ b + " es "+ c);
    }

    //operacion para el valor c
    static int sum(int y){
        int z;
        z = A +y;
        return z;
    }
}

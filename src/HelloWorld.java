public class HelloWorld {
    //constantes
    static final double IVA = 0.21; //creacion de una constante invariable para su futuro uso. Teniando que ir fuera de un void
    public static void main(String[] arguments) {
        //primeras variables e impresion
        String a= "Hello World!";
        int num = 8;
        System.out.println(a);
        System.out.println(num);
        boolean apagado = false;
        System.out.println(apagado);

        //IVA
        double cantidad1 = 1000;
        double cantidad2 = 99999;
        System.out.println(cantidad1*IVA);
        System.out.println(cantidad2*IVA);

        //operaciones
            //suma
        double suma = cantidad1+cantidad2;

            //resta
        double resta = cantidad1-cantidad2;

            //multiplicacion
        double multiplicacion = cantidad1*cantidad2;

            //division
        double division = cantidad1/cantidad2;

            //resto
        double resto = cantidad1%cantidad2;

            //resultados
        System.out.println("La suma es "+ suma);
        System.out.println("La resta es "+ resta);
        System.out.println("La multiplicación es "+ multiplicacion);
        System.out.println("La división es "+ division);
        System.out.println("El resto es "+ resto);
    }
}

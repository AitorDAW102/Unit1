import javax.imageio.ImageTranscoder;

public class Ejercicio6y7 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 8;
        System.out.println("el valor de A es "+num1+"el valor de  es "+num2);
        int A = num2;
        num2=num1;
        num1=A;
        System.out.println("el valor de A es "+num2+"el valor de  es "+num1);

        double lenght = 18.84;
        double result= lenght*2*Math.PI;
        System.out.println("La circunferencia de "+lenght+ "es " +result);
    }
}

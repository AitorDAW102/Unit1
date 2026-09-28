public class Dados {
    public static void main(String[] args) {
        int dado1;
        int dado2;
        int sum;


        dado1= (int) (Math.random()*6+1);
        dado2= (int) (Math.random()*6+1);
        sum=dado1+dado2;



        System.out.println("El primer dado es "+dado1);
        System.out.println("El segundo dado es "+dado2);
        System.out.println("EL resultado es "+sum);
    }
}

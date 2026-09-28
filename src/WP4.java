public class WP4 {
    public static void main(String[] args) {
        int billete50 = 3;
        int billete20 = 6;
        int billete10 = 10;
        int billete5=2;
        int monedasEuro=7;
        int moneda50=9;
        double total;
        total = billete50*50+billete20*20+billete10*10+billete5*5+monedasEuro+moneda50*0.5;
        System.out.println("La cantidad total es "+total+"€");
    }
}

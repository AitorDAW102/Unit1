public class WP5 {
    public static void main(String[] args) {
        int time=5000;
        int min;
        int hour;
        int seg;

        hour = time/3600;
        min=time%3600/60;
        seg=time%3600%60;

        System.out.println(time+"segundos son "+hour+" horas "+min+" minutos "+seg+" segundos");
    }
}

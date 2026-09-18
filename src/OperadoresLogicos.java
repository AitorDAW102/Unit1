public class OperadoresLogicos {
    public static void main(String[] args) {
        int edad = 16;
        int nota = 6;
        boolean tienePremio = edad > 18 & nota >8;
        System.out.println("¿Tiene premio :?" + tienePremio);
    }
}

public class WP8 {
    public static void main(String[] args) {
        int num;
        int resto;
        boolean par;
        num= (int) (Math.random()*1000+1);
        resto=num%2;
        par=resto==0;
        System.out.println("¿"+num+" es un numero par? "+par+" Tiene resto "+resto);


        //NO OBLIGATORIO SOLO VOLUNTARIO
        if (resto==0)
        {
            System.out.println(num+" es un numero par. Tiene resto "+resto);
        }
        else
        {
            System.out.println(num+" es un numero impar. Tiene resto "+resto);
        }
    }
}

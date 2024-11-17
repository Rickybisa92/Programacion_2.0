import java.util.Arrays;

public class printf1 {
    public static void main(String[] args) {
        String a1 = "teclados";
        double p1 = 10.2;

        String a2 = "raton";
        double p2 = 9.99;

        String a3 = "Puerto HDMI";
        double p3 = 12.5;

        int amplaria = 20;
        String fmt = "%-" + amplaria + "s";

        System.out.printf(fmt + " | %s", "Articulos", "Precios");
        System.out.println();
        System.out.println(repetirCaracter('-', amplaria+1) + "+---------");
        System.out.printf(fmt + " | %.2f", a1, p1);
        System.out.println();
        System.out.printf(fmt + " | %.2f", a2, p2);
        System.out.println();
        System.out.printf(fmt + " | %.2f", a3, p3);

    }

    private static String repetirCaracter(char c, int num){
        String res = "";
        for (int i = 0; i < num; i++) {
            res += c;
        }
        return res;
    }
}

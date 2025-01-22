import java.util.Arrays;

public class exercici8 {
    public static void main(String[] args) {
        Baralla baralla = new Baralla();

        mescla(baralla);
        System.out.println(Arrays.toString(baralla.Cartes));
    }

    static void mescla(Baralla baralla) {
        for (int i = 47; i > 0; i--) {
            int index = aleatori(i);
            Carta c = baralla.Cartes[index];
            baralla.Cartes[index] = baralla.Cartes[i];
            baralla.Cartes[i] = c;
        }
    }

    static int aleatori(int n) {
        return (int) (Math.random() * n);
    }
}

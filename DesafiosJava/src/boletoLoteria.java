public class boletoLoteria {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            numeros[i] = (int) (Math.random() * 100);
        }
        System.out.printf("Los números de la lotería son: %d %d %d %d %d\n", numeros[0], numeros[1], numeros[2], numeros[3], numeros[4]);
    }
}

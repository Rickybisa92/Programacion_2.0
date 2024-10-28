import java.util.Scanner;

public class funcionEsPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int num = scanner.nextInt();

        System.out.println(Primo(num));
    }


    public static boolean Primo(int n) {
        boolean esPrimo = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                esPrimo = false;
                break;
            }
        }
        return esPrimo;
    }


}

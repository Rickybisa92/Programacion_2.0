import java.util.Scanner;

public class trianguloRectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige el tamaño de la pantalla: ");
        char[][] pantalla = new char[sc.nextInt()][sc.nextInt()];
        System.out.println("Elige el caracter con el que quieres rellenar la pantalla: ");
        fillScreen(pantalla, sc.next().charAt(0));

    }

    public static void fillScreen(char[][] screen, char c) {
        for (int i = 0; i < screen.length; i++) {
            for (int j = 0; j < screen[i].length; j++) {
                screen[i][j] = c;
            }
        }
    }
}

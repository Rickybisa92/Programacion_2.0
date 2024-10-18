import java.util.Scanner;

/*
16- Fes un programa que efectui els següents càlculs, donades dues variables “a” i “b” (de tipus int:
 */
public class Exercici16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero:");
        int a = scanner.nextInt();
        System.out.println("Escribe otro numero:");
        int b = scanner.nextInt();
        System.out.println("Escribeme otro numero más");
        int c = scanner.nextInt();

        int aAlCuadrado = a * a;
        int bAlCuadrado = b * b;
        int cAlCuadrado = c * c;
        int aAlCubo = a * a * a;
        int bAlCubo = b * b * b;
        int aElevado4 = a * a * a * a;
        int bElevado4 = b * b * b * b;

        int dosPorAPorB = 2 * a * b;
        int dosPorBPorC = 2 * b * c;
        int dosPorCPorA = 2 * c * a;

        //Calcular (a-b)(a+b)
        int resultado1 = (a - b) * (a + b);
        System.out.println(resultado1);

        //Calcular a^2 + 2ab + b^2
        int resultado2 = aAlCuadrado + dosPorAPorB + bAlCuadrado;
        System.out.println(resultado2);

        //Calcular (a + b)^2 - 2ab
        int resultado3 = (a + b) * (a + b) - dosPorAPorB;
        System.out.println(resultado3);

        //Calcular a^2 - 2ab + b^2
        int resultado4 = aAlCuadrado - dosPorAPorB + bAlCuadrado;
        System.out.println(resultado4);

        //Calcular a^2 + b^2 + c^2 + 2ab + 2bc + 2ca
        int resultado5 = aAlCuadrado + bAlCuadrado + cAlCuadrado + dosPorAPorB + dosPorBPorC + dosPorCPorA;
        System.out.println(resultado5);

        //Calcular a^2 + b^2 + c^2 - 2ab + 2bc - 2ca
        int resultado6 = aAlCuadrado + bAlCuadrado + cAlCuadrado - dosPorAPorB + dosPorBPorC - dosPorCPorA;
        System.out.println(resultado6);

        //Calcular a^3 + 3a^2b + 3ab^2 + b^3
        int resultado7 = aAlCubo + 3 * aAlCuadrado * b + 3 * a * bAlCuadrado + bAlCubo;
        System.out.println(resultado7);

        //Calcular a^3 - 3a^2b + 3ab^2 - b^3
        int resultado8 = aAlCubo - 3 * aAlCuadrado * b + 3 * a * bAlCuadrado - bAlCubo;
        System.out.println(resultado8);

        //Calcular (a - b)(a^2 + ab + b^2)
        int resultado9 = (a - b) * (aAlCuadrado + a * b + bAlCuadrado);
        System.out.println(resultado9);

        //Calcular (a + b)(a^2 - ab + b^2)
        int resultado10 = (a + b) * (aAlCuadrado - a * b + bAlCuadrado);
        System.out.println(resultado10);

        //Calcular a^4 + 4a^3b + 6a^2b^2 + 4ab^3 + b^4
        int resultado11 = aElevado4 + 4 * aAlCubo * b + 6 * aAlCuadrado * bAlCuadrado + 4 * a * bAlCubo + bElevado4;
        System.out.println(resultado11);

        //Calcular a^4 - 4a^3b + 6a^2b^2 - 4ab^3 + b^4
        int resultado12 = aElevado4 - 4 * aAlCubo * b + 6 * aAlCuadrado * bAlCuadrado - 4 * a * bAlCubo + bElevado4;
        System.out.println(resultado12);

        //Calcular (a - b)(a + b)(a^2 + b^2)
        int resultado13 = (a - b) * (a + b) * (aAlCuadrado + bAlCuadrado);
        System.out.println(resultado13);

    }
}

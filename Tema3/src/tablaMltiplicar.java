import java.util.Scanner;

public class tablaMltiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero para sacar su tabla de multiplicar");

        int num = scanner.nextInt();
        int contador = 1;
        int resultado;


        if (num >= 1 && num <= 10)
        while (contador <= 10) {
            resultado = num * contador;
            System.out.println(num + "x" + contador + "=" + resultado);
            contador++;
        } else {
            System.out.println("No puedo mostrar la tabla del: " + num);
        }
    }
}

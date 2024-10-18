import java.util.Scanner;

/*
9- Escriu un programa que efectui una operació bit a bit AND amb els números hexadecimals EE7A
i CAF3
 */
public class Exercici9 {
    public static void main(String[] args) {
        int hexa1 = 0xEE7A;
        int heax2 = 0xCAF3;


        int resultadoAND = hexa1&heax2;

        System.out.println("El resultado de " + hexa1 + " y " + heax2 + " es: " + resultadoAND);
    }
}

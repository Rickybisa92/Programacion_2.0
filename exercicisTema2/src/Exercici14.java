import java.util.Scanner;

/*
14- Fes un programa que calculi la divisió de dos números tipus double i el resultat ho posi en una
variable de tipus int
 */
public class Exercici14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero:");
        double num1 = scanner.nextDouble();

        System.out.println("Dame otro numero:");
        double num2 = scanner.nextDouble();

        int división = (int) (num1 / num2);

        System.out.println("El resultado de la división es: " + división);
    }
}

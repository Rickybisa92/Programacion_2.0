import java.util.Scanner;

public class exempleString3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primer String: ");
        String s1 = scanner.nextLine();

        System.out.println("Segundo String: ");
        String s2 = scanner.nextLine();

        boolean sonIguales = s1.equals(s2); //"equals" solo funciona con objetos
        boolean sonIguales2 = s1.equalsIgnoreCase(s2); //Ignora si son mayusculas o minusculas
        boolean sonIguals3 = s1.contains(s2); // Si añades "hola" y luego "la" sera true porque "hola" contiene "la"
        System.out.println(sonIguales);
        System.out.println(sonIguales2);



    }
}

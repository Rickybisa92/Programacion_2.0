import java.util.Scanner;

public class superString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primer String: ");
        String s1 = scanner.nextLine();

        System.out.println("Primer index: ");
        int index1 = scanner.nextInt();

        System.out.println("Segundo index: ");
        int index2 = scanner.nextInt();

        String s2 = s1.substring(index1, index2);

        System.out.println(s2);

      //  String s2 = s1.substring(1, 3); // coge las letras por el orden que esten colocados
        // ejemplo: abcdefghi = b,d, son las posiciones de esos dos caracteres


    }
}

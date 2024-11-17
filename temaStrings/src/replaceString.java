import java.util.Scanner;

public class replaceString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primer String");
        String s = scanner.nextLine();
        String s1 = "holaaaa";

        s = s.replace("a", "b");
        System.out.println(s);
    }
}

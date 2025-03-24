import java.util.ArrayList;
import java.util.LinkedList;

public class Linkedist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        LinkedList<String> list2 = new LinkedList<>();
        list2.push("Hola");
        list2.push("Adios");
        list2.push("Hasta luego");
        String element = list2.pop();
        System.out.println(element);
        System.out.println(list2);

        list.add("Hola");
        list.add("Adios");
        list.add("Hasta luego");
    }
}

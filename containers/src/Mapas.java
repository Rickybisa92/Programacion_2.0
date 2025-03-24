import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {
        Map<String, Integer> mapaPersonas = new HashMap<>();
        mapaPersonas.put("Pepito", 1990);
        mapaPersonas.put("Juanito", 1990);
        mapaPersonas.put("Jack", 1999);
        mapaPersonas.put("Pepito", 1995);

        System.out.println(mapaPersonas.get("Juanito"));
        System.out.println(mapaPersonas);
    }
}

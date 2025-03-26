import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExerciciContainers4 {
    public static void main(String[] args) {

        List<Country> countryList = new ArrayList<Country>();
        countryList.add(new Country("Spain"));
        countryList.add(new Country("France"));
        countryList.add(new Country("Germany"));
        countryList.add(new Country("Italy"));
        Collections.shuffle(countryList);

    }
}

class Country {
    String name;

    public Country(String name) {
        this.name = name;
    }
}
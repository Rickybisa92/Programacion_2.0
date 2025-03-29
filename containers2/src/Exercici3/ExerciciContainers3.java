import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExerciciContainers3 {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("John", 1990));
        persons.add(new Person("Mary", 1981));
        persons.add(new Person("Tom", 2000));
        persons.add(new Person("Elisabeth", 1999));
        Collections.sort(persons, new PersonBirthComparator());
        System.out.println(persons);
        System.out.println("------------------------------------------------");
        Collections.sort(persons, new PersonNameComparator());
        System.out.println(persons);
    }
}

class Person {
    int birthYear;
    String name;


    Person(String name, int birthYear) {
        this.birthYear = birthYear;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s %d", name, birthYear);
    }
}

class PersonBirthComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.birthYear == o2.birthYear) {
            return 0;
        } else if (o1.birthYear < o2.birthYear) {
            return -1;
        } else {
            return 1;
        }
    }
}

class PersonNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        for (int i = 0; i < o1.name.length() && i < o2.name.length(); i++) {
            if (o1.name.charAt(i) == o2.name.charAt(i)) {
                continue;
            } else if (o1.name.charAt(i) < o2.name.charAt(i)) {
                return -1;
            } else {
                return 1;
            }
        }
        return 0;
    }
}

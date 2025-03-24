import java.util.HashSet;
import java.util.Set;

public class Setter {
    public static void main(String[] args) {
      /*  Set<Integer> conjunto = new HashSet<>();
        conjunto.add(1);
        conjunto.add(5);
        conjunto.add(8);
        conjunto.add(5);
        System.out.println(conjunto); */


        /* String frase = "Hola escola marratxi liceu, hola ordinador programa escola";

        String[] palabras = frase.split(" ");
        Set<String> conjunto = new HashSet<>();
        for (int i = 0; i < palabras.length; i++) {
            conjunto.add(palabras[i]);
        }
        System.out.println(conjunto);
        System.out.println(conjunto.size()); */

        Person p1 = new Person("Pepito", 1990);
        Person p2 = new Person("Juanito", 1990);
        Person p3 = new Person("Pepito", 1990);


        Set<Person> conjunto = new HashSet<>();
        conjunto.add(p1);
        conjunto.add(p2);
        conjunto.add(p3);
        System.out.println(conjunto);

    }
}

class Person {
    String name;
    int birthYear;

    Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    @Override
    public boolean equals(Object obj) {
        Person p = (Person) obj;
        return this.name.equals(p.name) && this.birthYear == p.birthYear;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.birthYear;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " " + "BirthYear: " + this.birthYear;
    }
}

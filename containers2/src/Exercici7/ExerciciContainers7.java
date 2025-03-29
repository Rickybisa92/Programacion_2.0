import java.util.Map;
import java.util.*;

/*7- Crea les classes «Cat» i «Dog». Ara crea una llista on es pugui inserir objectes de les dues classes
següents. Fes un bucle on es tregui element per element i indiqui si es tracta d'un «Cat» o un «Dog». */

public class ExerciciContainers7 {
    public static void main(String[] args) {

        List<Object> animals = new ArrayList<>();
        animals.add(new Cat("Percy"));
        animals.add(new Dog("Doggy"));
        animals.add(new Cat("Mittens"));
        animals.add(new Dog("Rex"));
        animals.add(new Cat("Whiskers"));
        animals.add(new Dog("Fido"));

        for (Object animal : animals) {
            System.out.println(animal);
            if (animal instanceof Cat) {
                System.out.println("Miauu");
            } else if (animal instanceof Dog) {
                System.out.println("Guauu");
            }
        }


        // Otro metodo
        // List<Animal> animals = new ArrayList<>();
    }
}

class Animal {

}

class Cat extends Animal {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Dog extends Animal {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}



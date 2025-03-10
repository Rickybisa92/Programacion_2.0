import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Animal a = new Cat();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cat or Dog");
        String s = scanner.nextLine();
        Animal b = s.equals("d") ? dog : cat;
        dosmething(b);
    }

    private static void dosmething(Animal a) {
        a.eat();
        a.getName();
        if (a instanceof Fish) {
            Fish f = (Fish) a;
            f.getNumberOfFins();
        }
    }


}

interface Robot{
    void changeOil();
}

interface Animal {
    void eat();

    String getName();


}

class Cat implements Animal {
    public void eat() {
        System.out.println("Cat eating");
    }

    public String getName() {
        return "Josep";
    }
}

class Fish implements Animal {
    int getNumberOfFins() {
        return 1;
    }

    public void eat() {
        System.out.println("Ñom Ñom");
    }

    @Override
    public String getName() {
        return "";
    }
}

class Dog implements Animal {

    public void eat() {
        System.out.println("Ñom Ñom");
    }

    @Override
    public String getName() {
        return "";
    }

}

class  MechaDog implements Animal,Robot{

    @Override
    public void eat() {

    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void changeOil() {

}
}

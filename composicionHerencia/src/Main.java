public class Main {
    public static void main(String[] args) {

        Persona Bill = new Persona(new Job());
        Bill.setName("Bill");
        Bill.birthYear = 1955;
        Bill.job.salary = 1000;

        Job job = new Job();
        job.description = "Software Engineer";
        job.salary = 100000.0;


        Bill.job = job;


        Human John = new Human(); // Instanciar un objeto de la clase Human
        John.eat();
        John.move();

        Cat cat = new Cat(); // Instanciar un objeto de la clase Cat
        cat.eat();
        cat.name = "Tom";


        John.move();
        cat.move();

        moveAnimal(John);



        Human bill = new Human();
        Animal animal = new Animal("Animal");

        Mammal m = bill;
        Human h = (Human) animal;
    }

    static void moveAnimal(Animal animal) {
        animal.move();
    }
}

class Persona {
    String name;
    int birthYear;
    // Composicion de objectos: Un o mas de los atributos de una clase
    // consiste en objectos de otros  tipos o clases
    Job job;

    Persona(Job job) {
        super();
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}

class Job {
    String description;
    double salary;
}


// Herencia

class Animal {
    String name;

    // Constructor de la clase Animal
    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println("I am eating");
    }

    void move() {
        System.out.println("I am moving");
    }

}

class Mammal extends Animal {

    Mammal() {
        super("Mammal");
    }

    void eat() {
        System.out.println("I am eating like a mammal");
    }
}

class Human extends Mammal {
    @Override
    void move() {
        System.out.println("I am moving like a human");
    }

    @Override
    void eat() {
        System.out.println("I am eating like a human");
    }
}

class Cat extends Animal {

    Cat() {
        super("Cat");
    }

    @Override
    void move() {
        System.out.println("I am moving like a cat");
    }
}
import java.util.Random;
import java.util.Scanner;

public class rpg {
    enum TStrategy {
        ATTACK, DEFENSE, ENGAÑO, MANIOBRA
    }

    public static void main(String[] args) {
        Warrior player = askUser();
        Warrior computer = randomWarrior();

        System.out.println(player);
        System.out.println(computer);
        fight(player, computer);
    }

    private static Warrior askUser() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        Warrior.TWarrior[] types = Warrior.TWarrior.values();
        System.out.println("Choose warrior type:");

        for (int i = 0; i < types.length; i++) {
            System.out.printf("%d - %s\n", i + 1, types[i]);
        }

        int number = Integer.parseInt(sc.nextLine());
        Warrior.TWarrior type = types[number - 1];

        Warrior warrior = new Warrior(name, type);
        warrior.setUp();
        return warrior;
    }

    public static Warrior randomWarrior() {
        Warrior.TWarrior[] types = Warrior.TWarrior.values();
        Random rand = new Random();
        int randomIndex = rand.nextInt(types.length);

        Warrior warrior = new Warrior("Computer", types[randomIndex]);
        warrior.setUp();
        return warrior;
    }

    public static void fight(Warrior player, Warrior computer) {
        TStrategy strategy1 = askStrategy(player);
        TStrategy strategy2 = chooseRandomStrategy(computer);
        int succesRate = calculateSuccesRate (player, strategy1);
        int succesRate2 = calculateSuccesRate (computer, strategy2);

        if (strategy1 == TStrategy.ATTACK && strategy2 == TStrategy.ATTACK) {
            player.damage(succesRate2);
            computer.damage(succesRate);
        } else if (strategy1 == TStrategy.ATTACK && strategy2 ==TStrategy.DEFENSE) {
            computer.heal(succesRate2);
        }

    }

    public static TStrategy askStrategy (Warrior player) {
        System.out.printf("%s, choose strategy (ATTACK, DENFESE, ENGAÑO, MANIOBRA", player.name);
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        TStrategy strategy;
        if (userInput.equalsIgnoreCase("A")) {
            strategy = TStrategy.ATTACK;
        } else if (userInput.equalsIgnoreCase("D")) {
            strategy = TStrategy.DEFENSE;
        } else if (userInput.equalsIgnoreCase("E")) {
            strategy = TStrategy.ENGAÑO;
        } else {
            strategy = TStrategy.MANIOBRA;
        }

        return strategy;
    }

    public static TStrategy chooseRandomStrategy(Warrior computer) {
        int random = (int) (Math.random()*4);
        return TStrategy.values()[random];
    }

    public static int calculateSuccesRate(Warrior warrior, TStrategy strategy) {
        if (strategy == TStrategy.ATTACK || strategy == TStrategy.ENGAÑO) {
            int attack = warrior.attack;
            return(int) (Math.random()*attack);
        }
        int defense = warrior.defense;
        return (int) (Math.random()*defense);
    }
}

class Warrior {
    String name;
    int level = 1;
    int score = 0;
    int life;
    int maxLife;
    int attack;
    int defense;

    enum TWarrior {
        KNIGHT, OGRE, WIZARD, WOLF, PALADIN, DRAGON
    }

    TWarrior warriorType;

    public Warrior(String name, TWarrior warriorType) {
        this.name = name;
        this.warriorType = warriorType;
    }

    public void setUp() {
        maxLife = 100;
        life = maxLife;
        switch (warriorType) {
            case KNIGHT:
                attack = 11;
                defense = 7;
                break;
            case OGRE:
                attack = 11;
                defense = 4;
                break;
            case WIZARD:
                attack = 15;
                defense = 5;
                break;
            case DRAGON:
                attack = 13;
                defense = 5;
                break;
            default:
                attack = 10;
                defense = 5;
                break;
        }
    }

    public void damage(int succesRate) {
        life -= succesRate;
        if (life < 0) {
            life = 0;
        }
    }

    public void heal(int succesRate) {
        life += succesRate;
        if (life < maxLife) {
            life = maxLife;
        }
    }


    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", score=" + score +
                ", life=" + life +
                ", maxLife=" + maxLife +
                ", attack=" + attack +
                ", defense=" + defense +
                ", warriorType=" + warriorType +
                '}';
}

}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Warriror player = askUser();
        Warriror computer = randomWarrior();

        System.out.println(player.toString());
        System.out.println(computer.toString());
    }

    private static Warriror askUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your name? ");
        String name = scanner.nextLine();

        Warriror.typeWarrior[] types = Warriror.typeWarrior.values();
        for (int i = 0; i < types.length; i++) {
            System.out.printf("%d - %s\n", i+1, types[i].toString());
        }
        int number = Integer.parseInt(scanner.nextLine());
        Warriror.typeWarrior type = types[number-1];
        Warriror warriror = new Warriror();
        warriror.name = name;
        warriror.Warriortype = type;
        warriror.setup();
        return warriror;
    }

    private static Warriror randomWarrior() {
        Warriror warriror = new Warriror();
        warriror.name = "Siri";
        Warriror.typeWarrior[] types = Warriror.typeWarrior.values();
        int random = (int) (Math.random() * types.length);
        warriror.Warriortype = types[random];
        warriror.setup();
        return warriror;
    }


}

class Warriror {
    String name;

    public void setup() {
        maxLife = 15;
        life = 10;
        switch (Warriortype) {
            case OGRE:
                attack = 11;
                defense = 4;
                break;
            case WIZARD:
                attack = 10;
                defense = 1;
                break;
            case PALATIN:
                attack = 8;
                defense = 7;
                break;
            case ENANO:
                attack = 10;
                defense = 7;
                break;
            case HUMAN:
                attack = 8;
                defense = 4;
                break;
        }
    }

    enum typeWarrior { OGRE, WIZARD, PALATIN, ENANO, HUMAN }

    typeWarrior Warriortype;

    int level = 1;

    int score = 0;

    int life;

    int maxLife;

    int attack;

    int defense;

    @Override
    public String toString() {
        return "Warriror{" +
                "name='" + name + '\'' +
                ", Warriortype=" + Warriortype +
                ", level=" + level +
                ", score=" + score +
                ", life=" + life +
                ", maxLife=" + maxLife +
                ", attack=" + attack +
                ", defense=" + defense +
                '}';
    }
}
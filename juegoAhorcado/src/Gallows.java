public abstract class Gallows {
    int pointsLeft = 5;

    void display() {
        System.out.printf("Gallows: Points left %d\n", pointsLeft);
    }

    void addPart() {
        pointsLeft--;
    }

    boolean isHung() {
        return pointsLeft == 0;
    }
}


class TextGallows extends Gallows {
    String[] graphics = {
            "|----|\n" +
                    "|   \n" +
                    "|   \n" +
                    "|    \n" +
                    "|    \n" +
                    "|",

            "|----|\n" +
                    "|    O\n" +
                    "|   \\\n" +
                    "|    \n" +
                    "|    \n" +
                    "|",

            "|----|\n" +
                    "|    O\n" +
                    "|   /|\n" +
                    "|    \n" +
                    "|    \n" +
                    "|",
            "|----|\n" +
                    "|    O\n" +
                    "|   /|\\\n" +
                    "|    \n" +
                    "|    \n" +
                    "|",

            "|----|\n" +
                    "|    O\n" +
                    "|   /|\\\n" +
                    "|    |\n" +
                    "|       \n" +
                    "|",

            "|----|\n" +
                    "|    O\n" +
                    "|   /|\\\n" +
                    "|    |\n" +
                    "|   / \\\n" +
                    "|",
    };
    @Override
    void display() {
        System.out.println(graphics[5 - pointsLeft]);
    }
}
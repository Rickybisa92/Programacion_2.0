import java.util.Scanner;

public class GameController {
AlphabetDisplay alphabetDisplay;
WordDisplay wordDisplay;
Gallows gallows;
static Scanner scanner = new Scanner(System.in);

    GameController(AlphabetDisplay ad, WordDisplay wd, Gallows g) {
    this.alphabetDisplay = ad;
    this.wordDisplay = wd;
    this.gallows = g;
    }

    void playGame(Word w) {
        //while (!"palabra no adivinada y no hemos llegado al máximo de intentos ".equals("")){
        while (!gallows.isHung() && !w.isGuessed()){
            //Dibujar el gráfico del ahorcado
            this.gallows.display();
            //Dibujar la palabra con lo espacios en blanco
        this.wordDisplay.display(w);
            // pedir al usuario que escriba letras
        char lt = getInput();
            // si adivina , marcar las posiciones de la palabra como adivinada
       if (!w.doGuess(lt)){
           this.gallows.addPart();
       }
            // si no actaliza el gráfico del ahorcado (añadir una linea)
      }
        if (w.isGuessed()){
            //si ha ganado, dar la enhorabuena
            System.out.println("Muy bien, has ganado");
            this.wordDisplay.display(w);
        } else {
            // si no, mostrar el gráfico del ahorcado completo
            System.out.println("Que lastima.perdiste");
            this.gallows.display();
        }


    }

    private char getInput() {
        System.out.println("Escibe una letra: ");
       String s =GameController.scanner.nextLine();
      return s.toUpperCase().charAt(0);
    }
}

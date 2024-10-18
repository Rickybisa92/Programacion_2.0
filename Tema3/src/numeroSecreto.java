import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class numeroSecreto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivina el numero secreto");
        int numeroUsuario = scanner.nextInt();

        int numeroSecreto1 = 10;
        int numeroSecreto2 = 30;

        if (numeroUsuario == numeroSecreto1 || numeroUsuario == numeroSecreto2) {
            System.out.println("Enhorabuena, has acertado el numero secreto! " + numeroUsuario);
        } else {
            System.out.println("Lo sentimos, no has adivinado el numero");
        }
    }
}

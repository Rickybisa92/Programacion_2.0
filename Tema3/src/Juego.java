import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        // El usuario intenta adivinar un numero
        // tiene 3 oportunidades
        //Cada vez que el usuario introduce un numero,
        //el ordenador dice si este numero es mas grande o mas pequeño

        Scanner scanner = new Scanner(System.in);
        boolean adivinado = false;
        boolean oportunidadesAcabadas = false;
        int oportunidades = 3;
        int numeroSecreto = (int) (Math.random()*10);

        while (!adivinado && !oportunidadesAcabadas) {
            System.out.println("Introduce un numero:");
            int numUsuario = scanner.nextInt();

            if (numUsuario == numeroSecreto) {
                //Hemos adivinado
                System.out.println("Enhorabuena has adivinado el numero secreto: " + numeroSecreto);
                adivinado = true;
            } else if (numUsuario < numeroSecreto) {
                System.out.println("El numero secreto es más grande");
                oportunidades--;
            } else  {
                System.out.println("El numero secreto es más pequeño");
                oportunidades--;
            }

            if (oportunidades == 0) {
                //Hemos acabado las oportunidades
                System.out.println("Has perdido, te has quedado sin opotunidades");
                System.out.println("el numero secreto era: " + numeroSecreto);
                oportunidadesAcabadas = true;
            }
        }
    }
}

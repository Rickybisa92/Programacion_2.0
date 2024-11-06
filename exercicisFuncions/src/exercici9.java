import java.util.Scanner;

/*
Objectiu: Refactoritza el codi creant una funció anomenada convertirASegons que
converteixi hores i minuts a segons. Demana a l'usuari que introdueixi les hores i els minuts,
i mostra el resultat de la funció.
 */
public class exercici9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Horas: ");
        int hores = scanner.nextInt();

        System.out.println("Minutos:");
        int minuts = scanner.nextInt();

        System.out.println("Segundos:");
        int segons = scanner.nextInt();

        int totalSegundos = convertirASegundos(hores, minuts, segons);
        System.out.println("Resultado en segundos: " + totalSegundos);
    }

    public static int convertirASegundos(int horas, int minutos, int segundos){
        int total = segundos + minutos*60 + horas*3600;
        return total;
    }
}

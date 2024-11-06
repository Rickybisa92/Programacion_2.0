import java.util.Scanner;

/*
Objectiu: Refactoritza el codi creant una funció anomenada areaTriangle que calculi
l'àrea d'un triangle donada la base i l'altura. Demana a l'usuari que introdueixi aquests valors
i mostra el resultat de la funció.
 */
public class exercici8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame una base: ");
        double base = scanner.nextInt();
        System.out.println("Dame una altura: ");
        double altura = scanner.nextInt();

        double resultado = areaTriangulo(base, altura);


        System.out.println("L'àrea del triangle és: " + resultado);
    }

    public static double areaTriangulo(double b, double a){
        double resultado = (b * a) / 2;
        return resultado;
    }

}

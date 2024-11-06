import java.util.Scanner;

/*
Objectiu: Refactoritza el codi creant una funció anomenada menorDeDos que determini
quin és el menor de dos nombres. Demana a l'usuari que introdueixi els dos nombres i
mostra el resultat de la funció.
 */
public class exercici10 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Escribe un numero: ");
        int a = scanner.nextInt();

        System.out.println("Escribe otro numero: ");
        int b = scanner.nextInt();
        
        int menor = menorDeDos(a, b);

        System.out.println("El menor és: " + menor);
    }

    public static int menorDeDos(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
}

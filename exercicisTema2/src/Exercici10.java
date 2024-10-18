/*
10- Escriu un programa que declari tres variables: a, b i c, amb valors 111, 444, i 8888
respectivament. Efectua a xor b i després el resultat d’aquesta operació xor a.
 */
public class Exercici10 {
    public static void main(String[] args) {

        int a = 111;
        int b = 444;

        int operacionXor = a ^ b;
        int resultado = operacionXor ^ a;

        System.out.println(resultado);
    }
}

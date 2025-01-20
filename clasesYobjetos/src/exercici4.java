
// 4- Fes una classe anomenada «Nombre» amb les següents característiques:
// • El constructor accepta un valor «int»
//• El constructor accepta un «String» representant la forma «romana» del número
//• Té un mètode anomenat «hex» que retorna un string amb la forma hexadecimal del número
//• Té un mètode anomenat «bin» que retorna un string amb la forma binària del número.

import java.util.Scanner;

public class exercici4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quieres introducir un numero romano o con digitos? (R/D)");
        String tipo = scanner.nextLine();

        if (tipo.equalsIgnoreCase("R")) {
            System.out.println("Introduce un numero romano: ");
            String rom = scanner.nextLine();
            Nombre nombre = new Nombre(rom);
            System.out.println(nombre.getValor());
            System.out.println(nombre.toRoma());
            System.out.println(nombre.hex());
            System.out.println(nombre.bin());
        } else {
            System.out.println("Introduce un numero: ");
            int num = Integer.parseInt(scanner.nextLine());
            Nombre nombre = new Nombre(num);
            System.out.println(nombre.getValor());
            System.out.println(nombre.toRoma());
            System.out.println(nombre.hex());
            System.out.println(nombre.bin());
        }
    }
}

class Nombre {
    int valor;
    String nombre;

    //Creamos un constructor que accepta un valor int
    public Nombre(int n) {
        this.valor = n;
    }

    //Creamos un constructor que accepta un valor String, forma romana del numero
    public Nombre(String rom) {
        this.valor = convertirRomaANumero(rom.toUpperCase());
    }

    //Metodo que convierte un numero romano a un numero
    int convertirRomaANumero(String romano) {
        int resultado = 0;
        int anterior = 0;
        for (int i = 0; i < romano.length(); i++) {
            int actual = valorRomano(romano.charAt(i));
            if (anterior != 0 && anterior < actual) {
                resultado = resultado - 2 * anterior;
            }
            resultado = resultado + actual;
            anterior = actual;
        }
        return resultado;
    }

    //Metodo que devuelve el valor de un numero romano
    int valorRomano(char romano) {
        if (romano == 'I') {
            return 1;
        }
        if (romano == 'V') {
            return 5;
        }
        if (romano == 'X') {
            return 10;
        }
        if (romano == 'L') {
            return 50;
        }
        if (romano == 'C') {
            return 100;
        }
        if (romano == 'D') {
            return 500;
        }
        if (romano == 'M') {
            return 1000;
        }
        throw new RuntimeException("Caracter no valido");
    }

    public String hex() {
        return String.format("%x", this.valor);
    }

    public String bin() {
        return Integer.toBinaryString(this.valor);
    }

    int getValor() {
        return this.valor;
    }

    String toRoma() {
        return convertirNumeroARomano2(this.valor);
    }


    String toRoma(int n) {
        if (n == 1) {
            return "I";
        }
        if (n == 5) {
            return "V";
        }
        if (n == 10) {
            return "X";
        }
        if (n == 50) {
            return "L";
        }
        if (n == 100) {
            return "C";
        }
        if (n == 500) {
            return "D";
        }
        if (n == 1000) {
            return "M";
        }
        return "";

    }

    String convertirNumeroARomano(int n) {
        String resultado = "";
        int[] valores = {1000, 500, 100, 50, 10, 5, 1};
        for (int i = 0; i < valores.length; i++) {
            while (n >= valores[i]) {
                resultado += toRoma(valores[i]);
                n -= valores[i];
            }
        }
        return resultado;
    }

    //Funcion de numeros a romano con unidades, decenas y centenas
    String convertirNumeroARomano2(int n2) {
        int unidad = n2 % 10;
        int decena = (n2 % 100) / 10;
         int centena = n2 / 100;
         int millar = n2 / 1000;
        String resultado = "";
        int[] valores = {1000, 500, 100, 50, 10, 5, 1,0};
        for (int i = 0; i < valores.length; i++) {
            while (centena >= valores[i]) {
                resultado += toRoma(valores[i]);
                centena -= valores[i];
            }
        }
        for (int i = 0; i < valores.length; i++) {
            while (decena >= valores[i]) {
                resultado += toRoma(valores[i]);
                decena -= valores[i];
            }
        }
        for (int i = 0; i < valores.length; i++) {
            while (unidad >= valores[i]) {
                resultado += toRoma(valores[i]);
                unidad -= valores[i];
            }
        }
        return resultado;
    }

}
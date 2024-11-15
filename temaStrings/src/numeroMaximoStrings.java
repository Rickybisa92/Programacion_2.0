//Generar un String con los numeros hasta el maximo

public class numeroMaximoStrings {
    public static void main(String[] args) {

        int numMaximo = 10;

        String resultado = "";

        for (int i = 1; i < numMaximo; i++) {
            resultado += " " + i;
        }
        System.out.println(resultado);
    }
}


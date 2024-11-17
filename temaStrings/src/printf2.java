public class printf2 {
    //Pedir un string al usuario  y imprimirlo girado
    //Ejemplo: liceu --> uecil

    public static void main(String[] args) {
        String str = "liceu";
        System.out.printf("|%-20s|", str);
        System.out.println();
        System.out.printf("|%20s|", str);
    }
}

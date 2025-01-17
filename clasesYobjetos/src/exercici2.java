
//2- Realitza una classe anomenada «Peix», que tingui una variable membre anomenada «nom». Fes
//un mètode «setNom(String nom)» i un mètode «getNom()» (que retorna el nom del peix).
//Implementa un constructor «còpia», que a partir d'un objecte «Peix» generi un nou objecte «Peix».
//Implementa el mètode «public boolean equals(Peix p)» per poder comparar objectes «Peix» i
//comprova que funciona correctament. Finalment, a la classe, implementa una variable «count» que
//compti quants de peixos hem creat.


public class exercici2 {
    public static void main(String[] args) {

        Peix peix1 = new Peix("Dory");
        Peix peix2 = new Peix("Nemo");
        Peix peix3 = new Peix("Dory");

        //Comparamos si los objetos son iguales
        System.out.println("Peix1 es igual que Peix2? "+ peix1.equals(peix2)); // true
        System.out.println("Peix1 es igual que Peix3? " + peix1.equals(peix3)); // false
        System.out.println("Peix2 es igual que Peix3? " + peix2.equals(peix3)); // false

        // Mostramos el número de peixos creados
        System.out.println("Número de peixos creats: " + Peix.count); // 3
    }
}

class Peix {
    String nom;
    static int count = 0;

    // Constructor
    public Peix(String nom) {
        this.nom = nom;
        count++;
    }

    // Constructor de copia
    public Peix(Peix copia) {
        this.nom = copia.getNom();
        count++;
    }

    // Método para establecer el nombre del pez
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Método para obtener el nombre del pez
    public String getNom() {
        return nom;
    }

    public boolean equals(Peix copia) {
        return this.nom.equals(copia.getNom());
    }

}



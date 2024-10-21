import java.util.Scanner;

/*
//Haz un programa que calcule el precio de aparcamiento de un vehiculo
        //se tiene que pedir el tipo de vehiculo (1-moto, 2-coche, 3-camion)
        //cada tipo de vehiculo tiene una tarifa (1,50 moto, 3,20 coche, 5,50 camion)
        //si un vehiculo esta aparcado mas de 5 horas, se aplica una recarga
        // de un 10% = 5 horas la moto, de un 15% = 5h el coche y un (17% = 5h un camion) depende del tipo
        // si esta aparcado mas de 10h se aplica una recarga fija de 30% para todos los vehiculos
 */
public class programaCondiciones2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que tipo de vehiculo tienes (1-moto, 2-coche, 3-camion)?:");
        int vehiculo = scanner.nextInt();

        System.out.println("Cuantas horas lleva aparcado?");
        int horas = scanner.nextInt();

        double tarifa = 0;

        switch (vehiculo) {
            case 1: //Moto
                tarifa = 1.50;
                if (horas > 10 ) {
                    tarifa += tarifa * 0.30;
                } else if (horas > 5) {
                    tarifa += tarifa * 0.10;
                }
                break;
            case 2: //coche
                tarifa = 3.20;
                if (horas > 10) {
                    tarifa += tarifa * 0.30;
                } else if (horas > 5) {
                    tarifa += tarifa * 0.15;
                }
                break;
            case 3: //Camion
                tarifa = 5.50;
                if (horas > 10) {
                    tarifa += tarifa * 0.30;
                } else if (horas > 5) {
                    tarifa += tarifa * 0.17;
                }
                break;
            default:
                System.out.println("Tipo de vehiculo no valido.");
                return;
        }

        tarifa = Math.round(tarifa * 100.0) / 100.0;
        System.out.println("El precio del aparcamiento de su vehiculo es: " + tarifa + "€.");

    }
}

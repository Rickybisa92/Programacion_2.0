import java.util.Scanner;

//Haz un programa que calcule el precio de aparcamiento de un vehiculo
//se tiene que pedir el tipo de vehiculo (1-moto, 2-coche, 3-camion)
//cada tipo de vehiculo tiene una tarifa (1,50 moto, 3,20 coche, 5,50 camion)
//si un vehiculo esta aparcado mas de 5 horas, se aplica una recarga
// de un 10% = 5 horas la moto, de un 15% = 5h el coche y un (17% = 5h un camion) depende del tipo
// si esta aparcado mas de 10h se aplica una recarga fija de 30% para todos los vehiculos

public class exerciciTarife {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que tipo de vehiculo tienes (1-moto, 2-coche, 3-camion)?:");
        int tipoVehiculo = scanner.nextInt();

        System.out.println("Introduce las horas de aparcamiento?");
        int horas = scanner.nextInt();
        System.out.println("Introduce los minutos?");
        int minutos = scanner.nextInt();

        final double TARIFA_MOTO = 1.50; //final delante de una variable, significa que esta variable no puede cambiar
        final double TARIFA_COCHE = 3.20;
        final double TARIFA_CAMION = 5.50;

        double tiempo = (horas * 60 + minutos) / 60d;
        System.out.println(tiempo);

        if (tiempo <= 5) {
            double total = 0;
            switch (tipoVehiculo) {
                case 1:
                    total = tiempo*TARIFA_MOTO;
                    break;
                case 2:
                    total = tiempo*TARIFA_COCHE;
                    break;
                case 3:
                    total = tiempo*TARIFA_CAMION;
                    break;
            }
            System.out.println("Tienes que pagar: " + total + "€");
        } else if (tiempo <= 10) {
            double total = 0;
            switch (tipoVehiculo) {
                case 1:
                    total = tiempo*TARIFA_MOTO;
                    total += total*10/100;
                    break;
                case 2:
                    total = tiempo*TARIFA_COCHE;
                    total += total*15/100;
                    break;
                case 3:
                    total = tiempo*TARIFA_CAMION;
                    total += total*17/100;
                    break;
            }
            System.out.println("Tienes que pagar " + total + "€");

        } else {
            double total = 0;
            switch (tipoVehiculo) {
                case 1:
                    total = tiempo*TARIFA_MOTO;
                    total += total*30/100;
                    break;
                case 2:
                    total = tiempo*TARIFA_COCHE;
                    total += total*30/100;
                    break;
                case 3:
                    total = tiempo*TARIFA_CAMION;
                    total += total*30/100;
                    break;
            }
            System.out.println("Tienes que pagar " + total + "€");
        }

    }
}

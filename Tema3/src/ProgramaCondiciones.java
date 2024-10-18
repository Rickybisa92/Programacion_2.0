import java.util.Scanner;

/*
Queremos hacer un programa que pida dos numeros al usuario (a y b)
y despues pida que operacion quieres realizar
escribiremos 1 para sumar, 2 para restar, 3 para multiplicar y 4 para divir
el programa tiene que hacer la operacion indicada y tiene que mostrar
el resultado
 */
public class ProgramaCondiciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero:");
        int a = scanner.nextInt();

        System.out.println("Escribe otro numero:");
        int b = scanner.nextInt();

        System.out.println("Que operación quieres hacer: 1 sumar, 2 restar, 3 multiplicar, 4 dividir");
         int operacion = scanner.nextInt();

         if (operacion == 1) {
             int suma = a + b;
             System.out.println("La suma es: " + suma);
         } else if (operacion == 2) {
             int resta = a - b;
             System.out.println("La resta es: " + resta);
         } else if (operacion == 3) {
             int multiplicacion = a * b;
             System.out.println("La multiplicacion es: " + multiplicacion);
         } else if (operacion == 4) {
             int dividir = a / b;
             System.out.println("La division es: " + dividir);
         } else {
             System.out.println("No has elegido ningun comando de la pantalla");
         }

         int res = 0;
         switch (operacion) {
             case 1:
                 res = a + b;
                 System.out.println("La suma es: " + res);
                 break;
             case 2:
                 res = a - b;
                 System.out.println("La resta es: " + res);
                 break;
             case 3:
                 res = a * b;
                 System.out.println("La multiplicación es: " + res);
                 break;
             case 4:
                 if ( b == 0 ) {
                     System.out.println("No podemos dividr entre 0");
                 } else {
                     res = a / b;
                     System.out.println("La division es: " + res);
                 }
                 break;
             default:
                 System.out.println("Operación invalida");
         }

         //Haz un programa que calcule el precio de aparcamiento de un vehiculo
        //se tiene que pedir el tipo de vehiculo (1-moto, 2-coche, 3-camion)
        //cada tipo de vehiculo tiene una tarifa (1,50 moto, 3,20 coche, 5,50 camion)
        //si un vehiculo esta aparcado mas de 5 horas, se aplica una recarga
        // de un 10% = 5 horas la moto, de un 15% = 5h el coche y un (17% = 5h un camion) depende del tipo
        // si esta aparcado mas de 10h se aplica una recarga fija de 30% para todos los vehiculos



    }
}

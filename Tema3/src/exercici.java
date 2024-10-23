/*
Tenemos que hacer un programa que pida dos numeros al usuario
y calcule el residuo de la division entre ellos.
no podeis utilizar la operacion %.

num1  num2
37    2

37 - 2 = 35
35 - 2 = 33
33 - 2 = 31
 */

import java.util.Scanner;

public class exercici {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int num1 = scanner.nextInt();
        System.out.println("Introduce otro numero:");
        int num2 = scanner.nextInt();

        if (num2 > num1) {
            //Giramos los numeros de manera que num1 > num2
            int t = num1;
            num1 = num2;
            num2 = t;
        }

        int residuo = num1 - num2;
        while (residuo >= num2) {
            System.out.println(residuo);
            residuo = residuo - num2;
        }
        System.out.println(residuo);

    }
}

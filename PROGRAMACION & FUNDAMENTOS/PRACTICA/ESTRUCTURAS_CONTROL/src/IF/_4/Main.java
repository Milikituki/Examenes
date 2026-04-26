package IF._4;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un año para saber si es bisiesto: ");
        int anio = sc.nextInt();
        if (anio%4 == 0 ){
            System.out.printf("El año %d es bisiesto", anio);
        }else {
            System.out.printf("El año %d NO es bisiesto", anio);
        }
    }
}

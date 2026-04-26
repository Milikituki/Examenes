package IF._3;

import java.util.Scanner;

public class Main  {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();

        boolean multiplo = (num%20==0);
        boolean cien = (num>=-100 && num<=100);

        if (multiplo && cien) {
            System.out.println("El número es múltiplo de 20 y está entre -100 y 100");
        } else if (!multiplo && cien) {
            System.out.println("El número NO es múltiplo de 20 y está entre -100 y 100");
        } else if (!multiplo && !cien) System.out.println("El número NO es múltiplo de 20 y NO está entre -100 y 100");
        else {
            System.out.println("El número es múltiplo de 20 y NO está entre -100 y 100");

        }
    }
}

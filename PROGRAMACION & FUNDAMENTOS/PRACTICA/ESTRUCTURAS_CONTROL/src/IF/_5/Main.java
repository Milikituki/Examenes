package IF._5;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número de 4 dígitos: ");
        int num = sc.nextInt();
        if (num < 1000){
            System.out.println("Debes introducir un número de 4 dígitos");
        }
        if (num/1000 == num%10){
            System.out.println("El número es capicúa");
        } else {
            System.out.println("El número NO es capicúa");
        }
    }
}

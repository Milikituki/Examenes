package IF._1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce un numero: ");
        int num2 = sc.nextInt();
        mayorMenor(num1, num2);
    }
    static void mayorMenor(int num1, int num2) {
        try{
            if (num1 > num2) {
                System.out.println("El primero es mayor que el segundo");
            } else if (num1 < num2) {
                System.out.println("El primero no es mayor que el segundo");
            }
        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("El número no puede estar vacío ni ser una letra/símbolo");
        }

    }
}

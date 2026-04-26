package IF._2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final ArrayList<Integer> numeros = new ArrayList<>();

    static void main() {

        pedirNumeros(3);
        if (numeros.get(0) == numeros.get(1) + numeros.get(2)) {
            System.out.println(numeros.get(0) + " = " + numeros.get(1) + " + " + numeros.get(2));
        } else if (numeros.get(1) == numeros.get(0) + numeros.get(2)) {
            System.out.println(numeros.get(1) + " = " + numeros.get(0) + " + " + numeros.get(2));
        } else if (numeros.get(2) == numeros.get(0) + numeros.get(1)) {
            System.out.println(numeros.get(2) + " = " + numeros.get(0) + " + " + numeros.get(1));
        } else {
            System.out.println("Ninguno es suma de los dos anteriores");
        }

    }

     static void pedirNumeros(int veces) {
        int num;
        for (int i = 0; i < veces; i++) {
            try{
                System.out.println("Introduce un numero: ");
                num = sc.nextInt();
                if (num > 0) {
                    numeros.add(num);
                } else {
                    System.out.println("Debe introducir un número válido");
                    i--;
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un número válido");
                sc.nextLine();
                i--;
            }

        }
    }
}

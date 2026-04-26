package LecturaModificacionVariables;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero: ");
        int numero = sc.nextInt();

        numero+=5;
        System.out.println(numero);
        numero-=3;
        System.out.println(numero);
        numero*=10;
        System.out.println(numero);
        double numeroD = (double) numero/2;
        System.out.println(numeroD);

    }
}

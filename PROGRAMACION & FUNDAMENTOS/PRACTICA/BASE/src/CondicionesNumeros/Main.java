package CondicionesNumeros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un entero entre 0 y 100: ");
        int numero = sc.nextInt();
        boolean par = numero % 2 == 0;
        boolean mayor = numero>50;

        System.out.println("Par: "+par);
        System.out.println("Mayor que 50: "+mayor);
    }
}

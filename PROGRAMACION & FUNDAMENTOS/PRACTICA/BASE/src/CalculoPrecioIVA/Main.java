package CalculoPrecioIVA;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor de la compra (0-500€): ");
        double valor = sc.nextDouble();
        System.out.println("IVA (0-25%): ");
        double iva = sc.nextInt();

        double precioBase = valor/(1+iva/100);
        double ivaAplicado = valor-precioBase;

        System.out.println("Compra: "+precioBase);
        System.out.println("IVA: "+ivaAplicado);
        System.out.println("=====");
        System.out.println(precioBase+ivaAplicado);
    }
}

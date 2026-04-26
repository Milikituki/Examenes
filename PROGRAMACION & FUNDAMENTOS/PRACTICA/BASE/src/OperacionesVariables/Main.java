package OperacionesVariables;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el operando 1: ");
        int a = sc.nextInt();
        System.out.println("Introduce el operando 2: ");
        int b = sc.nextInt();

        System.out.println("Suma: "+(a+b));
        System.out.println("Resta: "+(a-b));
        System.out.println("Multiplicacion: "+(a*b));
        System.out.println("Division entera: "+(a/b));
        System.out.println("Resto: "+(a%b));
        System.out.println("Division real: "+((double)a/b));
        System.out.println("Resto real: "+((double)a%b));
    }
}

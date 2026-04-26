package LecturaNumeros;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número entre 0 y 9: ");
        int num1 = sc.nextInt();
        System.out.println("Escribe un número entre 0 y 9: ");
        int num2 = sc.nextInt();

        boolean parImpar = (num1%2==0) && !(num2%2==0);
        boolean superior = (num1>(num2*2)) && (num1<8);
        boolean iguales = (num1==num2) || (num1-num2)<2;

        System.out.printf("El primero es par y el segundo impar: %b\n" +
                "\n" +
                "El primero es superior al doble del segundo e inferior a 8: %b\n" +
                "\n" +
                "Son iguales o la diferencia entre el primero y el segundo es menor que 2: %b", parImpar, superior, iguales);
    }
}

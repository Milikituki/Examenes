package CadenaCaracteres;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una palabra: ");
        String palabra = sc.nextLine();
        System.out.println("Escribe una palabra: ");
        String palabra2 = sc.nextLine();

        boolean iguales = palabra.equals(palabra2);
        boolean menor =  palabra.compareToIgnoreCase(palabra2) < 0; // si es menor que 0 lo que devuelve, significa que la cadena precede alfabéticamente (es anterior) a la cadena que se compara

        System.out.println("Son iguales: "+iguales);
        System.out.println("La primera es menor que la segunda: "+menor);
        System.out.println("Son distintas: "+!iguales);
    }
}

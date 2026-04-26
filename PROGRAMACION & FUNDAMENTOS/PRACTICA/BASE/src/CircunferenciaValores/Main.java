package CircunferenciaValores;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un radio entero: ");
        int radio = sc.nextInt();

        System.out.println("Longitud circunferencia: "+(2*Math.PI*radio));
        System.out.println("Area del circulo: "+(Math.PI*radio*radio));
    }
}

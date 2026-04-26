package IntroduccionEdad;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Edad: ");
        int edad = sc.nextInt();
        System.out.println("Nivel de estudios: ");
        int estudios = sc.nextInt();
        System.out.println("Ingresos: ");
        int ingresos = sc.nextInt();

        boolean x = (edad>40) && (estudios>=5 && estudios<=8) && (ingresos<15000);
        System.out.println("Más de 40 años, estudios entre 5 y 8 y gana menos de 15.000: "+x);
    }
}

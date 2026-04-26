package LecturaNombre;

import java.util.Scanner;

public class Persona {
    String nombre;
    int edad;

    public void leerDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nombre completo: ");
        nombre = sc.nextLine();
        System.out.println("Escribe tu edad: ");
        edad = sc.nextInt();
        System.out.println("Te llamas "+nombre);
        System.out.println("Tienes "+edad+" años");
    }
}

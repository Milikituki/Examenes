package Carta;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nº bebidas: ");
        int bebidas = sc.nextInt();
        System.out.println("Precio por bebida: ");
        double precioBebida = sc.nextDouble();
        System.out.println("Nº bocadillos: ");
        int bocadillos = sc.nextInt();
        System.out.println("Precio por bocadillo: ");
        double precioBocadillo = sc.nextDouble();
        System.out.println("Nº alumnos: ");
        int alumnos = sc.nextInt();

        double costeBebidas = (bebidas*precioBebida);
        double costeBocadillos = (bocadillos*precioBocadillo);
        double total = (costeBebidas+costeBocadillos);

        System.out.println("ARTICULO      CANTIDAD   PRECIO   COSTE ");
        System.out.println("============= =========  =======  ======");
        System.out.println("Bebida               "+bebidas+"      "+precioBebida+"   "+costeBebidas);
        System.out.println("Bocadillo            "+bocadillos+"      "+precioBocadillo+"  "+costeBocadillos);
        System.out.println("                                  ======");
        System.out.println("TOTAL                              "+total);
        System.out.println("TOTAL POR ALUMNO                    "+total/alumnos);
    }
}

package CartaAmigos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nº BEBIDAS: ");
        int bebida = sc.nextInt();
        System.out.println("Nº BOCADILLOS: ");
        int bocadillo = sc.nextInt();

        double precioBebida = 1.25;
        double precioBocadillo = 2.05;

        double totalBebida = precioBebida*bebida;
        double totalBocadillo = precioBocadillo*bocadillo;
        System.out.println("TOTAL BEBIDAS: "+totalBebida);
        System.out.println("TOTAL BOCADILLOS: "+totalBocadillo);
        System.out.println("TOTAL CONSUMICION: "+(totalBocadillo+totalBebida));
    }
}

package ConversionTiempo;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nº segundos: ");
        int segundos = sc.nextInt();
        int minutos = segundos/60;
        segundos = segundos%60;
        int horas = minutos/60;
        minutos = minutos%60;

        System.out.println("Horas: "+horas);
        System.out.println("Minutos: "+minutos);
        System.out.println("Segundos: "+segundos);

    }
}

package DescomposicionNumero;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Decenas de mil: ");
        String decenasMil = sc.next();
        System.out.println("Unidades de mil: ");
        String unidadesMil = sc.next();
        System.out.println("Centenas: ");
        String centenas = sc.next();
        System.out.println("Decenas: ");
        String decenas = sc.next();
        System.out.println("Unidades: ");
        String unidades = sc.next();
        System.out.println("Numero introducido: "+decenasMil+unidadesMil+centenas+decenas+unidades);

/*        System.out.println("Numero introducido: "+((decenasMil
        *10000)+(unidadesMil*1000)+(centenas*100)+(decenas*10)+unidades));*/
    }
}

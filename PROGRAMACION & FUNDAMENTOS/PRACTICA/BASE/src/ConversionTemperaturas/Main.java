package ConversionTemperaturas;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ºC: ");
        double grados = sc.nextDouble();

        double celsiusF = ((grados*9)/5)+32;
        double celsiusK = grados+273.15;
        System.out.println("Fahrenheit: "+celsiusF);
        System.out.println("Kelvin: "+celsiusK);

        System.out.println("ºF: ");
        double f = sc.nextDouble();

        double fCelsius = (5*(f-32))/9;
        double fKelvin = fCelsius+273.15;
        System.out.println("Celsius: "+fCelsius);
        System.out.println("Kelvin: "+fKelvin);

        System.out.println("ºK: ");
        double kelvin = sc.nextDouble();

        double kelvinC = kelvin-273.15;
        double kelvinF = ((9*(kelvin-273.15))/5)+32;
        System.out.println("Celsius: "+kelvinC);
        System.out.println("Fahrenheit: "+kelvinF);
    }
}

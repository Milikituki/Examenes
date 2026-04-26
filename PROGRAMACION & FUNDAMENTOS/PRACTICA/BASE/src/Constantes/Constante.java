package Constantes;

public class Constante {
    final String NOMBRE = "Miriam Fernandez Argandoña";
    final String DIRECCION = "C/ Llebeig nº 6, 3F";
    final String CPOSTAL = "07470";
    final String LOCALIDAD = "Pollença";
    final String PROVINCIA = "Islas Baleares";
    final String PAIS = "España";

    public void mandarCarta(){
        System.out.println(NOMBRE);
        System.out.println(DIRECCION);
        System.out.println(CPOSTAL+" "+LOCALIDAD);
        System.out.println(PROVINCIA);
        System.out.println(PAIS);
    }
}

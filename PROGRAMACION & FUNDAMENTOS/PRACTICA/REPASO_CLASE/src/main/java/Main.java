import model.Estudiante;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Estudiante[] alumnos = new Estudiante[3];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.printf("[%d] Introduce la nota del examen 1: ", i+1);
            double nota1 = sc.nextDouble();
            System.out.printf("[%d] Introduce la nota del examen 2: ", i+1);
            double nota2 = sc.nextDouble();
            System.out.printf("[%d] Introduce la nota del examen 3: ", i+1);
            double nota3 = sc.nextDouble();
            System.out.printf("[%d] Introduce la nota de prácticas: ", i+1);
            double notaPracticas = sc.nextDouble();
            alumnos[i] = new Estudiante(nota1, nota2, nota3, notaPracticas);
        }
        System.out.println(mediaFinal(alumnos));
    }

    static double mediaFinal(Estudiante[] alumnos) {
        double notaMedia = 0;
        double notaTotal = alumno.getNotaExamen1() + alumno.getNotaExamen2() + alumno.getNotaExamen3() + (alumno.getNotaPracticas() * 0.8);
        for (Estudiante alumno : alumnos) {

            notaMedia = notaTotal / 4;
        return notaMedia;
        }

    }
}

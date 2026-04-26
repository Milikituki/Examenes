import controller.EstudianteController;
import model.Estudiante;

void main() {
    Scanner sc = new Scanner(System.in);
    Estudiante[] alumnos = new Estudiante[3];
    EstudianteController estudiantecontroller = new EstudianteController();
    for (int i = 0; i < alumnos.length; i++) {
        System.out.printf("[%d] Introduce la nota del examen 1: ", i + 1);
        double nota1 = sc.nextDouble();
        System.out.printf("[%d] Introduce la nota del examen 2: ", i + 1);
        double nota2 = sc.nextDouble();
        System.out.printf("[%d] Introduce la nota del examen 3: ", i + 1);
        double nota3 = sc.nextDouble();
        System.out.printf("[%d] Introduce la nota de prácticas: ", i + 1);
        double notaPracticas = sc.nextDouble();
        alumnos[i] = new Estudiante(nota1, nota2, nota3, notaPracticas);
    }
    IO.println();
    IO.println("-- Nota media final de cada estudiante --");
    for (int i = 0; i < alumnos.length; i++) {
        IO.println("Estudiante " + (i + 1) + ": " + estudiantecontroller.notaFinal(alumnos[i]));
        IO.print("Calificación: ");
        estudiantecontroller.calificar(estudiantecontroller.notaFinal(alumnos[i]));
        IO.println();
    }
    int contador = 0;
    for (Estudiante alumno : alumnos) {
        double nota = estudiantecontroller.notaFinal(alumno);
        if (nota >= 5) {
            contador++;
        }
    }
    IO.println("Número de aprobados: " + contador);

    IO.println("La nota más alta de la clase es: " + estudiantecontroller.notaMax(alumnos));
    IO.println("La nota más baja de la clase es: " + estudiantecontroller.notaMin(alumnos));
    IO.println();
    IO.println("Lista de estudiantes NOTABLES: ");
    IO.println(Arrays.toString(estudiantecontroller.notables(alumnos)));

}

package controller;

import model.Estudiante;

public class EstudianteController {

    public double notaFinal(Estudiante estudiante) {

        double notaTotal = estudiante.getNotaExamen1() + estudiante.getNotaExamen2() + estudiante.getNotaExamen3() + (estudiante.getNotaPracticas()*0.8);

        return notaTotal / 4;
    }

    public void calificar(double notaFinal){
        if (notaFinal < 5){
            System.out.println("SS");
        } else if (notaFinal >= 5 && notaFinal <= 6.9){
            System.out.println("AP");
        }else if (notaFinal >= 7 && notaFinal <= 8.9){
            System.out.println("NT");
        }else if (notaFinal >= 9 && notaFinal <= 10){
            System.out.println("SB");
        }
    }

    public double notaMax(Estudiante[] alumnos){
        double max = notaFinal(alumnos[0]);
        for (Estudiante alumno : alumnos) {
            double nota = notaFinal(alumno);
            if (nota > max) {
                max = nota;
            }
        }
        return max;
    }

    public double notaMin(Estudiante[] alumnos){
        double min = notaFinal(alumnos[0]);
        for (Estudiante alumno : alumnos) {
            double nota = notaFinal(alumno);
            if (nota < min) {
                min = nota;
            }
        }
        return min;
    }

    public double[] notables(Estudiante[] alumnos){
        int contador = 0;
        for (Estudiante alumno : alumnos) {
            double nota = notaFinal(alumno);
            if (nota >= 7) {
                contador++;
            }
        }
        int contador2 = 0;
        double[] notables = new double[contador];
        for (Estudiante alumno : alumnos) {
            double nota = notaFinal(alumno);
            if (nota >= 7) {
                notables[contador2] = nota;
                contador2++;
            }
        }
        return notables;
    }
}


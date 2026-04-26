package model;

public class Estudiante {
    private double notaExamen1, notaExamen2, notaExamen3, notaPracticas;

    public double getNotaPracticas() {
        return notaPracticas;
    }
    public void setNotaPracticas(double notaPracticas) {
        this.notaPracticas = notaPracticas;
    }
    public double getNotaExamen3() {
        return notaExamen3;
    }
    public void setNotaExamen3(double notaExamen3) {
        this.notaExamen3 = notaExamen3;
    }
    public double getNotaExamen2() {
        return notaExamen2;
    }
    public void setNotaExamen2(double notaExamen2) {
        this.notaExamen2 = notaExamen2;
    }
    public double getNotaExamen1() {
        return notaExamen1;
    }
    public void setNotaExamen1(double notaExamen1) {
        this.notaExamen1 = notaExamen1;
    }

    public Estudiante(double notaExamen1, double notaExamen2, double notaExamen3, double notaPracticas) {
        this.notaExamen1 = notaExamen1;
        this.notaExamen2 = notaExamen2;
        this.notaExamen3 = notaExamen3;
        this.notaPracticas = notaPracticas;
    }
}

package proyectobasesi;

import java.sql.Date;

public class Pruebas {
    int no_pruebas;
    String nombre;
    int puntuacion;
    Date fecha;
    int horas;
    int calificacion;
    int no_registro;
    int dni;

    public Pruebas(int no_pruebas, String nombre, int puntuacion, Date fecha, int horas, int calificacion, int no_registro, int dni) {
        this.no_pruebas = no_pruebas;
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.fecha = fecha;
        this.horas = horas;
        this.calificacion = calificacion;
        this.no_registro = no_registro;
        this.dni = dni;
    }

    public int getNo_pruebas() {
        return no_pruebas;
    }

    public void setNo_pruebas(int no_pruebas) {
        this.no_pruebas = no_pruebas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getNo_registro() {
        return no_registro;
    }

    public void setNo_registro(int no_registro) {
        this.no_registro = no_registro;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobasesi;

import java.sql.Date;


public class controlador_aereo {
    Date fecha_examen;
    int dni;
    String contraseña;

    public controlador_aereo(Date fecha_examen, int dni, String contraseña) {
        this.fecha_examen = fecha_examen;
        this.dni = dni;
        this.contraseña = contraseña;
    }

    public Date getFecha_examen() {
        return fecha_examen;
    }

    public void setFecha_examen(Date fecha_examen) {
        this.fecha_examen = fecha_examen;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}

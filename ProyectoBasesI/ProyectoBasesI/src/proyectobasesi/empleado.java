/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobasesi;


public class empleado {
    int dni;
    String emp_afiliacion;
    String contraseña;

    public empleado(int dni, String emp_afiliacion, String contraseña) {
        this.dni = dni;
        this.emp_afiliacion = emp_afiliacion;
        this.contraseña = contraseña;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEmp_afiliacion() {
        return emp_afiliacion;
    }

    public void setEmp_afiliacion(String emp_afiliacion) {
        this.emp_afiliacion = emp_afiliacion;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}

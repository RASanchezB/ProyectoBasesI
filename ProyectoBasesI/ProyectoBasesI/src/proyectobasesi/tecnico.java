
package proyectobasesi;

public class tecnico {
    String tec_nombre;
    String tec_direccion;
    int tec_telefono;
    int tec_sueldo;
    int dni;
    String contraseña;

    public tecnico(String tec_nombre, String tec_direccion, int tec_telefono, int tec_sueldo, int dni, String contraseña) {
        this.tec_nombre = tec_nombre;
        this.tec_direccion = tec_direccion;
        this.tec_telefono = tec_telefono;
        this.tec_sueldo = tec_sueldo;
        this.dni = dni;
        this.contraseña = contraseña;
    }

    public String getTec_nombre() {
        return tec_nombre;
    }

    public void setTec_nombre(String tec_nombre) {
        this.tec_nombre = tec_nombre;
    }

    public String getTec_direccion() {
        return tec_direccion;
    }

    public void setTec_direccion(String tec_direccion) {
        this.tec_direccion = tec_direccion;
    }

    public int getTec_telefono() {
        return tec_telefono;
    }

    public void setTec_telefono(int tec_telefono) {
        this.tec_telefono = tec_telefono;
    }

    public int getTec_sueldo() {
        return tec_sueldo;
    }

    public void setTec_sueldo(int tec_sueldo) {
        this.tec_sueldo = tec_sueldo;
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

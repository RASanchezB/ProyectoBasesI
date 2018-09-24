package proyectobasesi;
public class Modelo {
    int Numero;
    int Capacidad;
    int Peso;

    public Modelo() {
    }

    public Modelo(int Numero, int Capacidad, int Peso) {
        this.Numero = Numero;
        this.Capacidad = Capacidad;
        this.Peso = Peso;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return "Modelo{" + "Numero=" + Numero + ", Capacidad=" + Capacidad + ", Peso=" + Peso + '}';
    }
    
}

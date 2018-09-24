package proyectobasesi;
public class Aviones {
    int NumeroRegistro;
    String Modelo;

    public Aviones(int NumeroRegistro, String Modelo) {
        this.NumeroRegistro = NumeroRegistro;
        this.Modelo = Modelo;
    }

    public Aviones() {
    }

    public int getNumeroRegistro() {
        return NumeroRegistro;
    }

    public void setNumeroRegistro(int NumeroRegistro) {
        this.NumeroRegistro = NumeroRegistro;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    @Override
    public String toString() {
        return "Aviones{" + "NumeroRegistro=" + NumeroRegistro + ", Modelo=" + Modelo + '}';
    }
    
}

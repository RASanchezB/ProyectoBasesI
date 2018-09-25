package proyectobasesi;
public class Aviones {
    int NumeroRegistro;
    String Modelo;
    int NumeroModelo;

    public Aviones(int NumeroRegistro, String Modelo, int NumeroModelo) {
        this.NumeroRegistro = NumeroRegistro;
        this.Modelo = Modelo;
        this.NumeroModelo = NumeroModelo;
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

    public int getNumeroModelo() {
        return NumeroModelo;
    }

    public void setNumeroModelo(int NumeroModelo) {
        this.NumeroModelo = NumeroModelo;
    }

   
    
}

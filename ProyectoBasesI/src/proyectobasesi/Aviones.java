package proyectobasesi;
public class Aviones {
    int NumeroRegistro;
    String Modelo;
    int NumeroModelo;

    public Aviones(int NumeroRegistro, int NumeroModelo) {
        this.NumeroRegistro = NumeroRegistro;
        
        this.NumeroModelo = NumeroModelo;
    }

    public int getNumeroRegistro() {
        return NumeroRegistro;
    }

    public void setNumeroRegistro(int NumeroRegistro) {
        this.NumeroRegistro = NumeroRegistro;
    }

   
    public int getNumeroModelo() {
        return NumeroModelo;
    }

    public void setNumeroModelo(int NumeroModelo) {
        this.NumeroModelo = NumeroModelo;
    }

   
    
}

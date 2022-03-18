package ivansolutions.conceptosbasicos.lenovo;

public class procesador {
private String marca;
private float frecuencia;
private String submaraca;

    public procesador(String marca, float frecuencia, String submaraca) {
        this.marca = marca;
        this.frecuencia = frecuencia;
        this.submaraca = submaraca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(float frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getSubmaraca() {
        return submaraca;
    }

    public void setSubmaraca(String submaraca) {
        this.submaraca = submaraca;
    }

    @Override
    public String toString() {
        return "procesador{" + "marca=" + marca + ", frecuencia=" + frecuencia + ", submaraca=" + submaraca + '}';
    }
    
    
}

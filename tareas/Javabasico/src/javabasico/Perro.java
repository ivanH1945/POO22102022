package javabasico;

public class Perro {
    private String raza ;
    private int tamano;
    public final static String cola = "cola";

    public Perro() {
    }

    public Perro(String raza, int tamano) {
        this.raza = raza;
        this.tamano = tamano;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", tamano=" + tamano + '}';
    }
    public void comer()
    {
        System.out.println("El perro de raza"+this.raza);
        System.out.println("esta comiendo...");
    }
    public static void ladrar()
    {
        System.out.println("wof wof wof!!!");
    }
}

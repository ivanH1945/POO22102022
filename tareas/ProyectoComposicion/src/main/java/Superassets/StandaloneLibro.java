
package Superassets;
import assets.*;
public class StandaloneLibro {
    Autor autorActual = new  Autor();
    Editorial editActual = new Editorial();
    private String Nombre;
    private String dedicatoria;

    public StandaloneLibro() {
    }

    public StandaloneLibro(String Nombre, String dedicatoria) {
        this.Nombre = Nombre;
        this.dedicatoria = dedicatoria;
    }

    public Autor getAutorActual() {
        return autorActual;
    }

    public void setAutorActual(Autor autorActual) {
        this.autorActual = autorActual;
    }

    public Editorial getEditActual() {
        return editActual;
    }

    public void setEditActual(Editorial editActual) {
        this.editActual = editActual;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDedicatoria() {
        return dedicatoria;
    }

    public void setDedicatoria(String dedicatoria) {
        this.dedicatoria = dedicatoria;
    }

    @Override
    public String toString() {
        return "StandaloneLibro{" + "autorActual=" + autorActual + ", editActual=" + editActual + ", Nombre=" + Nombre + ", dedicatoria=" + dedicatoria + '}';
    }
    
}

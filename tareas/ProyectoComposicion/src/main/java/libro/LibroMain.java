package libro;
import Superassets.*;
import assets.Autor;
import assets.Editorial;
public class LibroMain {
    
    public static void main(String[] args) {
        StandaloneLibro lib1 = new StandaloneLibro();
        lib1.setNombre("chavelo y pepito contra las momias de hiroshima");
        lib1.setDedicatoria("al ejercito checheno");
        lib1.setAutorActual(new Autor("evodio", "maslow"));
        lib1.setEditActual(new Editorial("blitzkrieg", 1942));
        System.out.println(lib1);
    }
}

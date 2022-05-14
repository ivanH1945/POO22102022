package Assets;

import java.util.ArrayList;

public class Cesar {

    private int codigo;
    private String abc = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789";

    public String EncriptedString = "";

    public Cesar() {
    }

    public void secret(String cadena) {
        String cadena2 = "";
        for (int i = 0; i < cadena.length(); i++) {
            for (int j = 0; j < abc.length(); j++) {
                if (cadena.charAt(i) == abc.charAt(j)) {
                    cadena2 += abc.charAt((j + codigo) %abc.length());

                }
            }
        }
        cadena = cadena2;
        System.out.println("works");

        EncriptedString = cadena;

    }
    public void unsecret(String cadena) {
        String cadena2 = "";
        for (int i = 0; i < cadena.length(); i++) {
            for (int j = 0; j < abc.length(); j++) {
                if (cadena.charAt(i) == abc.charAt(j)) {
                    cadena2 += abc.charAt((j - codigo) % abc.length());

                }
            }
        }
        cadena = cadena2;
        System.out.println("works");

        EncriptedString = cadena;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}

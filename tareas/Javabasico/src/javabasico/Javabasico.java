/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico;

/**
 *
 * @author doomslayer1945
 */
public class Javabasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad= 22;
        Integer edad2 = new Integer(2);
        float x = edad2.floatValue();
        System.out.println(x);
        String dias = "23";
        System.out.println(dias+3);
        int temp = Integer.parseInt(dias);
        System.out.println("Dias="+(temp+3));
        Perro perro1 = new Perro("poodle",1);
        System.out.println(perro1);
        System.out.println(Perro.cola);
        Perro.ladrar();
    }
    
}

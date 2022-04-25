/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author doomslayer1945
 */
public class PruebaEjemplo {
    
       public static void main(String[] args) {
   
            System.out.println("Bienvenido al banco bilbao Vizcaya andaurreta");
            System.out.println("Por favor presiona la accion a realizar");
              Cuentahabiente[] arr = new Cuentahabiente[5];
        arr[0] = new Cuentahabiente(0001, "Juan Topo", 250000);
         arr[1] = new Cuentahabiente(0001, "romina ferrier", 258500);
          arr[2] = new Cuentahabiente(0001, "emperador mijamoto", 2800);
           arr[3] = new Cuentahabiente(0001, "charles manson", 82000);
            arr[4] = new Cuentahabiente(0001, "jose jose ", 1000);
            System.out.println("1: mostrar todos los clientes");
            System.out.println("2:retirar dinero de un cuentahabiente");
            System.out.println("3: salir");
            Scanner sc = new Scanner(System.in);
            int respuesta = sc.nextInt();
           switch (respuesta) {
               case 1:
                   for (Object array : arr) {
                       Cuentahabiente ca = (Cuentahabiente)array;
                       System.out.println(ca);
                   }

                   
                   break;
                   case 2:
                       int cliente;
                       System.out.println("por favor selecciona el cliente del que deseas retirar ");
                        System.out.println(arr[0]);
                   System.out.println(arr[1]);
                   System.out.println(arr[2]);
                   System.out.println(arr[3]);
                   System.out.println(arr[4]);
                   cliente = sc.nextInt();
                       switch (cliente) {
                           case 1:
                               arr[0].retirarDinero();
    
                               break;
                               case 2:
                                   arr[1].retirarDinero();
                               
                               break;
                                  case 3:
                                   arr[2].retirarDinero();
                               
                               break;
                                  case 4:
                                   arr[3].retirarDinero();
                               
                               break;
                                  case 5:
                                   arr[4].retirarDinero();
                               
                               break;
                           default:
                               throw new AssertionError();
                       }
                   break;
                   case 3:
                       System.exit(0);
                   
                   break;
               default:
                   throw new AssertionError();
           }
          
    }
       
 }

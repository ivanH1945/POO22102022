
package banco;

import java.util.Scanner;

/**
 *
 * @author doomslayer1945
 */
public class Cuentahabiente {
  private  int idCliente ;
  private String nombre ;
  private int balance;

    public Cuentahabiente() {
    }

    public Cuentahabiente(int idCliente, String nombre, int balance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Cuentahabiente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", balance=" + balance + "tipo de cliente= "+evaluarClientes()+'}';
    }
  
   public void retirarDinero()
   {
       System.out.println("Dinero en la cuenta: "+balance);
       System.out.println("Ingresa el monto a retirar");
       Scanner sc = new Scanner (System.in);
        int montoASacar = sc.nextInt();
        if(montoASacar <= balance)
        {
            balance= balance-montoASacar;
            
            System.out.println("tu nuevo balance es= " +balance);
        }
        
   }
public String evaluarClientes()
        {
            String mensaje1;
            if(balance <=50000)
            {
                mensaje1 = " Eres cliente Regular";

            
        }   else
            {
             mensaje1= " Eres cliente premium";   
            }
    return mensaje1;
        }
}

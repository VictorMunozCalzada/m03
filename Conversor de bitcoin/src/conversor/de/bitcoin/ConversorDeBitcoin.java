/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversor.de.bitcoin;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class ConversorDeBitcoin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    int opcion, criptomonedas;
    double dinero=0;
    
    
        System.out.println("¿Cuantas criptomonedas tienes?");
        criptomonedas= sc.nextInt();
        
        System.out.println("Menú de conversión");
        System.out.println("1. Bitcoins a euros");
        System.out.println("2. XMR a euros");
        
        System.out.println("¿Que conversor deseas?");
        opcion= sc.nextInt();
        
        if (opcion==1)
        {dinero=criptomonedas*49.561;
        System.out.println("Tus criptomonedas corresponden a "+dinero+" euros ");}
        
        else if(opcion==2)
        {dinero=criptomonedas*233.81;
        System.out.println("Tus criptomonedas corresponden a "+dinero+" euros ");}
        
        else
        {System.out.println("Opción incorrecta");}
        
        
        
         
        
        
        
        
    }
    
}

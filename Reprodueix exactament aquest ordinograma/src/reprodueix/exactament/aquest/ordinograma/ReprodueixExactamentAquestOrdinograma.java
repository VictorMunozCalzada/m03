/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reprodueix.exactament.aquest.ordinograma;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class ReprodueixExactamentAquestOrdinograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    int numero;
    
        System.out.println("Introduce un número");
        numero= sc.nextInt();
        
        if (numero%2==0)
        {   if (numero%3==0)
                {System.out.println("Numero par y divisble entre 3");}
        
            else 
            {System.out.println("Numero par");}
        }    
        else 
        {System.out.println("Numero impar");}
        
        
        
    }
    
}

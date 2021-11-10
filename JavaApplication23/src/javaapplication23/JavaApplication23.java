/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication23;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class JavaApplication23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    int numero, acumulandoSuma=0;
    
    boolean finalBucle=false;
    
        do
        {System.out.println("Escribe un número");
        numero= sc.nextInt(); 
        if (numero>0)
        {acumulandoSuma= numero+acumulandoSuma;}
        
        else 
        {System.out.println("No sumo numeros negativos");
        }    
            
            System.out.println("-"+acumulandoSuma);
        
        if (acumulandoSuma>=100)
        { finalBucle= true;
        }
        
        
    }while(!finalBucle);
        
        System.out.println("Total suma "+acumulandoSuma);       
    
        
        
        
        
    }
    
}

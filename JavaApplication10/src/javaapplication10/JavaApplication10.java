/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,y;
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Introduce el primer número");
        x= teclado.nextInt();
        
        System.out.println("Introduce el segundo número");
        y= teclado.nextInt();
                
        
        if (x>y)
        {System.out.println("El mayor es "+x);}    
        
        else 
        {System.out.println("El mayor es "+y);}    
        
        
    }
    
}

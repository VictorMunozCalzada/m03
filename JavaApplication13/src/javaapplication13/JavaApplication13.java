/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication13;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        
        int x,y,z;
        
        System.out.println("Introduce el primer número");
        x= teclado.nextInt();
        
        System.out.println("Introduce el segundo número");
        y= teclado.nextInt();
        
        System.out.println("Introduce el tercer número");
        z= teclado.nextInt();
                
        
        if ((x>y) && (x>z))
        {System.out.println("El mayor es "+x);}
        
        else if ((y>x) && (y>z))
        {System.out.println("El mayor es "+y);}
        
        else 
        {System.out.println("El mayor es "+z);}    
        
    }
    
}

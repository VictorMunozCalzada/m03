/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication14;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double nota;
        
        System.out.println("Introduce un numero del 0 al 10");
        nota= sc.nextInt();
        
        if ((nota<3) && (nota>=0))
            {System.out.println("Muy deficiente");}
        
        else if ((nota<5) && (nota>=3))
            {System.out.println("Insuficiente");}
        
        else if ((nota<6) && (nota>=5))
            {System.out.println("Bien");}
        
        else if ((nota<9) && (nota>=6))
            {System.out.println("Notable");}
        
        else if ((nota<=10) && (nota>=9))
            {System.out.println("Sobresaliente");}
        
        else 
        {System.out.println("La nota debe ser entre 0 y 10");}
        
    }
    
}

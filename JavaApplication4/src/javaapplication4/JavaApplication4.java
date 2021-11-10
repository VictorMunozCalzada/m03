/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       final int MILLA_METRO=1852;
       
       int edad;
       
       Scanner teclado= new Scanner(System.in);
       System.out.println("Introduce tu edad");
       edad= teclado.nextInt();
       
       if (edad>=18)
       {System.out.println("Eres mayor de edad");}
       
       else
       {System.out.println("Eres menor de edad");}   
      
    }
    
}

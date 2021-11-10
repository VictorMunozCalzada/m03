/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication36;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class JavaApplication36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Random r = new Random();
     Scanner sc = new Scanner(System.in);
     
     int numAleatorio=r.nextInt(50)+1, prueba;
    
     
        
     do 
     {System.out.println("Adivina mi numero (1-50)");
     prueba= sc.nextInt();
        if (prueba<numAleatorio)
        {System.out.println("Es mayor");}
        else if (prueba>numAleatorio)
        {System.out.println("Es menor");}
      
     }while (prueba!=numAleatorio); 
             
    
     System.out.println("Adivinado!!!");
    
     
    }
    
}

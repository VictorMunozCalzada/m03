/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication30;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class JavaApplication30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    int cont, numero;
    boolean negativo=false;
    

    for (cont=1; cont<=10; cont++ )
    {System.out.println("Introduce un número");
    numero= sc.nextInt();
        if (numero<0)
        {negativo=true;}
    }
       
    if (negativo==true)
    {System.out.println("Has puesto un negativo");}
    
    else 
    {System.out.println("No hay negativos");}
    
    
    
    }
    
}

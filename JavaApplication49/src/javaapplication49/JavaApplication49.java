/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication49;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class JavaApplication49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero, Signo;
        System.out.println("Introduce un numero");
        numero= sc.nextInt();
        Signo= dimeSigno(numero);
        
     if (Signo==0) 
     {System.out.println("Es igual a 0");}
     else if (Signo==1) 
     {System.out.println("Es positivo");}
     else 
     {System.out.println("Es negativo");}
        
    }

    private static int dimeSigno(int numero) {
    if(numero==0)
    {return 0;}
    
    else if (numero>0)
    {return 1;}    
     
    else 
    {return -1;}    
        
    }
    
}

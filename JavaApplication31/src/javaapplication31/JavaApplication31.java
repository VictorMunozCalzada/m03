/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication31;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class JavaApplication31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    int numero=0, positivo=0, negativo=0;
    boolean existeNegativo=false;
    
    do
    {System.out.println("Introduce un número, 0 para acabar");
    numero= sc.nextInt();
        if (numero>0)
        {positivo=positivo+1;}
        else if(numero<0)
        {negativo=negativo+1;}
    }
    while (numero!=0);
    
    if (negativo>0)
    {System.out.println("Has puesto un negativo");}
    
        System.out.println("Has puesto "+positivo+" positivos");
        System.out.println("Has puesto "+negativo+" negativos");
    
    }
    
}

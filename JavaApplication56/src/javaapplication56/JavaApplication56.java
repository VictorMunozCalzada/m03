/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication56;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class JavaApplication56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int numero;
    boolean primo;
    do{    System.out.println("Introduce un numero:");
        numero=sc.nextInt();
        if (numero!=0)
        {primo=comprobarPrimo(numero);
    if(primo==false)
    {System.out.println("No es primo");}
    else
    {System.out.println("Es primo");}}
        
    
    }while(numero!=0);
    }

    private static boolean comprobarPrimo(int num) {
    int cont, residuo=0;
    boolean primo=true;
        for(cont=2;cont<num;cont++)
        {residuo = num%cont;
            if (residuo==0)
            {primo=false;}}

    return primo=true;
        

    }
    
}

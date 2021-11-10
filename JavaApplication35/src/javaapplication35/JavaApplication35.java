/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication35;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int numero=0, minimo=0, maximo=100;
    char respuesta;
    boolean correcto=false;
        System.out.println("Piensa un número del 0 al 100");
    do
    {numero=(minimo+maximo)/2;
     System.out.println("¿Tu numero es mayor(m), menor(f) o igual(i) a "+numero+"?");
     respuesta=sc.nextLine().charAt(0); 
     if (respuesta== 'm' || respuesta=='M')
     { minimo=numero;
     }
     else if (respuesta== 'f' || respuesta=='F')         
     { maximo=numero;
     } 
     else
     {correcto=true;} 
    }
     while (correcto!=true);
        System.out.println("ADIVINADO!!");
    
    
    
    
    
    }
    
    
    
    
    
    
}

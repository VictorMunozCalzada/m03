/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication53;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class JavaApplication53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int valor1, valor2, valor3, mayor;
    
    System.out.println("Introduce el valor1");
    valor1= sc.nextInt();
    System.out.println("Introduce el valor2");
    valor2= sc.nextInt();
    System.out.println("Introduce el valor3");
    valor3= sc.nextInt();
    
    mayor=comprobarMayor(valor1, valor2);
    
    mayor=comprobarMayor(mayor, valor3);
    
    System.out.println("El mayor es "+mayor);
    
    }

    public static int comprobarMayor(int num1,int num2) {
    if (num1>=num2) 
    {return num1;}
    else 
    {return num2;}
    }
    
}

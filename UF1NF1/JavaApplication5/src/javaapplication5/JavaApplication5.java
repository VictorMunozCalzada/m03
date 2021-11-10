/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double lado, area;
        Scanner teclado=new Scanner(System.in);
        // sirve para recoger datos por teclado 
        System.out.println("Introduce el valor del lado del cuadrado");
        lado=teclado.nextDouble();
        area= lado*lado;
        System.out.println("El lado del cuadrado es "+area);
        System.out.println("El area del cuadrado es "+area);
        
                
        
        
    }
    
}

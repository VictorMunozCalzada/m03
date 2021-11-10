/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication42;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class JavaApplication42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int valor1=0, valor2=0, mayor;
    System.out.println("Pon un valor ");
        valor1= sc.nextInt();
    System.out.println("Pon otro valor ");
        valor2= sc.nextInt();
    mayor=numeroMasGrande(valor1, valor2);
       
    System.out.println("El mayor es "+mayor);
}
    public static int numeroMasGrande(int valor1, int valor2)
    {  int mayor = 0;
        if (valor1>=valor2)
        { mayor=valor1;}
        else if (valor2>valor1)
        { mayor=valor2;}
    return mayor;
    }
    
    
}

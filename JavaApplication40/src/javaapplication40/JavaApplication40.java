/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication40;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class JavaApplication40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String nombre= "Victor Muñoz";
    helloWorldNombre(nombre);
    int valor=5;
    System.out.println("Valor no clonado "+valor);
    aumentaEnDos(valor); 
    System.out.println("Valor no clonado despues "+valor);
    }
    
    /**
     *
     * @param nom // es la variable que contiene el nombre
     */
    public static void helloWorldNombre(String nom)
    {System.out.println(nom);}
    
//Aumenta el valor en dos
    private static void aumentaEnDos(int valor) {
    valor= valor+2;
        System.out.println("Valor clonado "+valor);
    }
    
    
    
    
    
    
}


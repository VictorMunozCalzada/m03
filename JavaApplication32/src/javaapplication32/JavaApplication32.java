/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication32;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class JavaApplication32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int numero=1,suma=0, producto=1;
    
    while (numero<=10)
    {suma=suma+numero;
    producto= producto*numero;
    numero=numero+1;
    }
    
    
    
        System.out.println("La suma total es "+suma);
        System.out.println("El producto total es "+producto);
    
    
    }
    
}

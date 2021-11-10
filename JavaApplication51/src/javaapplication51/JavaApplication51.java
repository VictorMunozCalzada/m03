/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication51;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class JavaApplication51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double precio, precioFinal, cont=0;
    do{    
    System.out.println("Introduce un precio");
    precio= sc.nextInt();
    precioFinal=precioConIva(precio);
    System.out.println("Precio con Iva "+precioFinal);
    cont++;
    } while (cont!=5);    
        

    
    }

    private static double precioConIva(double precio) {
    return precio+precio*0.21;    
    }

   
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in); 
        
        int n1;
        int n2;
        int suma;
        int resta;
        int producto;
        double división;       
        
        System.out.println("Introduce el primer numero");
        n1=teclado.nextInt();
        
        System.out.println("Introduce el segundo numero");
        n2=teclado.nextInt();
        
        suma=n1+n2;
        resta=n1-n2;
        producto=n1*n2;
        división=(double)n1/n2;
        
        System.out.println("Suma " +suma);
        System.out.println("Resta " +resta);
        System.out.println("Producto "+ producto);        
        System.out.println("División "+ división);        
        
       
             
                
    }
    
}

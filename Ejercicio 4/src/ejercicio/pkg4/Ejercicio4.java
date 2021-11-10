/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado=new Scanner(System.in);
        
        double radio, pi, longitud, area, volumen;
        
        System.out.println("Introduce el radio del circulo ");
        radio=teclado.nextDouble();
        
        pi=3.1416;
        longitud= 2*pi*radio;
        area= pi*radio*radio;
        volumen=(4/3)*pi*radio*radio*radio;
                
        System.out.println("Longitud "+longitud);    
        System.out.println("Area "+area);
        System.out.println("Volumen "+volumen);        
        
        
                
       
        
               
        
                
       
    }
    
}

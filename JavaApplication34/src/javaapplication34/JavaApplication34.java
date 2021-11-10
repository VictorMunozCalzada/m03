/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication34;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class JavaApplication34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cont=1, valorA, valorB=0,potencia=1; 
    
        System.out.println("Introduce el primer numero");
        valorA= sc.nextInt();
        
        System.out.println("Introduce el segundo numero");
        valorB= sc.nextInt();
        
        while (cont<=valorB)
        {potencia=potencia*valorA;
        cont=cont+1;} 
       
        
        System.out.println("La potencia es "+potencia);
    }
    
}

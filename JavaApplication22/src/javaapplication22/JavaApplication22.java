/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication22;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int cont, mult, tabla;
        
    System.out.println("¿De que numero quieres la tabla?");
    tabla= sc.nextInt();
     
    for (cont=1; cont<=10; cont++)    
    {   mult= tabla*cont;
    
    System.out.println(+tabla+" x "+cont+" = "+mult);
    
    }
    
     
    
    
    
    }
    
}

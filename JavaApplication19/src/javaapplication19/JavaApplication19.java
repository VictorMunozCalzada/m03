/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication19;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    int opcion;
        
    System.out.println("1.Jugar nueva partida");  
    System.out.println("2.Cargar partida");  
    System.out.println("3.Ver records");    
    System.out.println("4.Salir");    
     
    System.out.println("Escoge una opción");    
    opcion= sc.nextInt();
    
    switch (opcion){
        case 1:
            
            System.out.println("Has escogido:Jugar nueva partida");
            break;        
        case 2:
            
            System.out.println("Has escogido:Cargar partida");
            break;    
        case 3:
            
            System.out.println("Has escogido:Ver records");
            break;    
        case 4:
            
            System.out.println("Has escogido:Salir");
            break;  
        
        default:
            
            System.out.println("Opción incorrecta");
            break; 
    }        
        
        
    }
    
}

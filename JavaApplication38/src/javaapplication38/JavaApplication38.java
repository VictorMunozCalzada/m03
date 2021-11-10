/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication38;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author alumne
 */
public class JavaApplication38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    Random r = new Random();
    
    int linea=0, opcion, petardo1=r.nextInt(20), petardo2=r.nextInt(20), petardo3=r.nextInt(20);
    
    System.out.println("Elige petardo");
    opcion=sc.nextInt();
    
   while (linea<petardo1 || linea<petardo2 || linea<petardo3)
       { if (linea<petardo1)
       {System.out.println("*");
       linea++;}
       else if (linea<petardo2)
       {System.out.println("    *");
       linea++;}
       else if (linea<petardo3)
       {System.out.println("        *");
       linea++;}
       
       } 
 
    if (opcion==1 && petardo1>=petardo2 && petardo1>=petardo3)
    {System.out.println("Has ganado");}
    
    else if (opcion==2 && petardo2>=petardo1 && petardo2>=petardo3)
    {System.out.println("Has ganado");}
    
    else if (opcion==3 && petardo3>=petardo1 && petardo3>=petardo2)
    {System.out.println("Has ganado");}
    
    else 
    {System.out.println("Has perdido");}
    
        System.out.println("petardo 1: "+petardo1);
        System.out.println("petardo 2: "+petardo2);
        System.out.println("petardo 3: "+petardo3);
        
   
        
        
        
        
    }
    
}

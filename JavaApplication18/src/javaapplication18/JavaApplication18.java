/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    int sueldo, sueldoFuturo,incremento;
    sueldoFuturo=0;
        System.out.println("Cual es tu sueldo actual");
        sueldo= sc.nextInt();
        
    if (sueldo<1800)
    {incremento= sueldo*18/100;    
     sueldoFuturo= sueldo+incremento;
        System.out.println("El aumento es de un 18%");
    
    }
    
    else if ((sueldo>=18000) && (sueldo<30000))
    {incremento= sueldo*10/100;    
     sueldoFuturo= sueldo+incremento;
        System.out.println("El aumento es de un 10%");
        }       
     
    else if ((sueldo>=30000) && (sueldo<45000))
    {incremento= sueldo*8/100;    
     sueldoFuturo= sueldo+incremento;
        System.out.println("El aumento es de un 8%");
     }   
            
    else if (sueldo>=45000)
    {incremento= sueldo*6/100;    
     sueldoFuturo= sueldo+incremento;
        System.out.println("El aumento es de un 6%");
       }         
            
            
    
    System.out.println("El sueldo el próximo año será "+sueldoFuturo);
    
    
    
  }   
}

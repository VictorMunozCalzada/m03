/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication15;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       
       int hora, minuto, segundo;
               
        System.out.println("Introduce la hora");
        hora= sc.nextInt();
       
        System.out.println("Introduce los minutos");
        minuto= sc.nextInt();        
       
        System.out.println("Introduce los segundos");
        segundo= sc.nextInt();
        
        segundo= segundo+1;
        if (segundo == 60)
        { segundo=00;
          minuto=minuto+1;
            if (minuto== 60 )
            {minuto=00;
            hora=hora+1;
                if (hora==25)
                {hora=00;}
                else
                {System.out.println("El resultado es "+hora+" horas "+minuto+" minutos "+segundo+" segundos" );}    
            }
            else 
            {System.out.println("El resultado es "+hora+" horas "+minuto+" minutos "+segundo+" segundos" );}
        
        
        
        }
        else 
        {System.out.println("El resultado es "+hora+" horas "+minuto+" minutos "+segundo+" segundos" );}
    }
    
}

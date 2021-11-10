/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication54;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class JavaApplication54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int dia, mes, año;
    
    System.out.println("Introduce el dia");
    dia= sc.nextInt();
    System.out.println("Introduce el mes");
    mes= sc.nextInt();
    System.out.println("Introduce el año");
    año= sc.nextInt();
    
    boolean fecha; 
            
    fecha = fechaValida(dia,mes,año);
    if (fecha==true)
    {System.out.println("Correcto");}
    else
    {System.out.println("Incorrecto");}
    }

    private static boolean fechaValida(int dia, int mes, int año) {
    boolean correcto=true;
        if (dia>1 || dia>30)
        {correcto=false;}  
        else if (mes>1 || mes>12)
        {correcto=false;}     
        else if (año<1900)        
        {correcto=false;} 
    return correcto;}
    
}

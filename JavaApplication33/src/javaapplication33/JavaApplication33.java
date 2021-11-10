/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication33;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class JavaApplication33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int nota, totalNota=0, notaMedia=0, notaAcumulador=0;
    boolean hay10= false;  
    
    do 
    {System.out.println("Introduce una nota del 0 al 10");
    nota= sc.nextInt();
        if (nota==10)
        {hay10=true;}
        if (nota!=-1)
        {totalNota=totalNota+1;
        notaAcumulador=nota+1;
        notaMedia= nota+nota;
    }
    }
    while (nota!=-1);
    
    if (hay10==true)
    {
     System.out.println("Si hay un 10");
    }
    
    notaMedia=notaMedia/notaAcumulador;
            
    System.out.println("Has puesto " +nota+" notas");
    System.out.println("Nota media es: "+notaMedia);
    
    
    }
    
}

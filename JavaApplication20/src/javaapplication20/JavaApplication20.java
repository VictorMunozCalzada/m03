/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication20;

/**
 *
 * @author alumne
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    int cont;
    
    //for 
    for (cont=0; cont<6; cont++)
    {System.out.println("numero "+cont);
    }
    
    // while
    
    cont=0;
    while(cont<=5)
    {System.out.println("(while)numero "+cont);
    cont=cont+1;}   

    // do while 
    
    cont=0;
    do{System.out.println("(do)numero "+cont);
    cont++;
    }
    while(cont<6);


    
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication37;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class JavaApplication37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
    Scanner sc= new Scanner(System.in);
    
    int nivelLeñador, nivelTorre, ataqueLeñador=0, vidaTorre=1, cont=0, ataqueTorre=0, vidaLeñador=0;
    
        System.out.println("Introduce el nivel del leñador");
        nivelLeñador= sc.nextInt();
        
        if (nivelLeñador==9)
        {ataqueLeñador=200;
        vidaLeñador=1060;}
        else if (nivelLeñador==10)
        {ataqueLeñador=220;
        vidaLeñador=1116;}
        else if (nivelLeñador==11)
        {ataqueLeñador=242;
        vidaLeñador=1282;}
        else if (nivelLeñador==12)
        {ataqueLeñador=266;
        vidaLeñador=1409;}
        else if (nivelLeñador==13)
        {ataqueLeñador=292;
        vidaLeñador=1547;}
        
        
        System.out.println("Introduce el nivel de la torre");
        nivelTorre= sc.nextInt();
        
        if (nivelTorre==9)
        {vidaTorre=2534;
        ataqueTorre=180;}
        else if (nivelTorre==10)
        {vidaTorre=2786;
        ataqueTorre=198;}
        else if (nivelTorre==11)
        {vidaTorre=3052;
        ataqueTorre=218;}
        else if (nivelTorre==12)
        {vidaTorre=3346;
        ataqueTorre=238;}
        else if (nivelTorre==13)
        {vidaTorre=3668;
        ataqueTorre=262;}
        
        while (vidaTorre>0 && vidaLeñador>0)
        {vidaTorre=vidaTorre-ataqueLeñador;
           System.out.println("Leñador atacó con fuerza "+ataqueLeñador);
           System.out.println("A la torre le queda de vida "+vidaTorre);
     
        vidaLeñador=vidaLeñador-ataqueTorre;
        System.out.println("Torre atacó con fuerza "+ataqueTorre);
           System.out.println("Al leñador le queda de vida "+vidaLeñador);     
        Thread.sleep(500);
        }        
    
        if (vidaTorre<=0)
        {System.out.println("Ha ganado el leñador. Le queda de vida: "+vidaLeñador);}
        else
        {System.out.println("Ha ganado la torre. Le queda de vida: "+vidaTorre);}
        
        
        
        
        
    }
    
}

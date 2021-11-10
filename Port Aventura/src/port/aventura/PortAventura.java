/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package port.aventura;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class PortAventura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    double entradas, menores, adultos, precioTotal;
    final int precioEntradaAdulto=20, precioEntradaMenor=10;
    
        System.out.println("¿Cuantas entradas deseas?");
        entradas= sc.nextDouble();
    
        System.out.println("¿Cuantos menores hay?");
        menores= sc.nextDouble();
    
     adultos= entradas-menores;  
     
    if (entradas>=10)    
    {   if (entradas>=25)
        {adultos= adultos*precioEntradaAdulto;
        menores= menores*precioEntradaMenor;
        precioTotal= adultos+menores;
        precioTotal=precioTotal-precioEntradaAdulto;
        precioTotal=precioTotal*75/100;
        }
    
        else 
        {adultos= adultos*precioEntradaAdulto;
        menores= menores*precioEntradaMenor;
        precioTotal= adultos+menores;
        precioTotal=precioTotal*75/100;
        }}
    
    else 
        
    {adultos= adultos*precioEntradaAdulto;
    menores= menores*precioEntradaMenor;
    precioTotal= adultos+menores;
    }
        
    System.out.println("Precio total: "+precioTotal+" euros");    
    
    }
    
}

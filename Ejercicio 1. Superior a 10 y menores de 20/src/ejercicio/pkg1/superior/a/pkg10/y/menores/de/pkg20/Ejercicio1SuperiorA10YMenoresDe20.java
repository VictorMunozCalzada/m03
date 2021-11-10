/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1.superior.a.pkg10.y.menores.de.pkg20;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio1SuperiorA10YMenoresDe20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero, contNumero=0, numero20=0,suma=0;
            
    do
    {System.out.println("Introduce un numero");
    numero=sc.nextInt();
        
        if(numero>=10 && numero<=20)
        {numero20++;
        suma=suma+numero;}
        
    contNumero++;
    
    }while(numero20!=3);  
    
        System.out.println("Has puesto "+contNumero+" numeros en total");
        System.out.println("La suma de los tres numeros es "+suma);
    
    
    
    
    
    
    }
    
}

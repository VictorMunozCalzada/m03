/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package superficie.total.casa;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class SuperficieTotalCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int hab, casa=0;
    char masHab;
    
    System.out.println("¿Cuanto mide cada habitacion de tu casa?");
    
    do
    {System.out.print("Metros cuadrados habitación: ");
    hab=sc.nextInt();
    sc.nextLine();
    casa=casa+hab;
    System.out.print("Hay más habitaciones (s/n): ");
    masHab=sc.nextLine().charAt(0); 
    } while (masHab!='n'&& masHab!='N');
    
    System.out.println("Tu casa mide "+casa+" metros cuadrados ");
        
        
        
        
    }
    
}

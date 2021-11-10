/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recoger.letra;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class RecogerLetra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in); 
        System.out.println("¿Eres mayor de edad(s/n)?");
        
        char mayorEdad;
        // recoge la frase que pongas pero devuelve la letra que está en la primera posición
        mayorEdad=teclado.nextLine().charAt(0);
        
        if (mayorEdad=='n'||mayorEdad=='N')
        {
        System.out.println("Enano");
          }
        //OR ||
        //AND &&
        else if (mayorEdad=='s'||mayorEdad=='S')
        {      
        System.out.println("Ya puedes ir preso");  
         }  
        else 
            System.out.println("Opción incorrecta");
  }
  
}

        
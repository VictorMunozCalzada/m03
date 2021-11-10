/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication43;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class JavaApplication43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int valor1,valor2;
        double resultado=0; //operacion 
        int opcion;
        System.out.println("Valor 1");
        valor1 = introducirPositivo(sc);
        System.out.println("Valor 2");
        valor2 = introducirPositivo(sc);
        System.out.println("3.- Calcular producto");
        System.out.println("4.- Calcular division");
        
        opcion = validarOpcion();
        
        if (opcion==3)
        {resultado=multiplicacion(valor1, valor2);}
        else if (opcion==4) 
        {resultado=division(valor1, valor2);}    
        
        
        System.out.println("El resultado de la operación elegida es " + resultado);
    }

    public static int multiplicacion(int valor1, int valor2) 
    { int mult=valor1*valor2;
    return mult;
    }

    public static double division(int valor1, int valor2) 
    { double div= (double)valor1/valor2;
    return div;      
    }

    public static int validarOpcion() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do
        { System.out.print("Pon opcion del 1 al 4 ");
         opcion= sc.nextInt();
       
        }while(opcion<1 || opcion>4); 
        return opcion;
    }

    public static int introducirPositivo(Scanner sc) {
      int opcion;
      do
      {System.out.println("Introduce un numero positivo");
      opcion= sc.nextInt();
      } while(opcion<1);
     return opcion;
    }
    
    
    
    
    
}

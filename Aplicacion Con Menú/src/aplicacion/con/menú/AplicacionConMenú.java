/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacion.con.menú;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class AplicacionConMenú {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion, num, num1, num2;
    
        System.out.println("******Menu******");
        System.out.println("0 Salir");
        System.out.println("1 Escribir 10 veces");
        System.out.println("2 Cuenta atrás timbre");
        System.out.println("3 Numeros pares entre 2 valores");
        System.out.print("Elije tu opción: ");
        opcion=sc.nextInt();
    
        if (opcion==0)
        {System.out.println("Fin Programa");}  
        
        else if (opcion==1)
        {   for (num=1; num<=10; num++)
            {System.out.println(+num+" A clase se viene a trabajar");
            }
        }
        else if (opcion==2)
        {   for (num=10; num>0; num=num-1)
            {System.out.print(" "+num);}
            System.out.print(" RIIIIIIING ");
        }
        else if (opcion==3)
        { System.out.print("Escribe el primer numero: ");
          num1=sc.nextInt();
          System.out.print("Escribe el segundo numero: ");
          num2=sc.nextInt();
            if (num1>num2)
            {   for(num=num2+1; num!=num1; num++)
                {   if(num%2==0)
                    {System.out.println(+num);}
                }
            }    
            else if (num2>num1)
            {   for(num=num1+1; num!=num2; num++)
                {   if(num%2==0)
                    {System.out.println(+num);}
                }
            }   
        }
        else 
        {System.out.println("Opcion no valida");}
        
        
        
        
        
        
    }
    
}

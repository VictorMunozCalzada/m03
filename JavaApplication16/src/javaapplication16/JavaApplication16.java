/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication16;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int horas, tarifa, horasExtra, salarioNormal; 
        double tarifaExtra,salarioExtra,salario, salarioBruto, salarioNeto;
        
        System.out.println("¿Cuantas horas trabajadas?");
        horas= sc.nextInt();
        System.out.println("¿Precio por hora normal?");
        tarifa= sc.nextInt(); 
        if (horas>35)
        {
        horasExtra=horas-35;
        tarifaExtra=tarifa*1.5;
        salarioExtra=horasExtra*tarifaExtra;
        salarioNormal= (horas-horasExtra)*tarifa;
        salario=salarioNormal+salarioExtra;
            if (salario>500)
            {salarioBruto=salario-500;
            salarioNeto= salarioBruto*75/100;
            salario=salarioNeto+500;
            System.out.println("El salario es de "+salario+ " euros");}
            else 
            {System.out.println("El salario es de "+salario+ " euros"); } 
            }
            
        else 
        {salario= horas*tarifa;   
            if (salario>500)
            {salarioBruto=salario-500;
            salarioNeto= salarioBruto*75/100;
            salario=salarioNeto+500;
            System.out.println("El salario es de "+salario+ " euros");}
            else 
            {System.out.println("El salario es de "+salario+ " euros");}    
        }
            
        
        
                
                
       
    }
    
}

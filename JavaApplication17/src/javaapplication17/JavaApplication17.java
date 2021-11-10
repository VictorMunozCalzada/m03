/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication17;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    int copas;
    char cartaElegida;
    
    System.out.println("¿Cuantas copas tienes?");
    copas= sc.nextInt();
    
    sc.nextLine();
            
    if (copas<3000)
    {        
        if (copas<2000)
        {System.out.println("Que carta deseas, mago Electrico(m), o esbirro(e)");
        cartaElegida= sc.nextLine().charAt(0);
    
    
            if ((cartaElegida=='m')||(cartaElegida=='M')) 
            {System.out.println("Has escogido mago Electrico");}
            
            else if ((cartaElegida=='e')||(cartaElegida=='E')) 
            {System.out.println("Has escogido esbirro");}}
    
    
        else if (copas>=2000)
        {System.out.println("Que carta deseas, cavallero(c), o bandida(b)");
        cartaElegida= sc.nextLine().charAt(0);
    
    
            if ((cartaElegida=='c')||(cartaElegida=='C')) 
            {System.out.println("Has escogido cavallero");}
            
            else if ((cartaElegida=='b')||(cartaElegida=='B')) 
            {System.out.println("Has escogido bandida");}}}
        
    else if (copas>=3000)
    {{System.out.println("Que carta deseas, ejercito Esqueletos(e), o gigante(g)");
        cartaElegida= sc.nextLine().charAt(0);
    
    
            if ((cartaElegida=='e')||(cartaElegida=='E')) 
        {System.out.println("Has escogido ejercito Esqueletos");}
            
            else if ((cartaElegida=='g')||(cartaElegida=='G')) 
        {System.out.println("Has escogido gigante");}}
    
    }
        
        
        
    }
    
}

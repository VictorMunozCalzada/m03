/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicas.variables;

/**
 *
 * @author alumne
 */
public class PracticasVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // tipodata( int, float..) nombre inventado=valor
        int numero;
        double numeroConDecimales=6.5;
        boolean cierto_falso = true;
        
        numero=20;
               
        double x=9.25;
        int doble; 
        // calculador doble variable numero
        
        doble= numero*2;
        cierto_falso= (numeroConDecimales !=x);
                
        System.out.println("numero " + numero);
        System.out.println("Su doble es" +doble);
        System.out.println("decimales" + numeroConDecimales);
        System.out.println("el booleano vale" +cierto_falso);
        
    }
    
}

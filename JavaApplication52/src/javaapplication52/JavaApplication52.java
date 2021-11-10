/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication52;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class JavaApplication52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double ancho, alto, area, perimetro;
        System.out.println("Introduce el ancho");
        ancho=sc.nextInt();
        System.out.println("Introduce el alto");
        alto=sc.nextInt();
        
    area=areaRectangulo(ancho, alto);
    perimetro= perimetroRectangulo(ancho, alto);
    
        System.out.println("El area es "+area);
        System.out.println("El perimetro es "+perimetro);
    }

    private static double areaRectangulo(double ancho, double alto) {
    return ancho*alto;    
    }

    private static double perimetroRectangulo(double ancho, double alto) {
    return (ancho+ancho)+(alto+alto);  
    }
    
}

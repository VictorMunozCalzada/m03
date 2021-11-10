/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner teclado= new Scanner(System.in);
    
    int precio_artículo, precio_venta;
    double descuento, descuento_porcentaje;
    
    System.out.println("Introduce el precio del artículo");
    precio_artículo= teclado.nextInt();
    
    System.out.println("Introduce el precio de venta");
    precio_venta= teclado.nextInt();
    
    descuento=precio_artículo-precio_venta;
    descuento_porcentaje=(descuento*100/precio_artículo);
    
        System.out.println("Descuento% "+ descuento_porcentaje);
            
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication41;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class JavaApplication41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Pon un valor y lo doblare por dos, luego el resultado lo multiplicare por 3");
    int numero= sc.nextInt();
    int valorDoble=doblarNumero(numero);
    System.out.println("numero "+numero+" valor_doble "+valorDoble);
    int valorTriple=multNumero(valorDoble); //se llama a valor doble, no a numero
    System.out.println("valor_triple "+valorTriple);
    }
    /**
     * 
     * @param valor
     * @return 
     */
    public static int doblarNumero(int valor)
    {int doble = valor * 2;
    return doble;}
    
    /**
     * 
     * @param valor
     * @return 
     */
    
    public static int multNumero(int valor)
    {int triple= valor*3;
    return triple;}
}


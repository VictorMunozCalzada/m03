/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication50;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class JavaApplication50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double milla;
    double millas_km;
        System.out.println("Introduce las millas");
        milla= sc.nextInt();
     millas_km= conversorMillasKm(milla);
    
     if(millas_km==-1)
    {System.out.println("No puedes introducir negativos");}
    else
     {System.out.println("En km son: "+millas_km);}
    
    
    }

    private static double conversorMillasKm(double milla) {
    if (milla<0)
    {return -1;}
    
    return milla*1.60934; 
    
    }
    
}

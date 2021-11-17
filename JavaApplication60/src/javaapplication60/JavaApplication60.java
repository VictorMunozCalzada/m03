/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication60;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class JavaApplication60 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int dinero=50, bola, apuesta_num,apuesta_dinero, premio;
    boolean ganado;
        bola=tirar_bola();
        apuesta_num=pedir_numero_apuesta();
        apuesta_dinero=pedir_dinero_apuesta(dinero);
        ganado=comprobar_resultado(apuesta_num, bola);
        premio=calcular_premio(apuesta_num, apuesta_dinero);
        actualizar_dinero();
//        seguir_jugando();
    }

    private static int tirar_bola() {
        Random r = new Random();
        int bola = r.nextInt(37);
        return bola;
    }

    private static int pedir_numero_apuesta() {
        Scanner sc = new Scanner(System.in);
        int apuesta_num; 
        do {System.out.println("¿A que numero quieres apostar (0-36 o 37(impar)o 38(par))?");
        apuesta_num= sc.nextInt();} while (apuesta_num<0 || apuesta_num >38); 
        return apuesta_num;
    }

    private static int pedir_dinero_apuesta(int dinero) {
        Scanner sc = new Scanner(System.in);
        int apuesta_dinero;
        do{System.out.println("¿Cuanto dinero quieres apostar?");
        apuesta_dinero=sc.nextInt();
        }while (apuesta_dinero<0 || apuesta_dinero>dinero);
        return apuesta_dinero;
    }

    private static boolean comprobar_resultado(int apuesta_num, int bola) {
    boolean ganado=false;
        if (apuesta_num==38 && bola%2==0)
        {ganado=true;}
        else if (apuesta_num==37 && bola%2!=0)
        {ganado=true;}
        if (apuesta_num==bola)
        {ganado=true;}
    return ganado;
    }

    private static int calcular_premio(int apuesta_num, int apuesta_dinero ) {
    int premio;
    if (apuesta_num==37 || apuesta_num==38)
    {premio=apuesta_dinero*2;}
    else 
    {premio=apuesta_dinero*36;}
    return premio;}
    
    private static int actualizar_dinero(int dinero, int premio, boolean ganado) {
    if (boolean==true)
    {}
    
    }
    

//    private static boolean seguir_jugando(int dinero) {
//    }
//

}

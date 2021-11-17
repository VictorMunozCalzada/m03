/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Piedra_Papel_Tijera;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author alumne
 */
public class Piedra_Papel_Tijera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int tirada_jugador, contador_jugador=0, contador_ordenador=0, tirada_ordenador, ganador;
    boolean seguir_jugando;
     
    do{
    tirada_ordenador=tirada_ordenador();
    tirada_jugador=tirada_jugador();
    mostrar_jugada(tirada_ordenador);
    ganador=ganador(tirada_ordenador, tirada_jugador);
        if (ganador==1)
        {contador_jugador++;
        System.out.println("Ha ganado el jugador");
        aumentar_contador(contador_jugador);
        System.out.println("JUGADOR:"+contador_jugador);}
        else if (ganador==-1)
        {contador_ordenador++;
        System.out.println("Ha ganado el ordenador");
        aumentar_contador(contador_ordenador);
        System.out.println("ORDENADOR:"+contador_ordenador);}
        if (ganador==0)
        {System.out.println("Empate");}  
    
        
    seguir_jugando=seguir_jugando(contador_jugador, contador_ordenador);
    }while (seguir_jugando!=false);
    }

    private static int tirada_ordenador() {
    Random r = new Random();
    int tirada_ordenador =r.nextInt(3)+1;
    return tirada_ordenador;
    }

    private static int tirada_jugador() {
    Scanner sc = new Scanner(System.in);
    int tirada_jugador;
    do{System.out.println("Escoge una opcion: (1)Piedra, (2)Papel, (3)Tijera");  
    tirada_jugador=sc.nextInt();
    }while (tirada_jugador != 1 && tirada_jugador !=2 && tirada_jugador !=3);
    return tirada_jugador;
    }

    private static int ganador(int tirada_ordenador, int tirada_jugador) {
    int ganador=0;
    if (tirada_ordenador==1 && tirada_jugador==3 || tirada_ordenador==2 && tirada_jugador==1 || tirada_ordenador==3 && tirada_jugador==2)
    {ganador=-1;}
    else if (tirada_jugador==1 && tirada_ordenador==3 || tirada_jugador==2 && tirada_ordenador==1 || tirada_jugador==3 && tirada_ordenador==2)
    {ganador=1;}
    else 
    {ganador=0;}
    return ganador;
    }

    private static int aumentar_contador(int contador) {
    contador++;
    return contador;
    }

    private static boolean seguir_jugando(int contador_jugador, int contador_ordenador) {
    boolean seguir_jugando=true;
        if (contador_jugador==5 || contador_ordenador==5 )
        {seguir_jugando=false;}
    return seguir_jugando;        
    }

    private static void mostrar_jugada(int tirada_ordenador) {
    if (tirada_ordenador==1)
    {System.out.println("Tirada ordenador==Piedra");}
    else if (tirada_ordenador==2)
    {System.out.println("Tirada ordenador==Papel");}
    else if (tirada_ordenador==3)
    {System.out.println("Tirada ordenador==Tijera");}
    }
    
    
    
}

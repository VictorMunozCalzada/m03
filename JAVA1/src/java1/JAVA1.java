/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java1;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class JAVA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // COMANDOS BASICOS
        /* COMANDOS
           BASICOS */
        int numero=16;
        System.out.println("Numero "+numero);
        double numeroConDecimales=16.5;
        System.out.println("Numero decimal "+numeroConDecimales);
        boolean cierto_falso=true;
        System.out.println("el boleano vale "+cierto_falso);
        
        int edad=16;
        if(edad>=18){
            System.out.println("Eres mayor de edad");
        }
        else{ 
            System.out.println("Eres menor de edad");
        }
        
        
        
        
        
        // ELSE IF
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Eres mayor de edad(s/n)");
        char mayorEdad;
        int dinero;
        //recoge la frase que pongas pero devuelve la
        //letra que esta en la primera posicion
        mayorEdad = teclado.nextLine().charAt(0);
        System.out.println("Has escogido " + mayorEdad);
        
        System.out.println("Cuanto dinero tienes pon solo euros sin centimos");
        dinero = teclado.nextInt();
        
        
        //or || (Alt gr + 1)
        //and && (Mayus + 6)
        if(((mayorEdad=='s') || (mayorEdad=='S')) && (dinero>=10))
        {
          System.out.println("¿Cuál es el café más peligroso del mundo?\n" +
"El ex-preso"); 
        }
        else if ((mayorEdad=='n') || (mayorEdad=='N'))
        {
          System.out.println("¿Qué le dice un jaguar a otro jaguar?");
          System.out.println("Jaguar you");
        }
        else
        {
            System.out.println("opcion incorrecta");
        }
        
        
        
        
     
        final int MILLA_METRO=1852;
        
        
        
        /* ”Este String es demasiado largo para estar en una línea del ” +
           ”fichero fuente y se ha dividido en dos.” */
        
        /*  print(“...”) imprime texto por pantalla
            println(“...”) imprime texto por pantalla e introduce un salto de línea */
        
        
        
        
        
        int hh,mm,ss;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la hora : ");
        hh = sc.nextInt();
        System.out.print("Introduce el minuto : ");
        mm = sc.nextInt();
        System.out.print("Introduce el segundo : ");
        ss = sc.nextInt();
        
        ss = ss+1; //ss++; ss +=1;
        if (ss==60)
        {
            System.out.println("he pasado 60");
            ss=0;
            mm = mm +1;
            if (mm==60)
            {
                mm=0;
                ++hh;
                if (hh==24)
                {
                    hh=0;
                    System.out.println("Hora " + hh + " minutos " + mm + " segundos " + ss);
                }
                else //si no he pasado de 24 horas
                {
                    System.out.println("Hora " + hh + " minutos " + mm + " segundos " + ss);
                }  
            }
            else //no he pasado de 60 minutosd
            {
                System.out.println("Hora " + hh + " minutos " + mm + " segundos " + ss);
            }     
        }
        else //no he pasado de 60 segundos
        {
        System.out.println("Hora " + hh + " minutos " + mm + " segundos " + ss);
        }
        
        
        
        
        
        
        
        
        
        int copas;
        char opcion;
        final int MAGOELECTRICO=0;
        System.out.println("cuantas copas tienes");
        copas = sc.nextInt();
        sc.nextLine(); //limpiar buffer, fijaros que no lo pongo a ninguna variable
        if (copas<2000)
            {
                System.out.println("Escoge entre Mago Electrico(M) i megaEsbirro(E)");
                opcion = sc.nextLine().charAt(0);

                //if (opcion == MAGOELECTRICO)
                if (opcion == 'm' || opcion == 'M') {
                    System.out.println("Tienes Mago Electrico");
                } else if (opcion == 'e'|| opcion == 'E') {
                    System.out.println("Tienes megaEsbirro");
                } else {
                    System.out.println("opcion incorrecta");
                }   
            } //copas < 2000
        else if (copas>=2000 && copas<3000)
        {
            System.out.println("Escoge entre Cavallero(C) i Bandida(B)");
             opcion = sc.nextLine().charAt(0);

                //if (opcion == MAGOELECTRICO)
                if (opcion == 'c'|| opcion == 'C') {
                    System.out.println("Tienes Cavallero");
                } else if (opcion == 'b' || opcion == 'B') {
                    System.out.println("Tienes Bandida");
                } else {
                    System.out.println("opcion incorrecta");
                } 
        }
        else //copas mas de 3000
        {
             System.out.println("Escoge entre EjercitoEsqueleto(E) i Gigante(G)");
             opcion = sc.nextLine().charAt(0);

                //if (opcion == MAGOELECTRICO)
                if (opcion == 'e'|| opcion == 'E') {
                    System.out.println("Tienes Ejercito de Esqueleto");
                } else if (opcion == 'g' || opcion == 'G') {
                    System.out.println("Tienes Gigante");
                } else {
                    System.out.println("opcion incorrecta");
                } 
        }
        
        
        
        
        
        
        
        
        
        //Escoge opcion
        int opcionn = teclado.nextInt();
        
        
        switch(opcionn){
            case 1: //if (opcion==1)
                System.out.println("Empezando partida");
                break;
            case 2:
                System.out.println("Recuperando partida");
                break;
            case 3:
                System.out.println("El record es 50000 puntos");
                break;
            case 0:
                System.out.println("Saliendo juego");
                break;
            default:
                System.out.println("opcion no correcta");
                break;                
        }
        

        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

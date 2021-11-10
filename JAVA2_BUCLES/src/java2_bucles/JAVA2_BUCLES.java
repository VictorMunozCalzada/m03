/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java2_bucles;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class JAVA2_BUCLES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        int acumSuma10=0;
        int producto10 = 1;
        int numero;
        
        for(numero=1;numero <=10;numero++)
        {
            System.out.println(acumSuma10 + "+" + numero);
            acumSuma10 = acumSuma10 + numero;
            System.out.println(producto10 + "*" + numero);
            producto10 = producto10*numero;
            System.out.println("fin vuelta");
        }

        System.out.println("la suma total es " + acumSuma10);
        System.out.println("el producto total es " + producto10);
    
    
        
        
        
        
        
       int npositivo=0, nnegativo=0;
       int numIntroducido=0;
         Scanner teclado = new Scanner(System.in);
        
        do{
            System.out.println("introduce numero , 0 para salir");  
            numIntroducido = teclado.nextInt();
            if (numIntroducido>0)
            { npositivo++;}
            else if (numIntroducido<0)
            {nnegativo++;}
            
        }while(numIntroducido != 0);

        System.out.println("Has puesto " + npositivo + " positivos ");
        System.out.println("Has puesto " + nnegativo + " negativos ");
        if (nnegativo>0)
        {
            System.out.println("has puesto algun negativo");
        }
        else
        {
            System.out.println("no has puesto negativos.");
        } 
        
        
        
        
        

        
        int nota,contanotas=0,acumNotas=0;
        boolean hubo10=false;
         
         do{
             System.out.print("pon nota:");
            nota=teclado.nextInt();
            if (nota!=-1) //me cuenta las veces que pongo notas, sin contar el -1
            {
             contanotas++;  //se cuantas notas he puesto 
             acumNotas = acumNotas+nota; //voy sumnado notas a cada vuelta         
//              if (nota==10)
//            {
//                hubo10=true;
//            }            
            }           
            if (nota==10)
            {hubo10=true;}
            
         }while(nota!=-1);
         
         
         if (hubo10==true)
         {System.out.println("pusiste un 10");}
         else
         {System.out.println("no hay 10");}
         
         System.out.println("has puesto " + contanotas + " notas ");
         double media=(double) acumNotas/contanotas;
         System.out.println("La media es" + media);
    
         
    // Bucle anidado
    
       int tabla, contador;
        
        for (tabla = 1; tabla <= 10; tabla++) {
            System.out.println("Tabla del " + tabla);
            for (contador = 1; contador <= 10; contador++) 
            {
            System.out.println(contador + "*" + tabla + "=" + tabla*contador);
            
            }
        }  
         
         
    // suma pares impares
    
    int pares=0, impar = 0,cont;
        for (cont =100; cont<=200; cont++) {
            //System.out.println("contador es " + cont);
            if (cont%2==0)
            {
                pares = pares + cont;
            }
            else
            {
                impar = impar + cont;
            }
            
        }
        
        System.out.println("La suma de pares es " + pares);
        System.out.println("La suma de impares es " + impar);
        
        
         
         
      //-------------------------------------------------------------------
      
      Random r = new Random();
        //el numero de dentro del nexint es el numero diferentes de valores
        //y la suma es el valor minimo por el que empezara
        int numAleatorio = r.nextInt(10)+21;
        System.out.println("numero generado " + numAleatorio);
        numAleatorio = r.nextInt(21)+20;
        System.out.println("numero generado " + numAleatorio);
        numAleatorio = r.nextInt(101)+500;
        System.out.println("500-600 numero generado " + numAleatorio);
        numAleatorio = r.nextInt(3)+13;
        System.out.println("13-15numero generado " + numAleatorio);
    }
    
}

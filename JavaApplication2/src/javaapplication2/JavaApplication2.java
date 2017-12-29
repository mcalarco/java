
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;


/**
 *
 * @author Marcelo
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    private static int leernumero()
    {
        Scanner s=new Scanner(System.in);
        return s.nextInt();
    }
  public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        edad=53;
        System.out.println("Edad: "+edad+" años");
        int dni;
        dni=16916534;
        System.out.println("DNI: "+dni); 
        
        String nom="Marcelo";
        System.out.println("Nombre: "+nom);
        
        String ape="Calarco";
        System.out.println("Apelido: "+ape);
        
        String sex="Masculino";
        System.out.println("Sexo: "+sex);
        
        double pre;
        pre=12.25;
        System.out.println("Precio: "+pre+" $");  
        
        double tem;
        tem=16.5;
        System.out.println("Temperatura: "+tem+" ºC");        
    
        boolean enc;
        enc=true;
        System.out.println("Encendido: Verdadero");
        
    /* "Creo una nueva persona y la muestro" */
    
        Persona p1= new Persona("juan","p",22,'m',333333);
        System.out.println(p1.dni);
        
    /* "Indico con un subproceso si puede votar, solo muestra true o falso" */    
         System.out.println(p1.vota());
   
     /* "Esta es una forma para pedir un número por pantalla" 
         
         System.out.println(p1.toString());
   
   System.out.println("Ingrese un Nº");
   int num1=leernumero();
   System.out.println("El número ingresado es: "+num1);
   
   */
     
    /*    "Ejemplo para generar una pila nueva"*/
     
        Stack<Integer> pila1=new Stack<>();
        pila1.add(3);
        pila1.add(9);
        pila1.add(7);
        pila1.add(2);
        pila1.add(4);
    System.out.println("Mostrar la pila: "+pila1);    
      
     /*  "Ejemplo iterar una pila "*/
    Iterator it=pila1.iterator();
    while (it.hasNext())
            {        
            
            it.next();
            }
     System.out.println("Mostrar la pila: "+pila1);
  
      /*  "Mostrar el máximo  "*/
           
      System.out.println("Mostrar el máximo de la pila: "+Collections.max(pila1));
  
     /*  "Ordenar la pila "*/
     
      Collections.sort(pila1);
      System.out.println("Mostrar la pila ordenada: "+pila1);
      
      /*  "Mostrar el mínimo  "*/
           
      System.out.println("Mostrar el mánimo de la pila: "+Collections.min(pila1));
       
}
}

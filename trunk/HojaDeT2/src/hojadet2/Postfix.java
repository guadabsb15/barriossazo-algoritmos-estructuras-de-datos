/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadet2;

import java.util.Scanner;
/**
 *
 * @author BarriosSazo
 */
public class Postfix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        StackVector<Double> pila= new StackVector();
        boolean terminar = false;//lleva control de cuando terminar la expresion
        int opcion;
        
        while (terminar==false){// ciclo que permite que se baya ingresando la expresion
            
            System.out.println("Ingrese numero del menu:");
            System.out.println("1: Numero");
            System.out.println("2: Operacion");
            System.out.println("3: Termninar Expresion");
           
            if (sc.hasNextInt()){
                opcion = sc.nextInt();
            } else{
                System.out.println("Debe ingresar un entero ");
                sc.next();
                opcion = 4;
            }
            
            switch (opcion){
                case 1: leerNumero(sc,pila); break;
                case 2: {
                        if (pila.size()>1){
                            leerOperacion(sc,pila);
                        }else{
                            System.out.println();
                            System.out.println("No hay suficientes operandos");
                        } 
                        }break;
                case 3: terminar=true; break;
                default: System.out.println("Opcion invalida"); break;
            } // end del switch
           
           System.out.println();
           System.out.println("Pila: ");
           System.out.println(pila.toString());
           System.out.println();
        }//end del while
        
        
    }
    
    /**
     * Este metodo sirve para que el usuario ingrese el numero y 
     * este sea ingresado al stack
     * 
     * @param sc  usada para leer el numero ingrsado por usuario
     * @param pila stack usado para la evaluacion de la expresion
     */
     public static void leerNumero(Scanner sc, StackVector pila)
    {   
        Scanner s=sc;
        StackVector p=pila;
        double numero;
        
        System.out.println("Ingrese numero: ");
       
        numero=s.nextDouble();
        p.push(numero);
    }
    
     /**
      * 
      * @param sc usada para leer la opcion ingresada por usuario
      * @param pila stack usado para la evaluacion de la expresion
      */
     public static void leerOperacion(Scanner sc, StackVector pila)
    {
        Scanner s=sc;
        StackVector<Double> p=pila;
        int operacion;
        double denominador, numerador;
        
        System.out.println("Ingrese numero de operacion: ");
        System.out.println("1: + Sumar");
        System.out.println("2: - Restar");
        System.out.println("3: * Multiplicar");
        System.out.println("4: / Dividir");
        
        operacion=s.nextInt();
        
        switch (operacion){
            case 1:p.push(p.pop()+p.pop());break;
            case 2:p.push(p.pop()-p.pop());break;
            case 3:p.push(p.pop()*p.pop());break;
            case 4:{ numerador=p.pop();
                     denominador=p.pop();
                     if (denominador != 0){
                        p.push(numerador/denominador);
                     }else {
                         System.out.println();
                         System.out.println("Division dentro de 0");
                     }
                }break;
            default:System.out.println("Opcion invalida");break;
        }
    }
     
     
}

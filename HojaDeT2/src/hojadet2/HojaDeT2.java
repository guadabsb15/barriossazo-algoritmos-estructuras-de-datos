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
public class HojaDeT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        StackVector<Double> pila= new StackVector();
        boolean terminar = false;
        
        while (terminar==false){
            
            System.out.println("Ingrese numero del menu:");
            System.out.println("1: Numero");
            System.out.println("2: Operacion");
            System.out.println("3: Termninar Expresion");
            int opcion = sc.nextInt();
        
            switch (opcion){
                case 1: leerNumero(sc,pila); break;
                case 2: leerOperacion(sc,pila); break;
                case 3: terminar=true; break;
            }
            
           System.out.println("Pila: ");
           System.out.println(pila.toString());
        }//end del while
        
        
    }
    
     public static void leerNumero(Scanner sc, StackVector pila)
    {   
        Scanner s=sc;
        StackVector p=pila;
        double numero;
        
        System.out.println("Ingrese numero: ");
        numero=s.nextDouble();
        
        p.push(numero);
    }
    
     public static void leerOperacion(Scanner sc, StackVector pila)
    {
        Scanner s=sc;
        StackVector<Double> p=pila;
        int operacion;
        
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
            case 4:p.push(p.pop()/p.pop());break;
        }
    }
     
     
}

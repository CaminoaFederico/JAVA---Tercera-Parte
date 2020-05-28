
package netbeans25;

import java.io.*;
import java.util.*;
import java.math.*;

public class NetBeans25 {

    public static void main(String[] args) {
        int Arreglo[] = new int [5];
        int n, duplicado=0;
        Scanner ingreso = new Scanner(System.in);
       
        for(int i=0; i<Arreglo.length; i++){
            System.out.println("Ingrese un número del 10 al 100");
            n = ingreso.nextInt();
            Arreglo[i] = n;
            
            if(n<10 || n>100){
                System.out.println("Usted ha introducido un número que no está comprendido entre 10 y 100");
                break;
            }
            
            if(duplicado!=n){
                System.out.println("El número ingresado para la posición " +i+" es el: "+Arreglo[i]);
            }
            
            duplicado = n*2;
        }
    }
    
}


package netbeans19;

import java.io.*;
import java.util.*;
import java.math.*;

public class NetBeans19 {

    public static void main(String[] args) {
        int n1[] = new int[21];
        int n2, suma=0, max=0;
        
        Scanner ingreso = new Scanner(System.in);
        
        for(int i=0; i<n1.length; i++){
            System.out.println("Ingrese un número entero positivo");
            n2=ingreso.nextInt();
                         
            if(n2<0){
                break;
            }
                        
            if(n2>max){
                max = n2;
            }
            
            n1[i] = n2;
            suma+=n1[i];
        }
        
        System.out.println("La suma de todos los números del vector es: "+suma);
        System.out.println("El mayor número de los ingresados es: "+max);
    }
    
}

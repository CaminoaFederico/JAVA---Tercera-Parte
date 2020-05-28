
package netbeans24;

import java.io.*;
import java.util.*;
import java.math.*;

public class NetBeans24 {
   
    public static void main(String[] args) {
        final int TAMAÑO_ARREGLO = 10; //Así se declara una constante (static)
        double suma=0;
        double Array[] = new double[TAMAÑO_ARREGLO];
        
        Array[9] = 1.667;
        Array[6] = 3.333;
        
        for(int x=0; x<Array.length; x++){
            suma += Array[x];
        }
        
        System.out.println("El resultado de la suma de los elementos del arreglo es: "+suma);
    }
    
}


package netbeans22;

import java.io.*;
import java.util.*;
import java.math.*;

public class NetBeans22 {
    
    public static void main(String[] args) {
        int cant, n, max=0, min=1000000, posmax=0, posmin=1000000;
        
        Scanner ingreso = new Scanner(System.in);       
        System.out.println("¿De cuántas posiciones quiere que sea el vector?");
        cant = ingreso.nextInt();
        int vector[]=new int[cant];//La cantidad de posiciones del vector es igual al número ingresado
        
        for(int i=0; i<cant; i++){
            System.out.println("Ingrese un número entero");
            n = ingreso.nextInt();
            vector[i] = n;//La posición del vector es igualada al número ingresado

            if(n>max){
                max=n;//Acá se guarda el valor máximo ingresado
                posmax=i;//Acá se guarda la posición correspondiente al valor máximo ingresado
            }
            
            if(n<min){
                min=n;//Acá se guarda el valor mínimo ingresado
                posmin=i;//Acá se guarda la posición correspondiente al valor mínimo ingresado
            }           
        }        
        System.out.println("El valor máximo es "+max+" y corresponde a la posición "+posmax);
        System.out.println("El valor mínimo es "+min+" y corresponde a la posición "+posmin);
    }
    
}

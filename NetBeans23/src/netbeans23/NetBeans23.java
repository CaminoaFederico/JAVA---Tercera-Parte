
package netbeans23;

import java.io.*;
import java.util.*;
import java.math.*;

public class NetBeans23 {

    public static void main(String[] args) {
        int n, cant=0;
        
        Scanner ingreso = new Scanner(System.in);
        System.out.println("¿De cuántas posiciones quiere que sea el vector?");
        cant = ingreso.nextInt();        
        int matriz[] = new int[cant];
        
        for(int i=0; i<cant; i++)
        {
            System.out.println("Ingrese un número entero");
            n = ingreso.nextInt();
            matriz[i] = n;
        }
        
        System.out.println("Matriz normal:");
        for(int i=0; i<cant; i++){
            System.out.print(matriz[i]+" ");
        }
        System.out.println();
        System.out.println("Matriz transpuesta:");
        for(int i=cant-1; i>=0; i--){
            System.out.print(matriz[i]+" ");
        }       
    }
    
}


package netbeans21;

import java.io.*;
import java.util.*;
import java.math.*;

public class NetBeans21 {

    public static void main(String[] args) {
        int matriz[][]={{4,7,-5,4},{0,3,-2,6},{1,2,4,1},{6,1,0,3}};
        int suma = 0;
        
        for(int i=0; i<matriz.length; i++){//4 filas
            for(int j=0; j<matriz.length; j++){//4 columnas
                if(i!=j){
                    suma+=matriz[i][j];//si no pertenece a la diagonal principal
                }
            }
        }
        
        System.out.println("La suma es: "+suma);
    }
    
}

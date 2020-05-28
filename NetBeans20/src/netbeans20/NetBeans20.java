
package netbeans20;

import java.io.*;
import java.util.*;
import java.math.*;

public class NetBeans20 {

    public static void main(String[] args) {
        int matriz[][]={{4,7,1,3,5},{2,0,6,9,7},{3,1,2,6,4}};//uma matriz de 3 vectores con posiciones c/u
        int posiciones = 5;
        
        System.out.println("Yo leí esto: ");
        
        for(int i=0; i<matriz.length; i++){//3 filas
            for(int j=0; j<posiciones; j++){//5 columnas
                System.out.print(matriz[i][j]);//muestra 3 filas de 5 columnas
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Pero escrbí esto: ");
        
        for(int i=0; i<posiciones; i++){//5 filas
            for(int j=0; j<matriz.length; j++){//3 columnas
                System.out.print(matriz[j][i]);//muestra 5 filas de 3 columnas
            }
            System.out.println();
        }
    }
    
}


package netbeans26;

import java.io.*;
import java.util.*;
import java.math.*;

public class NetBeans26 {

    public static void main(String[] args) {
        int clase, primera, economica;
        boolean Asientos[] = new boolean[10];
        
        Scanner ingreso = new Scanner(System.in);
        
        for(int i=0; i<Asientos.length; i++){
            System.out.println("Por favor, escriba 1 para Primera Clase y 2 para Clase Económica");
            clase = ingreso.nextInt();
                    
            switch(clase){
                case 1: primera = (int) (Math.random()*5);
                        if(Asientos[primera]==true){
                            while(Asientos[primera]==true){
                                primera = (int) (Math.random()*5);
                            }
                            System.out.println("Primera Clase - Asiento "+(primera+1));
                        }
                        else{
                            System.out.println("Primera Clase - Asiento "+(primera+1));
                        }
                        Asientos[primera]=true;
                        break;
                case 2: economica = (int) (Math.random()*5)+5;
                        if(Asientos[economica]==true){
                            while(Asientos[economica]==true){
                                economica = (int) (Math.random()*5)+5;
                            }
                            System.out.println("Clase Económica - Asiento "+(economica+1));
                        }
                        else{
                            System.out.println("Primera Clase - Asiento "+(economica+1));
                        }
                        Asientos[economica]=true;
                        break;
                default: System.out.println("Usted no ha ingresado 1 ó 2");
                        break;
            }            
        }
    }
    
}

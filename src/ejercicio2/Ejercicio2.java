//Ejercicio2
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {


    public static void main(String[] args) {
         Scanner in =new Scanner(System.in);
        int numero=1;
        int conta = 1;
        
        while(numero>0){
            System.out.println("ingrese un numero ");
            numero=in.nextInt();
           if(numero>0){
               conta++;
           }
            
        }
        System.out.println("cantidad de numero ingresados "+conta);
       
    }
        
        
  
    
    
}

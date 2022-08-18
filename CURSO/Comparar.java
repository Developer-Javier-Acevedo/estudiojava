package CURSO;

import java.io.Console;
import java.lang.reflect.Array;
import java.util.Vector;

public class Comparar { 

    int mayor, menor ;

   public int Mayor(int numero1, int numero2, int numero3){

       mayor = numero1 ;

        if(numero2 > mayor ){
        mayor = numero2;
        }
        if(numero3 > mayor){
        mayor = numero3;
        }

       return mayor ;
    }
    
   public int Menor (int numero1, int numero2, int numero3){

        
         menor = numero1 ; 
 
         if(numero2 < menor ){
         menor = numero2;
         }
         if(numero3 <  mayor){
         menor = numero3;
         }
         return menor;
     }

   public double promedio (int numero1, int numero2, int numero3){

        double suma = Double.valueOf((numero1 + numero2 + numero3 ));
        
        return (suma )/3 ;
     }

   public boolean ParImpar(int numero){

      boolean Parimpar;

      if (numero % 2 == 0 ){

         Parimpar = true ; 

      }else{
         Parimpar = false;
      }
      return Parimpar;

     }
 
   public void NumerosPrimos(){  

      String resultado = ""; 
      
      for(int i=1 ; i<=100 ; i++){
         int contador = 1 ;
         for(int j=1 ; j<=100 ; j++){

            if(i%j==0){
               contador ++;
            }
         } 
         if(contador == 2 ){
             resultado = resultado + i + ", "; 
         }
      
     }
     System.out.println(resultado);  
   }
}
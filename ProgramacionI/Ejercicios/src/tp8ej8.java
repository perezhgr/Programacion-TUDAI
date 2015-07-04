/*Hacer un programa que devuelva la posición de inicio y fin
de la primer secuencia de números distinta de ceros.*/

import java.util.Scanner;

public class tp8ej8 {
    final static int longitudarreglo =10;
    
    public static int devuelve_posicion_inicial(int [] Arreglo){
    	int posinicial =0;
    	while ( ( posinicial < longitudarreglo ) && ( Arreglo[posinicial]==0 ) )
    		posinicial ++;
    	
    	if (posinicial ==longitudarreglo)
    		return -1;
    	else
    		return posinicial; 
    } 
      
     public static int  devuelve_posicion_final (int [] Arreglo){
    	 int posfinal = devuelve_posicion_inicial(Arreglo);
    	 int j = devuelve_posicion_inicial(Arreglo)+1;

    		while ( ( j < longitudarreglo ) && ( Arreglo[j]!=0 ) ){
    			 posfinal++;
    		     j++;
    		} 
    	
    	return posfinal;
    }    
     
   public static void imprimir_arreglo(int [] Arreglo){
	   
	   for (int i =0 ; i<longitudarreglo;i++){
		   System.out.println(Arreglo[i]);
	   }
   }    
      
    
	public static void main(String[] args) {
      int [] Enteros  = {0,0,0,10,0,0,0,0,0,0};
      System.out.println("Arreglo original :");
      imprimir_arreglo(Enteros);
      if (devuelve_posicion_inicial(Enteros) == -1){
    	  System.out.println("Posicion invalida");
      }
      else{
    	  System.out.println("La posición de inicio de la secuencia es "+devuelve_posicion_inicial(Enteros)+".");
          System.out.println("La posición de fin de la secuencia es "+devuelve_posicion_final(Enteros)+".");
      }
	}

}

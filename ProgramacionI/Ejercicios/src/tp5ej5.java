/*Escribir un programa que solicite el ingreso de números entre
0 y 999, y muestre un mensaje de cuántos dígitos tiene el
mismo. Además, si tiene 3 dígitos debe informar qué número
es. Finalice el programa cuando se ingrese el valor 0.
*/

import java.util.Scanner;

public class tp5ej5 {

	public static void main(String[] args) {
		  int numeroingresado;
		  /*Se asume que el usuario ingresa datos de tipo entero y que el número 
		  que ingresa está entre 1 y 999.*/
		  
		  Scanner sc = new Scanner(System.in);	  
	
		 do{  
		  System.out.println ("Ingrese un número entre 1 y 999 :");
    	  numeroingresado  = sc.nextInt();
    	  if(numeroingresado>=100){
    		  System.out.println ("El número tiene 3 dígitos");  
    	  }
    	  else{
    		  if(numeroingresado >=10){
    			  System.out.println ("El número tiene 2 dígitos");
    		  }
    		  else{System.out.println ("El número tiene 2 dígitos");}
    	  }
		 }while(numeroingresado != 0);
	}
}

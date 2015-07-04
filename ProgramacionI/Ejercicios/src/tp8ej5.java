/*Hacer un programa que inserte un elemento en un arreglo
(ordenado decrecientemente) de tamaño MAX=10. 
inalmente se pide que imprima el arreglo.*/

import java.util.Scanner;

public class tp8ej5 {
	final static int posinicial = 0;
	final static int posfinal = 4;
	final static int longitudarreglo = 5;

	public static void corrimiento_a_izquierda (int[] Arr, int posicion){
		
		for( int i=posinicial;i<posicion;i++){
			Arr[i] = Arr[i+1];
		}
	}
	
	public static void corrimiento_a_derecha (int[] Arr, int posicion){
		
		for( int i=posfinal;i>posicion;i--){
			Arr[i] = Arr[i-1];
		}
	}
	
	public static int busca_posicion(int [] Arreglo , int valor){
		int posicion = posinicial;
		
		while ( ( posicion < longitudarreglo )  && ( Arreglo[posicion] > valor ) ) 
		     posicion++;
		
		if (posicion == longitudarreglo )
		     return -1 ;
		else 
			return posicion ;
		
	}
	
	public static void insertar_elemento_ordenado(int [] Arreglo , int numero){
		int posicionresultante = busca_posicion( Arreglo , numero);
		
	    if (posicionresultante == -1){
		    posicionresultante = posfinal;
	        corrimiento_a_izquierda(Arreglo, posicionresultante);
		    Arreglo [posicionresultante] = numero;
	   }
	   else{
		    corrimiento_a_derecha(Arreglo, posicionresultante);
		    Arreglo [posicionresultante] = numero;
	   }
	}
	
	public static int validar_entero(){
		int numero = posinicial;
		boolean valida_entero = false;
		do{
			try{
				Scanner sc = new Scanner (System.in);
				System.out.println("Ingrese un numero :");
				numero = sc.nextInt();
				valida_entero = true;
			}
			catch (Exception e){
				System.out.println("Debe ingresar un número válido. ");
			}
		}while(valida_entero!=true);
		return numero;
	}
		
	public static void imprimir_arreglo(int[] Arr){
		for (int i = 0; i < longitudarreglo; i++){
			System.out.println(Arr[i]);
		}
	}
	
	public static void main (String []args){
		int [] Enteros = {19,18,15,4,3};
		
		System.out.println("Arreglo original: ");
		imprimir_arreglo(Enteros);
		insertar_elemento_ordenado(Enteros,validar_entero());
		System.out.println("Arreglo con inserción: ");
		imprimir_arreglo(Enteros);
	}
}
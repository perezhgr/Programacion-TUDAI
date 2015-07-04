/*Hacer un programa que elimine un elemento en un arreglo
(ordenado decrecientemente) de tamaño MAX=10. 
Finalmente se pide que imprima el arreglo..*/

import java.util.Scanner;

public class tp8ej6 {
	final static int posinicial = 0;
	final static int posfinal = 4;
	final static int longitudarreglo = 5;

	public static void corrimiento_a_izquierda (int[] Arr, int posicion){
		
		for (int i=posicion;i<longitudarreglo;i++){
			Arr[i] = Arr[i+1];
		}
	}
	
	public static void corrimiento_a_derecha (int[] Arr, int posicion){

		for (int i = posfinal;i>posicion;i--){
			Arr[i] = Arr[i-1];
		}
	}
	
	public static int busca_posicion(int [] Arreglo , int valor){
		int posicion = posinicial;
		
		while ( ( posicion < longitudarreglo )  && ( Arreglo[posicion] != valor ) ) 
		     posicion++;
		if(posicion == longitudarreglo)
			return -1 ;
		else
		    return posicion ;
	}
	
	public static void eliminar_elemento(int [] Arreglo , int numero){
		int posicion = busca_posicion( Arreglo , numero);
		
		if (posicion == -1){
			System.out.println("El elemento que quiere eliminar no se encuentra en el arreglo.");	
		}
		else if (posicion == posfinal){
			posicion = posfinal -1;
	        corrimiento_a_derecha(Arreglo,posicion);		
		}
		else {
			corrimiento_a_izquierda(Arreglo,posicion);
		}
   }
	
	public static int validar_numero(){
		boolean numero_valido=false; 
		int numero = 0;
		do{
			try{
				Scanner sc = new Scanner (System.in);
				System.out.println("Ingrese un número : ");
				numero = sc.nextInt();
				numero_valido =true;				
			}
			catch(Exception e){
				System.out.println("Debe ingresar un valor válido ! ");
			}
		}while (numero_valido != true);
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
		eliminar_elemento(Enteros,validar_numero());
		System.out.println("Arreglo final: ");
		imprimir_arreglo(Enteros);
	}
}
/*Implementar un método que realice un corrimiento a
izquierda en un arreglo ordenado a partir de una POSICIÓN.*/

import java.util.Scanner;

public class tp8ej4 {
	final static int posinicial = 0;
	final static int posfinal = 4;
	final static int longitudarreglo = 5;

	public static void corrimiento_a_izquierda (int[] Arr, int posicion){
			
		for( int i=posinicial;i<posicion;i++){
			Arr[i] = Arr[i+1];
		}
	}
	
	public static void imprimir_arreglo(int[] Arr){
		for (int i = 0; i < longitudarreglo; i++){
			System.out.println(Arr[i]);
		}
	}
	
	public static int validar_entero(){
		int numero = posinicial;
		boolean valida_entero = false;
		boolean correcto = false; 
		do{
			try{
				Scanner sc = new Scanner (System.in);
				System.out.println("Ingrese una posicion :");
				numero = sc.nextInt();
				valida_entero = true;
				correcto = validar_posicion(numero);																
			}
			catch (Exception e){
				System.out.println("Debe ingresar una posición válida. ");
			}
		}while( (valida_entero!=true) || (correcto!=true));
		return numero;
	}
	
	public static boolean validar_posicion(int valor)
	{
		   if((valor >= posinicial) && (valor < posfinal))
				return  true;
		   else 
			   return false;
	}		
	
	public static void main (String []args){
		int [] Enteros ={9,8,7,6,5};
		    System.out.println("Arreglo original: ");
		    imprimir_arreglo(Enteros);	
		    corrimiento_a_izquierda(Enteros,validar_entero());
		    System.out.println("Arreglo final: ");
			imprimir_arreglo(Enteros);
		}
}

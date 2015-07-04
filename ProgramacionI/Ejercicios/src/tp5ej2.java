/* Escribir un programa que permita ingresar n números enteros
de a uno por vez y los muestre por pantalla de la siguiente
manera:
----------
3    1°
----------
4	 2°
----------
...
----------
-1   n°
----------
*/

import java.util.Scanner;

public class tp5ej2 {

	public static void main(String[] args) {
		/*Defino una variable "cantidad de numeros ingresados" (CNI)
		 * Sirve para saber cuantas iteraciones debo hacer en el bucle. 
		*/
		final int CNI = 5;
		int numeroingresado;		
		Scanner sc = new Scanner(System.in);
	
		for(int i=1; i<=CNI; i++){			
			System.out.println("Ingrese un numero");
			numeroingresado = sc.nextInt();
			System.out.println(numeroingresado+"\t\t"+i+"°");
		}
		
	}

}

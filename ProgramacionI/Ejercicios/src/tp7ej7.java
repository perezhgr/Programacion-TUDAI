/*Construir una rutina que devuelva la potencia de dos de un numero dado.*/

import java.util.Scanner;

public class tp7ej7 {
	
	public static int CalculaPotenciaDeDos(int x){
		return x*x;
	}

	public static void main(String[] args) {
		int numero = 0;
		
		try{
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Ingrese un número: ");
		   numero = sc.nextInt();
		   System.out.println("La potencia de ds del número "+numero+" es: "+CalculaPotenciaDeDos(numero));		   
		}	   
		catch(Exception exc){
			System.out.println("Error!.Debe ingresar sólo números enteros.");
		}
    }
}

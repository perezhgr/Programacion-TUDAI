/*Escribir un programa que solicite ingresar 5 números con
punto flotante. Evaluar si los datos ingresados son números 
con punto flotante, en caso contrario mostrar un error y
solicitar nuevamente el dato.*/

import java.util.Scanner;
public class tp6ej4 {

	public static void main(String[] args) {
		final int MAX =5;
		int i=1;
		double numeroingresado =0.0;
		do{
			try{
				Scanner sc = new Scanner(System.in);
				System.out.println("Ingrese un numero: ");
				numeroingresado = sc.nextDouble();
				i++;
			}
			catch(Exception exc){ // Se ejecuta si ocurre algún error de lectura 
				System.out.println("Error !.Ingrese nuevamente un dato.");
			}	
		}
		while (i<=MAX);
	}
}

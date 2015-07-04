/*Escribir un programa que solo permita salir si se ingresa un
número por pantalla. En caso de ingresar otro caracter
mostrar un error y solicitar nuevamente ingresar un número.*/

import java.util.Scanner;
public class tp6ej3 {

	public static void main(String[] args) {
		int numeroingresado = 0;
		boolean entero =false;
		do{
			try{
				Scanner sc = new Scanner(System.in);
				System.out.println(" Para salir ingrese un numero: ");
				numeroingresado = sc.nextInt();
				entero =true;
			}
			catch(Exception exc){ // Se ejecuta si ocurre algún error de lectura 
				System.out.println("Error !.Debe ingresar un número!.");
			}	
		}
		while (!entero);
	}
}

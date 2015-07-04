/*Escribir un programa que divida un valor por otro, ambos
ingresados poar el usuario. Estudiar el caso con valores igual a
cero.*/

import java.util.Scanner;
public class tp6ej2 {

	public static void main(String[] args) {
		double numeroingresado = 0.0,resultado=0.0;
				
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println(" Ingrese un numero: ");
			numeroingresado = sc.nextDouble();
			resultado = Math.sqrt(numeroingresado);
			System.out.println("La raíz cuadrada de "+numeroingresado+" : "+resultado);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(Exception exc){ // Se ejecuta si ocurre algún error de lectura 
			System.out.println("Ingrese números y no letras.");
		}

	}
}

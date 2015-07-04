/*Escribir un programa que divida un valor por otro, ambos
ingresados por el usuario. Estudiar el caso con valores igual a
cero.*/

import java.util.Scanner;
public class tp6ej1 {

	public static void main(String[] args) {
		double primernum = 0.0;
		double segundonum = 0.0;
		double resultado = 0.0;
		
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese un numero: ");
			primernum = sc.nextDouble();
			System.out.println("Ingrese un numero: ");
			segundonum = sc.nextDouble();
			resultado = primernum/segundonum;
			System.out.println("El resultado de la division es: "+resultado);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(Exception exc){ // Se ejecuta si ocurre algún error de lectura 
			System.out.println("Ingrese números y no letras.");
		}

	}
}

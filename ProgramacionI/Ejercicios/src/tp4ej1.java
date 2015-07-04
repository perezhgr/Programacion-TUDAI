//Solicite un número e indique si es positivo o negativo.

import java.util.Scanner;

public class tp4ej1 {

	public static void main(String[] args) {
		double numero;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número");
		numero = sc.nextDouble();
		
		if (numero < 0){
			System.out.println("El número es negativo");
		}
		else if(numero > 0){
			System.out.println("El número es positivo");
		}
		else{
			System.out.println("El número ingresado es 0. Es un número neutro.");
		}
	}
}

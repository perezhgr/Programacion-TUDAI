// Se solicita un número e indica si es positivo o negativo

import java.util.Scanner;
public class ejercicio1 {

	public static void main(String[] args) {
		int valor;
		
		Scanner sc = new Scanner(System.in);
		System.out.println ("Ingrese el valor: ");
		valor = sc.nextInt();
		
		if (valor < 0) {
			System.out.println ("El valor ingresado es negativo");
		}
		else {
			System.out.println ("El valor ingresado es positivo");
		}

	}

}

// Escribir un programa que dado un número n imprima la tabla de multiplicar de ese número.

import java.util.Scanner;
public class ejercicio4 {
	public static void main(String[] args) {
		int valor;
		final int max = 10;
		int resultado;
		
		System.out.println ("Ingrese el numero de la tabla que se desea obtener: ");
		Scanner sc = new Scanner(System.in);
		valor = sc.nextInt();

		for (int i = 0; i <= max; i++) {
			resultado = i * valor;
			System.out.println (valor + " X " + i + " = " + resultado);
		}
	}

}

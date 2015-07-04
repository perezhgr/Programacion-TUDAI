// Escribir un programa que muestre por pantalla una cuenta regresiva de números empezando desde uno ingresado por el usuario

import java.util.Scanner;
public class ejercicio1 {
	public static void main(String[] args) {
		int valor;
				
		Scanner sc = new Scanner(System.in);
		System.out.println ("Ingrese el valor: ");
		valor = sc.nextInt();
		
		while (valor != 0) {
			valor--;
			System.out.println (valor);
		}
	}

}

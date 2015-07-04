/*Escribir un programa que muestre por pantalla una cuenta
regresiva de números empezando desde uno ingresado por el
usuario */

import java.util.Scanner;

public class tp5ej1 {

	public static void main(String[] args) {
		
		int numero;		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		numero = sc.nextInt();
		
		for(int i = numero; i >= 0; i--){
			System.out.println(numero);
			numero--;
		}
		
	}

}

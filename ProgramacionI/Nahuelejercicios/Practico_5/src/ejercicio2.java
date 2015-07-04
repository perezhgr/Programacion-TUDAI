// Escriba un programa que calcule la raíz cuadrada de un
// número ingresado por el usuario. Estudiar el caso de valores
// negativos.

import java.io.*;
import java.util.Scanner;
public class ejercicio2 {
	public static void main(String[] args) {
		int valor;
		
		System.out.println("Introduzca el numero del que se desea obtener la raiz ");
        Scanner sc = new Scanner(System.in);
        valor = sc.nextInt();
		try {
			System.out.print("El valor de la raiz de " + valor + " es " + Math.sqrt(valor));
		}
		catch (Exception exc ) {
        	System.out.println(exc);
		}
	}
}

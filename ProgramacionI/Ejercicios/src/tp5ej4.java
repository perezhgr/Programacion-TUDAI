/*Escribir un programa que dado un número n imprima la tabla
de multiplicar de ese número.*/

import java.util.Scanner;
public class tp5ej4 {

	public static void main(String[] args) {
		final int MAX = 10;
		int numeroingresado;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número : ");
		
		numeroingresado = sc.nextInt();		
		System.out.println("La tabla del número " + numeroingresado + " es: ");
		
		for (int i = 0; i<=MAX ;i++){
			System.out.println(numeroingresado+" * "+i +" = "+numeroingresado*i);
		}
   }
}
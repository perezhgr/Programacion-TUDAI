/*Escribir un programa que pida el ingreso de dos strings y luego
los concatene, poniendo un espacio entre ambas cadenas de 
texto. Imprimir el texto concatenado por pantalla. */

import java.util.Scanner;

public class tp3ej2 {

	public static void main(String[] args) {
		String texto1, texto2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un texto");
		texto1 = sc.next();
		
		System.out.println("Ingrese un segundo texto");
		texto2 = sc.next();	
		
		System.out.println(texto1+" "+texto2);
	}
}

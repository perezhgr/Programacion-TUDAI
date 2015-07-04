/*Escribir un programa que solicite Nombre, DNI y ocupación,
 * y los imprima por pantalla.*/

import java.util.Scanner;

public class tp2ej1 {

	public static void main(String[] args) {
		
		String nombre,DNI,ocupacion;
		
		Scanner sc = new Scanner(System.in);
		System.out.println ("Ingrese el nombre:");
		nombre = sc.next(); 
		System.out.println ("Ingrese DNI: ");
		DNI = sc.next();
		System.out.println ("Ingrese Ocupacion: ");
		ocupacion = sc.next();
		
		System.out.println("Nombre :" + nombre);
		System.out.println("DNI :" + DNI);
		System.out.println("Ocupacion :" + ocupacion);
		
	}

}

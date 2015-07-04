/* Eje 1: Escribir un programa que solicite Nombre, DNI, Ocupacion y los imprima por pantalla */

import java.util.Scanner;
public class ejercicio1 {

	public static void main(String[] args) {
		String nombre;
		int edad;
		String ocupacion;
		Scanner sc = new Scanner(System.in);
		System.out.println ("Ingrese el nombre:");
		nombre = sc.nextLine();
		System.out.println ("Ingrese la edad: ");
		edad = sc.nextInt();
		System.out.println ("Ingrese la Ocupacion");
		ocupacion = sc.next();
		System.out.println("Nombre :" + nombre);
		System.out.println("Edad :" + edad);
		System.out.println("Ocupacion : " + ocupacion);
	}
}

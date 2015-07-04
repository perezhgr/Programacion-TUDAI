/* Eje 2: Escribir un programa que pida que se ingresen datos
necesarios para emitir una factura por la compra de dos
artículos de librería.
Nombre del cliente
- Nombre de artículo 1:
- Precio:
- Nombre de artículo 2:
- Precio:
- Precio total:  */

import java.util.Scanner;
public class ejercicio2 {

	public static void main(String[] args) {
		String nombre;
		String nombreart1;
		double precio1;
		String nombreart2;
		double precio2;
		double total;
		
		Scanner sc = new Scanner(System.in);
		System.out.println ("Ingrese el nombre del cliente:");
		nombre = sc.nextLine();
		System.out.println ("Ingrese el primer articulo: ");
		nombreart1 = sc.next();
		System.out.println ("Ingrese el precio del articulo");
		precio1 = sc.nextDouble();
		System.out.println ("Ingrese el segundo articulo: ");
		nombreart2 = sc.next();
		System.out.println ("Ingrese el precio del articulo");
		precio2 = sc.nextDouble();
		
		total = precio1 + precio2;
		
		System.out.println("Nombre : " + nombre);
		System.out.println("Articulo 1 : " + nombreart1);
		System.out.println("Precio : " + precio1);
		System.out.println("Articulo 2 : " + nombreart2);
		System.out.println("Precio: " + precio2);
		System.out.println("Total: " + total);
	}
}

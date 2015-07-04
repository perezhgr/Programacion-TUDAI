/*Escribir un programa que pida que se ingresen datos
necesarios para emitir una factura por la compra de dos
artículos de librería, de la siguiente forma:
• Nombre del cliente
• Nombre de artículo 1: 
• Precio:

• Nombre de artículo 2:
• Precio:
• Precio total:*/

import java.util.Scanner;
public class tp2ej2 {
	public static void main(String[] args) {
		
		String nombre_del_cliente,articulo1,articulo2;
		double precio1,precio2,preciototal;
		
		Scanner sc = new Scanner(System.in);
		System.out.println ("Nombre del cliente:");
		nombre_del_cliente = sc.next();
		
		System.out.println ("Primer articulo: ");
		articulo1 = sc.next();
		
		System.out.println ("Primer precio: ");
		precio1 = sc.nextDouble();
		
		System.out.println ("Segundo articulo: ");
		articulo2 = sc.next();
		
		System.out.println ("Segundo precio: ");
		precio2 = sc.nextDouble();
		
		preciototal = precio1 + precio2;
		
		System.out.println("Nombre del cliente:" + nombre_del_cliente);
		System.out.println("Primer articulo :" + articulo1);
		System.out.println("Precio1 : $ "+ precio1);
		System.out.println("Segundo articulo :" + articulo2);
		System.out.println("Precio2 : $ "+precio2);
		System.out.println("Precio Total : $ "+ preciototal);

	}
}

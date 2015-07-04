/*Escribir un programa que permita ingresar 5 números de a
uno por vez y que los muestre por pantalla en orden inverso */

import java.util.Scanner;
public class ejercicio4 {

	public static void main(String[] args) {
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		
		Scanner sc = new Scanner(System.in);
		System.out.println ("Ingrese el primer valor: ");
		var1 = sc.nextInt();
		System.out.println ("Ingrese el segundo valor: ");
		var2 = sc.nextInt();
		System.out.println ("Ingrese el tercer valor: ");
		var3 = sc.nextInt();
		System.out.println ("Ingrese el cuarto valor: ");
		var4 = sc.nextInt();
		System.out.println ("Ingrese el quinto valor: ");
		var5 = sc.nextInt();
		
		System.out.println(var5);
		System.out.println(var4);
		System.out.println(var3);
		System.out.println(var2);
		System.out.println(var1);

	}

}

/* Escribir un programa que permita ingresar 4 caracteres de a
uno por vez y los muestre por pantalla de la siguiente manera:

• ----------
• a
• ----------
• b
• ----------
• c
• ----------
• d
• ---------- */

import java.util.Scanner;
public class ejercicio3 {

	public static void main(String[] args) {
		String var1;
		String var2;
		String var3;
		String var4;
		
		Scanner sc = new Scanner(System.in);
		System.out.println ("Ingrese el primer valor: ");
		var1 = sc.next();
		System.out.println ("Ingrese el segundo valor: ");
		var2 = sc.next();
		System.out.println ("Ingrese el tercer valor: ");
		var3 = sc.next();
		System.out.println ("Ingrese el cuarto valor: ");
		var4 = sc.next();
		
		System.out.println("-------------");
		System.out.println(var1);
		System.out.println("-------------");
		System.out.println(var2);
		System.out.println("-------------");
		System.out.println(var3);
		System.out.println("-------------");
		System.out.println(var4);
		System.out.println("-------------");

	}

}

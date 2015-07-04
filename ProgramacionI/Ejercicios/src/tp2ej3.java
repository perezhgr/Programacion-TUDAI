/*Escribir un programa que permita ingresar 4 caracteres de a
uno por vez y los muestre por pantalla de la siguiente manera:
• ----------
a
• ----------
• b
• ----------
• c
• ----------
• d
• ----------*/

import java.util.Scanner;

public class tp2ej3 {
	public static void main(String[] args) {
		
		String char1,char2,char3,char4;
		
		Scanner sc = new Scanner(System.in);
		char1 = sc.next();
		System.out.println (char1);
	
		char2 = sc.next();
		System.out.println (char2);
		
		char3 = sc.next();
		System.out.println (char3);
		
		char4 = sc.next();
		System.out.println (char4);
		}
}

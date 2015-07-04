/*Escribir un programa que pida el nombre del usuario y lo
salude. Luego, debe repetir el saludo mientras el usuario no
ingrese un 0.*/

import java.util.Scanner;
public class tp5ej6 {

	public static void main(String[] args) {
		
		String nombreusuario,fin="0";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su nombre:");
		nombreusuario = sc.next();		
		
		do{
			System.out.println("Hola "+ nombreusuario + "!");
		}while(nombreusuario !=fin);
}
}
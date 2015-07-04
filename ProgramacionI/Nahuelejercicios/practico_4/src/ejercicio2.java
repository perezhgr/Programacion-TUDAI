// Escribir un programa que permita ingresar n números enteros
// de a uno por vez y los muestre por pantalla de la siguiente
// manera:
// ----------
// 3 1°
// ----------
// 4 2°
// ----------
// ...
// ----------
// -1 n°
// ----------

import java.util.Scanner;
public class ejercicio2 {
	public static void main(String[] args) {
		int valor = -1;
		int numeral = 0;
				
		System.out.println ("Para detener la carga ingrese 0");
		Scanner sc = new Scanner(System.in);
		valor = sc.nextInt();
		
		while (valor != 0) {
			numeral++;
			System.out.println ("--------------");
			System.out.println ( valor + "    " + numeral + "°");
			valor = sc.nextInt();
		}
	}

}

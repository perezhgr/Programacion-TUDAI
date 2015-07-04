/*Escribir un programa que permita ingresar 5 números de a
uno por vez y que los muestre por pantalla en orden inverso:
• Ej:
• Ingreso se debe mostrar

23                    3
4                    100
2         =>          2
100                   4
3					 23 
*/

import java.util.Scanner;

public class tp2ej4 {
	public static void main(String[] args) {
		
		int num1,num2,num3,num4,num5;
		
		Scanner in = new Scanner(System.in);
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();
		num4 = in.nextInt();
		num5 = in.nextInt();
		
		System.out.println ("\n"+num5+"\n"+num4+"\n"+num3+"\n"+num2+"\n"+num1);
		
		}
}

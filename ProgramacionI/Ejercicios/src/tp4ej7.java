/* Construir un programa que calcule el índice de masa corporal
de una persona (IMC = peso [kg] / altura2 [m]) e indique el
estado en el que se encuentra esa persona en función del
valor de IMC */

import java.util.Scanner;

public class tp4ej7 {

	public static void main(String[] args) {
		double peso,altura,IMC;

		Scanner sc = new Scanner (System.in);
		System.out.println("Ingrese su peso :");
		peso = sc.nextDouble();

		System.out.println("Ingrese su altura :");
		altura = sc.nextDouble();

		IMC = peso/(altura*altura);

		if (IMC < 16)
			System.out.println("Criterio de ingreso en hospital");

		else if ( (IMC >= 16 ) && (IMC < 17) )
			System.out.println("Infrapeso");

		else if ( (IMC >= 17 ) && (IMC < 18) )
			System.out.println("Bajo peso");

		else if ( (IMC >= 18 ) && (IMC < 25) )
			System.out.println("Peso normal (saludable)");

		else if ( (IMC >=25 ) && (IMC < 30) )
			System.out.println("Sobrepeso (obesidad de grado I)");

		else if ( (IMC >= 30 ) && (IMC < 35) )
			System.out.println("Sobrepeso crónico (obesidad de grado II)");

		else if ( (IMC >= 35 ) && (IMC <= 40) )
			System.out.println("Obesidad premórbida (obesidad de grado III)");

		else //IMC >40 
			System.out.println("Obesidad mórbida (obesidad de grado IV)");

	}
}

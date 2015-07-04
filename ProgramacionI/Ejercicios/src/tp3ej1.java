/*Escribir un programa que dados tres números ingresados por
el usuario multiplique los primeros dos y al resultado le reste
el tercero.*/

import java.util.Scanner;

public class tp3ej1 {

	public static void main(String[] args) {
		int numero1,numero2,numero3,resultadofinal;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número : ");
		numero1 = sc.nextInt();
		System.out.println("Ingrese un número : ");
		numero2 = sc.nextInt();
		System.out.println("Ingrese un número : ");
		numero3 = sc.nextInt();
		
		resultadofinal = (numero1*numero2)-numero3;
		System.out.println("El resultado de la multiplicación de los 2 primeros numeros restado con un tercero es: " +resultadofinal );
		

	}
}

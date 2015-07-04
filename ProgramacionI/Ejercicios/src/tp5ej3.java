/*Una persona desea invertir $1000.00 en un banco, el cual le
otorga un 2% de interés mensual. Escribir un programa que
imprima cuál será la cantidad de dinero que esta persona
tendrá al cabo de un año si reinvierte todo el dinero cada mes.*/

import java.util.Scanner;
public class tp5ej3 {

	public static void main(String[] args) {
		
		final int CANTIDADMESES = 12;
		final double TASADEINTERES = 2;
		double inversion = 1000,interesmensual=0;		
		
		for (int mes = 1; mes<=CANTIDADMESES ;mes++){
			interesmensual = (TASADEINTERES*inversion)/100;
			inversion += interesmensual ;
		}
		System.out.println("Dinero al cabo de un año: $"+inversion);

	}

}

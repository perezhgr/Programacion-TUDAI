/*Dada la operación 4 / 2 – 2 * 5, escribir el programa
correspondiente para que dé como resultado:
• -8
• -0,5
• 0
• Exception “/ by zero”
 */

import java.util.Scanner;

public class tp3ej3 {

	public static void main(String[] args) {
		int  entero1 =4,
			 entero2=2,
			 entero3=5,
			 resultado;
		
		double real1=4,
				real2=2,
				real3=5,
				resultadofinal;
		
		
		//Primera asignacion
		resultado=entero1/entero2-entero2*entero3;		
		System.out.println("El primer resultado es: "+resultado);
				
		//Segunda asignacion
		resultadofinal = real1/(real2-(real2*real3));
		System.out.println("El tecer resultado es: "+ resultadofinal);
		
		//Tercera asignacion
		resultado= ((entero1/entero2)-entero2)*entero3;		
		System.out.println("El tercer resultado es: "+resultado);
		
		//Cuarta asignacion
		resultado= entero1/(entero2-entero2)*entero3;		
		System.out.println("El tercer resultado es: "+resultado);
		
	}
}

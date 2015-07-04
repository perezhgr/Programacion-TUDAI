/*Solicite 3 números e imprima “creciente” si los tres números
están en orden creciente, “decreciente” si están en orden
decreciente o “error” si no cumplen ningún orden*/


import java.util.Scanner;

public class tp4ej5 {

	public static void main(String[] args) {
		double real1,real2,real3;

		Scanner sc = new Scanner (System.in);
		System.out.println("Ingrese 3 números :");
		real1 = sc.nextDouble();
		real2 = sc.nextDouble();
		real3 = sc.nextDouble();

		if( (real1 > real2)  && (real1 > real3) ){
			System.out.println("El orden de los números es decreciente");
		}  
		else if( (real1 < real2)  && (real1 < real3) ){
			System.out.println("El orden de los números es creciente");
		}
		else{
			System.out.println("Error");
		}
	}
}

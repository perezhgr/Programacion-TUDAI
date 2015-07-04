/*Construir un programa que calcule el factorial de un número dado.*/

import java.util.Scanner;

public class tp7ej10 {

	public static boolean VerificaNumero(int x){
		if( x>=0 )
			return true;
		else	
			return false;		
	}

	public static int Factorial(int n){
		int i=1;int r=n;
		if ( (n == 0) || ( n ==1 ) ){
			r = 1;
		}
		else{
			while (i < n){
				r*=(n-i);
				i++;
			}
		}
		return r;
	}

	public static void main(String[] args) {
		int numero = 0;

		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese un número: ");
			numero = sc.nextInt();

			if(VerificaNumero(numero))
				System.out.println("El factorial de "+numero+" es: "+Factorial(numero));
			else
				System.out.println("Error!.Debe ingresar un número positivo (0 inclusive).");			   
		}	   
		catch(Exception exc){
			System.out.println("Error!.Debe ingresar sólo números!.");
		}
	}
}

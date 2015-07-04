/*Contruir una rutina que devuelva verdadero o falso dependiendo de 
 * di una caracter dado es una letra miniscula o mayúscula.*/

import java.util.Scanner;

public class tp7ej6 {
	
	public static boolean VerificaLetra(char x){
		if(Character.isUpperCase(x))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		char letra=' ';
		
		try{
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Ingrese una letra: ");
		   letra = sc.next().charAt(0);
		   
		   if(VerificaLetra(letra))
			   System.out.println("La letra es mayúscula.");
		   else
			   System.out.println("La letra es minúscula.");
		}	   
		catch(Exception exc){
			System.out.println("Error!.Debe ingresar sólo números.");
		}

	}

}

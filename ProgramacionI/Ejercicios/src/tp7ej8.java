/*Construir una rutina que calcule el valor de la multiplicación de dos naturales.
 * Usar sólo sumas.*/

import java.util.Scanner;

public class tp7ej8 {
	
	public static boolean VerificaNumero(int x,int y){
		if( (x<0) && (y<0) )
			return false;
		else	
			return true;		
	}
	
	public static int MultiplicaNaturales(int a,int b){
		int resultado;
		
		if (b == 0){
			resultado = 0;
		}
		else if(b == 1){
			resultado = a;
		}
		else{
			resultado = a;
			while (b > 1){
				resultado +=a;
				b--;
			}
		}
		return resultado;
	}

	public static void main(String[] args) {
		int natural1 = 0,natural2 = 0;
		
		try{
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Ingrese un número: ");
		   natural1 = sc.nextInt();
		   System.out.println("Ingrese otro número: ");
		   natural2 = sc.nextInt();
		   
		   if(VerificaNumero(natural1,natural2))
			   System.out.println(natural1+" * "+natural2+" : "+MultiplicaNaturales(natural1,natural2));
		   else
			   System.out.println("El número ingresado no es un número natural.");			   
		}	   
		catch(Exception exc){
			System.out.println("Error!.Ingrese números.");
		}
    }
}

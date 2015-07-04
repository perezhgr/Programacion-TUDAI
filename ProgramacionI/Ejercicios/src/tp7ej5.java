//Construir una rutina que devuelva el valor central de 3 enteros dados como parámetros.

import java.util.Scanner;

public class tp7ej5 {

	/*public static boolean VerificaOrden(int x,int y, int z){
		if( (x<=y) && (y<=z) || (x>y) && (y>z) )
			return true;
		else
			return false;
	}*/
	public static void OrdenarEnteros(int x,int y,int z){
		int aux=0;
		if( ( (x<=y) && (y<=z) ) || ( (x>y) && (y>z) ) ){
		aux = x;
		x = y;
		y = aux;
		}
		return;
	}
	
	public static int DevuelveValorCentral(int d,int e,int f){
		return e;
	}
	
	public static void main(String[] args) {
		int entero1 = 0, entero2 = 0,entero3 = 0;
		
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese un número :");
			entero1 = sc.nextInt();
			System.out.println("Ingrese un número :");
			entero2 = sc.nextInt();
			System.out.println("Ingrese un número :");
			entero3 = sc.nextInt();
			
			
			
				OrdenarEnteros(entero1,entero2,entero3);
				System.out.println("El valor central es: "+DevuelveValorCentral(entero1,entero2,entero3));
			
		}
		catch(Exception exc){
			System.out.println("Error!.Ingrese números enteros.");
		}

	}

}

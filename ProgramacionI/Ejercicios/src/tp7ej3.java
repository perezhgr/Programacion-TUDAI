/*Escribir un programa que pida el ingreso de dos números por
teclado, que chequee si ambos son positivos y que luego 
calcule el promedio de ambos.*/

import java.util.Scanner;
public class tp7ej3 {
	
	public static boolean ChequeaNumeroPositivo(double a){
		if(a >=0)
			return true;
		else
			return false;
	}
	
	public static double CalculaPromedio(double x,double z){
		return (x+z)/2;
	}
	
	public static void main(String[] args) {
		double valor1 =0,valor2=0;
			
		try{
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Ingrese un número");
		   valor1= sc.nextDouble();
		   if(ChequeaNumeroPositivo(valor1)){
			   System.out.println("Ingrese otro número: ");
			   valor2 = sc.nextDouble();
			   if(ChequeaNumeroPositivo(valor2))
				   System.out.println("El promedio de "+valor1+" y "+valor2+" es: "+ CalculaPromedio(valor1,valor2));
			   else
				   System.out.println("El número ingresado no es positivo.Intente nuevamente.");
		   }
		   else
			   System.out.println("El número ingresado no es positivo.Intente nuevamente.");
		}	   
		catch(Exception exc){
			System.out.println("Error!.Debe ingresar sólo números.");
		}
	}
}

/*Escribir un método que calcule el mayor de dos números. Usar
ese método para calcular el máximo de una serie de números 
ingresados por el usuario.
 */
import java.util.Scanner;
public class tp7ej1 {

	public static double CalculaNumeroMayor(double a, double b){
		if(a > b)return a;
		else if(a < b)return b;
		else		return a;
	}

	public static void main(String[] args) {
		final int MAX=4;
		int contador=1;
		double valor1 =0,valor2=0;

		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese un valor");
			valor1= sc.nextDouble();
			valor1=CalculaNumeroMayor(valor1,valor1);
			/*Esto fue necesario para poder cubrir el caso en que el primer número ingresado 
		   fuera negativo.*/

			do{
				System.out.println("Ingrese un valor");
				valor2= sc.nextDouble();
				valor1=CalculaNumeroMayor(valor1,valor2);
				contador ++;
			}
			while(contador<=MAX);

			System.out.println("El máximo valor ingresado es: "+valor1);
		}
		catch(Exception exc){
			System.out.println("Error!.Debe ingresar sólo números.");
		}
	}
}

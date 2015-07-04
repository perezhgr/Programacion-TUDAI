// Escribir un programa que pida el ingreso de dos números por
// teclado, que chequee si ambos son positivos y que luego
// calcule el promedio de ambos.

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio3 {
	
	public static int promedio(int valor1, int valor2)
	{
		int prom = (valor1 + valor2)/2;
		return prom;
	}
	
	public static boolean positivo(int valor)
	{
		if (valor >= 0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		int valor1 = 0;
		int valor2 = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			try
			{
				System.out.println("Introduzca el primer numero positivo");
		        valor1 = new Integer(entrada.readLine());
		        System.out.println("Introduzca el segundo numero positivo");
		        valor2 = new Integer(entrada.readLine());
			}
			catch(Exception exc)
			{
				System.out.println("Los valores ingresados deben ser positivos");
				valor1 = -1;
				valor2 = -1;
			}
		}
		while ((positivo(valor1) != true) || (positivo(valor2) != true));
		
		System.out.println("El promedio entre los dos numeros es: " + promedio(valor1, valor2));
	}
}

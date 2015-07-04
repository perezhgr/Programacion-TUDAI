// Escribir un programa que transforme una temperatura dada
// en grados Fahrenheit a grados Celsius. Formula C=(F-32)/1,8

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio4 {
	
	public static void temperatura(double farenheit)
	{
		System.out.println("La temperatura en Celcius es: " + (farenheit - 32)/1.8);
	}
	
	public static void main(String[] args) {
		double farenheit = 0;
		boolean correcto;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			try
			{
				System.out.println("Ingrese la temperatura en farenheit");
				farenheit = new Double(entrada.readLine());
				correcto = true;
			}
			catch (Exception exc)
			{
				System.out.println("El valor ingresado no corresponde a una temperatura");
				correcto = false;
			}
		}
		while (correcto == false);
		
		temperatura(farenheit);
	}
}

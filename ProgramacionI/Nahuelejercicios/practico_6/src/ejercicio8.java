// Construir una rutina que calcule el valor de la multiplicación de dos naturales. Usar sólo sumas.

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio8 {

	public static int multiplicacion(int valor1, int valor2)
	{
		int resultado = 0;
		
		for (int i = 0; i < valor2; i++ )
			resultado = valor1 + resultado;
		return resultado;
	}
	
	public static void main(String[] args) {
		int valor1 = 0, valor2 = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			try
			{
				System.out.println("Ingrese el numero a multiplicar");
				valor1 = new Integer(entrada.readLine());
				System.out.println("Ingrese el multiplicador");
				valor2 = new Integer(entrada.readLine());
			}
			catch (Exception exc)
			{
				System.out.println("El valor ingresado no es un numero");
			}
		}
		while (!((valor1 >= 0) && (valor2 >= 0)));
		
		System.out.println(valor1 + " * " + valor2 + " = " + multiplicacion(valor1, valor2));
	}
}

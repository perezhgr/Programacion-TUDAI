// Construir una rutina que devuelva el valor central de tres enteros dados como parámetros.

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio5 {

	public static void central(int valor1, int valor2, int valor3)
	{
		if (((valor1 > valor2) && (valor1 < valor3)) || ((valor1 < valor2) && (valor1 > valor3)))
		{
			System.out.println("El valor central es: " + valor1);
		}
		else
		{
			if (((valor2 > valor1) && (valor2 < valor3)) || ((valor2 < valor1) && (valor2 > valor3)))
			{
				System.out.println("El valor central es: " + valor2);
			}
			else
			{
				System.out.println("El valor central es: " + valor3);
			}
		}
	}
		
	
	public static void main(String[] args) {
		boolean correcto;
		int valor1 = 0, valor2 = 0, valor3 = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			try
			{
				System.out.println("Ingrese el primer valor");
				valor1 = new Integer(entrada.readLine());
				System.out.println("Ingrese el segundo valor");
				valor2 = new Integer(entrada.readLine());
				System.out.println("Ingrese el tercer valor");
				valor3 = new Integer(entrada.readLine());
				correcto = true;
			}
			catch (Exception exc)
			{
				System.out.println("El valor ingresado es invalido");
				correcto = false;
			}
		}
		while (correcto == false);
		
		central(valor1, valor2, valor3);
	}

}

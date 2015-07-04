// Construir una rutina que devuelva la potencia de dos de un numero dado.

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio7 {

	public static int potencia(int valor)
	{
		return valor*valor;
	}
	
	public static void main(String[] args) {
		int valor = 0;
		boolean correcto;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			try
			{
				System.out.println("Ingrese ingrese el numero del que desea obtener la potencia");
				valor = new Integer(entrada.readLine());
				correcto = true;
			}
			catch (Exception exc)
			{
				System.out.println("El valor ingresado no corresponde a un numero");
				correcto = false;
			}
		}
		while (correcto == false);
		
		System.out.println(valor + "^2 = " + potencia(valor));
	}

}

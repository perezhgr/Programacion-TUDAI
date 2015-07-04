import java.io.BufferedReader;
import java.io.InputStreamReader;

// Construya un programa que calcule el factorial de un numero dado. Ej: factorial(4) = 4*3*2*1 = 24.

public class ejercicio10 {

	public static int factorial(int valor)
	{
		int resultado = valor;
		for (int i = (valor - 1); i > 0; i--)
			resultado = resultado * i;
		return resultado;
	}
	
	public static void main(String[] args) {
		int valor = 0;
		boolean correcto;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			try
			{
				System.out.println("Ingrese el numero a calcular su factorial");
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
		
		System.out.println("Factorial(" + valor + ") = " + factorial(valor));
	}
}

//Dados dos enteros A y B, construir un programa que calcule A
//elevado a la B, utilizando el procedimiento/función del ejercicio anterior.

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio9 {

	public static int multiplicacion(int valor1, int valor2)
	{
		int resultado = 0;
		
		for (int i = 0; i < valor2; i++ )
			resultado = valor1 + resultado;
		return resultado;
	}
	
	public static int potencia(int a, int b){
		int resultado = a;
		
		for (int i = 1 ; i < b; i++) {
			resultado = multiplicacion(resultado, a);
		}
		return resultado;
    }
	
	public static void main(String[] args) {
		int a = 0, b = 0;
		boolean correcto;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			try
			{
				System.out.println("Ingrese el numero a elebar");
				a = new Integer(entrada.readLine());
				System.out.println("Ingrese la potencia");
				b = new Integer(entrada.readLine());
				correcto = true;
			}
			catch (Exception exc)
			{
				System.out.println("El valor ingresado no corresponde a un numero");
				correcto = false;
			}
		}
		while (correcto == false);
		
		System.out.println(a + " ^ " + b + " = " + potencia(a, b));
	}
}

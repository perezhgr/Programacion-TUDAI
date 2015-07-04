// Escribir un método que multiplique dos números. Usar ese
// método para calcular la potencia n de un número ingresado
// por teclado.

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio2 {
	
	public static int multiplicacion(int valor1, int valor2)
	{
		return valor1 * valor2;
	}
	
	public static int potencia(int valor1, int valor2){
		int resultado = valor1;
		
		for (int i = 1 ; i < valor2; i++) {
			resultado = multiplicacion(resultado, valor1);
		}
		return resultado;
    }
	
	public static void main(String[] args) {
		int valor = 0;
		int potencia = 0;
		boolean correcto;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		do
		{
			try
			{
				System.out.println("Ingrese el numero a elebar");
				valor = new Integer(entrada.readLine());
				System.out.println("Ingrese la potencia");
				potencia = new Integer(entrada.readLine());
				correcto = true;
			}
			catch (Exception exc)
			{
				System.out.println("El valor ingresado no corresponde a un numero");
				correcto = false;
			}
		}
		while (correcto == false);
		
		System.out.println(valor + " ^ " + potencia + " = " + potencia(valor, potencia));
	
    }
}

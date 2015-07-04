// El periodo, T (en segundos), de un pendulo que oscila viene dado por la expresion
// T=2PI(L/g)^0.5 donde L es la longitud del pendulo en metros y g es la gravedad en
// metros por segundo al cuadrado. Construir una rutina periodo para que calcule y 
// devuelva el valor de T dado L como parametro de la funcion y g como constante del 
// programa. Usar para la raiz res = (float) Math.sqrt(nro)

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio2 {
	static final double g = 9.8;
	
	public static double periodo(double l)
	{
		double resultado;
		resultado = 2*Math.PI*((float)Math.sqrt(l/g));
		return resultado;
	}
	public static void main(String[] args) {
		double l = 0;
		boolean correcto;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			try
			{
				System.out.println("Ingrese la longitud del pendulo");
				l = new Double(entrada.readLine());
				correcto = true;
			}
			catch (Exception exc)
			{
				System.out.println("El valor ingresado no corresponde a una longitud");
				correcto = false;
			}
		}
		while (correcto != true);
		System.out.println("El periodo es: " + periodo(l));
	}

}

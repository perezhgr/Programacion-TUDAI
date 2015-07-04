import java.io.BufferedReader;
import java.io.InputStreamReader;

// Hacer un programa que incluya un metodo que devuelva verdadero o falso dependiendo
// de si una fecha (dado el dia, mes y año como parametros) es valido o no.

public class ejercicio1 {
	
	public static boolean compruebaDia(int dia)
	{
		if ((dia > 0) && (dia <= 31))
			return true;
		else
			return false;
	}
	
	public static boolean compruebaMes(int mes)
	{
		if ((mes > 0) && (mes <= 12))
			return true;
		else
			return false;
	}
	
	public static boolean compruebaAnio(int anio)
	{
		if ((anio >= 2000) && (anio <= 3000))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		int dia = 0, mes = 0, anio = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			try
			{
				System.out.println("Ingrese ingrese el dia");
				dia = new Integer(entrada.readLine());
				System.out.println("Ingrese ingrese el mes");
				mes = new Integer(entrada.readLine());
				System.out.println("Ingrese ingrese el año");
				anio = new Integer(entrada.readLine());
			}
			catch (Exception exc)
			{
				System.out.println("El valor ingresado no corresponde a una fecha");
			}
		}
		while (!(compruebaDia(dia) && compruebaMes(mes) && compruebaAnio(anio)));
		System.out.println("La fecha ingresada es valida");
	}

}

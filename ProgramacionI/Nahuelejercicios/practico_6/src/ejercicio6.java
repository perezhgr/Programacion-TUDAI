import java.io.BufferedReader;
import java.io.InputStreamReader;

// Construir una rutina que devuelva verdadero o falso
// dependiendo de si un carácter dado es una letra minúscula o
// no mayuscula.

public class ejercicio6 {

	public static boolean mayuscula(char valor)
	{
		if(Character.isUpperCase(valor))
			return true;
		else
			return false;
		
	}
	
	public static void main(String[] args) {
		char valor = ' ';
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			try
			{
				System.out.println("Ingrese una letra");
				valor = entrada.readLine().charAt(0);
			}
			catch (Exception exc)
			{
				System.out.println("El valor ingresado no es una letra");
			}
		}
		while (!(((valor >= 'a') && (valor <= 'z')) || ((valor >= 'A') && (valor <= 'Z'))));
		
		System.out.println(mayuscula(valor));
	}

}

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Hacer un programa que elimine las secuencias de tamaño N de números distintos de cero de un arreglo. Solicitar el valor
// de N al usuario.

public class ejercicio10 {

	public static int max = 9;
	public static int min = 0;
	public static int cero = 0;
	
	public static void main(String[] args) 
	{
		int arreglo[] = {1,1,1,1,1,1,0,1,1,1};
		int posicion = buscaSecuencia(arreglo, ingresaValor());
		
		if (posicion != -1)
		{
			System.out.println("Arreglo original:");
			imprimeArreglo(arreglo);
			borraSecuencia(arreglo, posicion);
			System.out.println("Arreglo con secuencia borrada:");
			imprimeArreglo(arreglo);
		}
		else
			System.out.println("Dentro del arreglo no hay secuencias del tamaño especificado");
	}
	
	public static void borraSecuencia(int arreglo[], int posicion)
	{
		int cont = posicion;
		while ((cont <= max) && (arreglo[cont] != 0))
		{
			arreglo[cont] = cero;
			cont ++;
		}
	}
	
	public static int buscaSecuencia(int arreglo[], int valor)
	{
		int inicioBorrar = -1, posicion = 0;
		int inicio = buscaPrincipio(arreglo, posicion);
		int fin = buscaFin(arreglo, inicio);
		
		if (inicio != max + 1)
		{
			while ((fin <= max) && (inicio <= max) && (inicioBorrar == -1))
			{
				int cantidad = fin - inicio +1;
				if (valor == cantidad)
				{
					inicioBorrar = inicio;
					inicio = buscaPrincipio(arreglo, fin + 1);
					fin = buscaFin(arreglo, inicio);
				}
				else
				{
					inicio = buscaPrincipio(arreglo, fin + 1);
					fin = buscaFin(arreglo, inicio);
					inicioBorrar = -1;
				}
					
			}
			return inicioBorrar;
		}
		else
			return -1;
	}
	
	public static int buscaPrincipio(int arreglo[], int inicio)
	{
		int cont = inicio;
		while ((cont <= max) && (arreglo[cont] == 0))
			cont++;
		return cont;
	}
	
	public static int buscaFin(int arreglo[], int posInicio)
	{
		int cont = posInicio;
		while ((cont <= max) && (arreglo[cont] != 0))
			cont++;
		return cont -1;
	}
	
	public static void imprimeArreglo(int arreglo[])
    {
       	for(int i=0; i <= max; i++)
       	{
       		System.out.println(arreglo[i]);
       	}
    }
	
	public static int ingresaValor()
	{
      	BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      	boolean correcto = false;
      	int valor = 0;
      	
      	while(correcto != true)
      	{
	        	try {
					System.out.println("Introduzca el tamaño de la secuencia que se desea eliminar");
			        valor = new Integer(entrada.readLine());
			        correcto = valorValido(valor);
				}
				catch (Exception exc) { 
					System.out.println("Ingreso valor invalido");
					correcto = false;
					valor = 0;
				}
      	}
      	return valor;
	}
	
	public static boolean valorValido(int valor)
	{
		if(valor >= min)
			return true;
		else
			System.out.println("El valor ingresado no es valido");
			return false;
	}
}
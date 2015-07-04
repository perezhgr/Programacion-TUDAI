// Hacer un programa que devuelva la posición de inicio y fin
// de la primer secuencia de números distinta de ceros.

public class ejercicio8 {

	public static int max = 9;
	public static int min = 0;
	
	public static void main(String[] args) 
	{
		int arreglo[] = {0,0,0,1,1,0,0,0,0,0};
		int inicio = buscaPrincipio(arreglo);
		int fin = 0;
	
		if (inicio <= max)
		{
			fin = buscaFin(arreglo, inicio);
			System.out.println("La secuencia se encuentra entre la posicion: " + inicio + " y la posicion: " + fin);
		}
		else
			System.out.println("El arreglo no contiene ninguna secuencia distinta de ceros");		
	}
	
	public static int buscaPrincipio(int arreglo[])
	{
		int cont = 0;
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
}
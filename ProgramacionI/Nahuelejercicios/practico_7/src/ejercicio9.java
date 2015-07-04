// Hacer un programa que devuelva la posición de inicio de la
// mayor secuencia de números distintos de ceros.

public class ejercicio9 {

	public static int max = 9;
	public static int min = 0;
	
	public static void main(String[] args) 
	{
		int arreglo[] = {0,1,1,0,0,0,1,1,1,0};
		int resultado = masLarga(arreglo);
		
		if (resultado != -1)
			System.out.println("El inicio de la secuencia mas larga esta en la posicion: " + resultado);
		else
			System.out.println("Dentro del arreglo no hay secuencias distintas de cero");
	}
	
	public static int masLarga(int arreglo[])
	{
		int mayor = 0, inicioMayor = 0, posicion = 0;
		int inicio = buscaPrincipio(arreglo, posicion);
		int fin = buscaFin(arreglo, inicio);
		
		if (inicio != max +1)
		{
			while ((fin <= max) && (inicio <= max))
			{
				int cantidad = fin - inicio +1;
				if (mayor < cantidad)
				{
					mayor = cantidad;
					inicioMayor = inicio;
					inicio = buscaPrincipio(arreglo, fin + 1);
					fin = buscaFin(arreglo, inicio);
				}
				else
				{
					inicio = buscaPrincipio(arreglo, fin + 1);
					fin = buscaFin(arreglo, inicio);
				}
					
			}
			return inicioMayor;
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
}
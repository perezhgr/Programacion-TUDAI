// Hacer un programa que elimine de un arreglo todas las ocurrencias de una secuencia patrón dada por otro arreglo.

public class ejercicio11 {
	
	public static int max = 9, maxArr2 = 4;
	public static int min = 0;
	public static int cero = 0;
	
	public static void main(String[] args) 
	{
		int arreglo[] = {0,0,0,0,0,0,1,1,3,4};
		int arreglo2[] = {1,2,3,4};
		int posicion = buscaSecuencia(arreglo);
		
		if ((posicion != -1) && (coincide(arreglo, arreglo2, posicion) != false))
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
	
	public static boolean coincide(int arreglo[], int arreglo2[], int posicion)
	{
		int cont = posicion, cont1 = 0;
		boolean correcto = false;
		
		while ((cont != maxArr2) && (arreglo[cont] == arreglo2[cont1]))
		{
			correcto = true;
			cont ++;
			cont1 ++;
		}
		return correcto;
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
	
	public static int buscaSecuencia(int arreglo[])
	{
		int inicioSecuencia = -1, posicion = 0;
		int inicio = buscaPrincipio(arreglo, posicion);
		int fin = buscaFin(arreglo, inicio);
		
		if (inicio != max + 1)
		{
			while ((fin <= max) && (inicio <= max) && (inicioSecuencia == -1))
			{
				int cantidad = fin - inicio +1;
				if (cantidad == maxArr2)
				{
					inicioSecuencia = inicio;
					inicio = buscaPrincipio(arreglo, fin + 1);
					fin = buscaFin(arreglo, inicio);
					
				}
				else
				{
					inicio = buscaPrincipio(arreglo, fin + 1);
					fin = buscaFin(arreglo, inicio);
					inicioSecuencia = -1;
				}
					
			}
			return inicioSecuencia;
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
}
// Hacer un programa que cargue un arreglo de tamaño
// MAX=10 con números enteros aleatorios entre 0 y 100 de
// tal manera que quede ordenado decrecientemente. Finalmente imprima el arreglo.

public class ejercicio7 {

	public static int max = 9;
	public static int min = 0;
	
	public static void main(String[] args) 
	{
		int arreglo[] = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		for(int i = min; i <= max; i++)
		{
			insertaOrdenado((int)(Math.random()*100), arreglo);
		}
		System.out.println("Arreglo con insercion: ");
		imprimeArreglo(arreglo);
	}
	
	public static void insertaOrdenado(int valor, int arreglo[])
	{
		int posicion = buscaPosicion(arreglo, valor);
		corrimientoDerecha(posicion, arreglo);
		arreglo[posicion] = valor;
	}
	
	public static int buscaPosicion(int arreglo[], int valor)
	{
		int cont = 0;
		while ((cont < max) && (arreglo[cont] > valor))
		{
			cont++;
		}
		return cont;
	}
	
	public static void corrimientoDerecha(int posicion, int arreglo[])
	{
		for(int i = max; i > posicion; i--)
		{
			arreglo[i] = arreglo[i-1];
		}
	}
	
	public static void imprimeArreglo(int arreglo[])
    {
       	for(int i=0; i <= max; i++)
       	{
       		System.out.println(arreglo[i]);
       	}
    }
}

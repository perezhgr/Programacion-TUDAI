import java.io.BufferedReader;
import java.io.InputStreamReader;

// Hacer un programa que elimine un elemento en un arreglo
// (ordenado decrecientemente) de tamaño MAX=10.
// Finalmente se pide que imprima el arreglo.

public class ejercicio6 {

	public static int max = 9;
	public static int min = 0;
	
	public static void main(String[] args) 
	{
		int arreglo[] = {10,9,8,7,6,5,4,3,2,1};
		System.out.println("Arreglo original: ");
		imprimeArreglo(arreglo);
		eliminaValor(ingresaValor(), arreglo);
		System.out.println("Arreglo con insercion: ");
		imprimeArreglo(arreglo);
	}
	
	public static void eliminaValor(int valor, int arreglo[])
	{
		int posicion = buscaPosicion(arreglo, valor);
		if (posicion == -1)
			System.out.println("El valor que se desea eliminar no se encuentra en el arreglo");
		else
		{
			corrimientoIzquierda(posicion, arreglo);
			arreglo[posicion] = valor;
		}
	}
	
	public static int buscaPosicion(int arreglo[], int valor)
	{
		int cont = 0;
		while ((cont < max) && (valor != arreglo[cont]) && (arreglo[cont] <= valor))
		{
			cont++;
		}	
		if (arreglo[cont] == valor)
		{
			return cont;
		}
		else
		{
			return -1;
		}
	}
	
	public static void corrimientoIzquierda(int posicion, int arreglo[])
	{
		for(int i = min; i < posicion; i++)
		{
			arreglo[i] = arreglo[i+1];
		}
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
					System.out.println("Introduzca el valor a insertar");
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

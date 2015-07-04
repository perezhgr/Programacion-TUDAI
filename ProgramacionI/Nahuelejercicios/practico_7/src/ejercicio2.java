// Implementar un método que busque la posición de un valor entero dado en un arreglo ordenado.
import java.io.*;
public class ejercicio2 {

	public static int max = 10;
	
	public static void main(String[] args) 
	{
		int arreglo[] = {0,1,2,3,4,5,6,7,8,9};
		int posicion = buscaValor(arreglo, ingresaValor());
		
		if (posicion != -1)
			System.out.println("El valor se encuentra en la posicion: " + posicion);
		else
			System.out.println("El valor no se encuentra dentro del arreglo");
	}
	
	public static int buscaValor(int arreglo[], int valor)
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
    
	public static int ingresaValor()
	{
      	BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      	boolean correcto = false;
      	int valor = 0;
      	
      	while(correcto != true)
      	{
	        	try {
					System.out.println("Introduzca un valor a buscar");
			        valor = new Integer(entrada.readLine());
			        correcto = true;
				}
				catch (Exception exc) { 
					System.out.println("Ingreso valor invalido");
					correcto = false;
					valor = 0;
				}
      	}
      	return valor;
	}
   
}
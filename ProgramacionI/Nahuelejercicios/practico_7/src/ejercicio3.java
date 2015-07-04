import java.io.BufferedReader;
import java.io.InputStreamReader;

// Implementar un método que realice un corrimiento a
// derecha en un arreglo ordenado a partir de una posición.

public class ejercicio3 {
	
	public static int max = 9;
	public static int minRango = 0;
	public static int maxRango = 10;
	
	public static void main(String[] args) 
	{
		int arreglo[] = {0,1,2,3,4,5,6,7,8,9};
		System.out.println("Arreglo original: ");
		imprimeArreglo(arreglo);
		corrimientoDerecha(ingresaValor(), arreglo);
	}
	
	public static void corrimientoDerecha(int posicion, int arreglo[])
	{
		for(int i = max; i > posicion; i--)
		{
			arreglo[i] = arreglo[i-1];
		}
		System.out.println("Arreglo corrido: ");
		imprimeArreglo(arreglo);
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
					System.out.println("Introduzca la posicion desde la que se desea correr");
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
		if((valor >= minRango) && (valor < maxRango))
			return true;
		else
			System.out.println("El valor ingresado no es valido");
			return false;
	}
   
}

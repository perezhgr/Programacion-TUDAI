import java.io.BufferedReader;
import java.io.InputStreamReader;

// Definir una matriz de 10 x 10 enteros y realizar los siguientes procedimientos o funciones:
// Sumar una columna dada.
// Sumar una fila dada.
// Calcular el promedio de una fila dada.
// Calcular el promedio de una columna dada.

public class ejercicio1 {
	public static int maxFila = 9;
	public static int maxColumna = 9;
	
	public static void main(String[] args) {
		int matriz[][] = {{2, 3, 7, 1, 0, 9, 10,5, 6, 8},
						  {9, 16,2, 90,1, 25,7, 9, 5, 3},
						  {4, 28,36,58,73,2, 60,9, 3, 42},
						  {25,0, 8, 97,23,4, 65,9, 84,37},
						  {25,92,0, 9, 89,34,78,12,3, 56},
						  {78,76,54,3, 20,74,9, 26,75,5},
						  {2, 3, 7, 1, 0, 9, 10,5, 6, 8},
						  {9, 16,2, 90,1, 25,7, 9, 5, 3},
						  {4, 28,36,58,73,2, 60,9, 3, 42},
						  {25,0, 8, 97,23,4, 65,9, 84,37}};
	
		System.out.println("Ingrese el numero de columna a sumar");
		sumaColumna(ingresaValor(), matriz);
		
		System.out.println("Ingrese el numero de fila a sumar");
		sumaFila(ingresaValor(), matriz);
		
		System.out.println("Ingrese el numero de columna a calcular promedio");
		promedioFila(ingresaValor(), matriz);
		
		System.out.println("Ingrese el numero de columna a calcular promedio");
		promedioColumna(ingresaValor(), matriz);
	}
	
	public static void sumaColumna(int valor, int matriz[][])
	{
		int sumatoria = 0;
		for (int i = 0; i <= maxFila; i++)
			sumatoria = matriz[i][valor]+sumatoria;
		System.out.println("La suma de la columna es: " + sumatoria);
	}
	
	public static void sumaFila(int valor, int matriz[][])
	{
		int sumatoria = 0;
		for (int i = 0; i <= maxColumna; i++)
			sumatoria = matriz[valor][i]+sumatoria;
		System.out.println("La suma de la fila es: " + sumatoria);
	}
	
	public static void promedioFila(int valor, int matriz[][])
	{
		int sumatoria = 0;
		for (int i = 0; i <= maxColumna; i++)
			sumatoria = matriz[valor][i]+sumatoria;
		float prom = sumatoria/(maxColumna+1);
		System.out.println("El promedio de la fila es: " + prom);
	}
	
	public static void promedioColumna(int valor, int matriz[][])
	{
		int sumatoria = 0;
		for (int i = 0; i <= maxFila; i++)
			sumatoria = matriz[i][valor]+sumatoria;
		float prom = sumatoria/(maxFila+1);
		System.out.println("El promedio de la columna es: " + prom);
	}
	
	public static int ingresaValor()
	{
      	BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      	boolean correcto = false;
      	int valor = 0;
      	
      	while(correcto != true)
      	{
	        	try {
			        valor = new Integer(entrada.readLine());
			        if ((valor >= 0) && (valor <= maxFila))
			        	correcto = true;
			        else
			        	correcto = false;
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

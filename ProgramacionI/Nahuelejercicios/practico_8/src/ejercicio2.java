import java.io.BufferedReader;
import java.io.InputStreamReader;

// Dada una matriz de m × n enteros, insertar una fila en la posición pos.

public class ejercicio2 {

	public static int maxFila = 10;
	public static int maxColumna = 10;

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
		
		int arreglo[] = {1,1,1,1,1,1,1,1,1,1};
		
		System.out.println("Ingrese la posicion en la que se quiere insertar la fila");
		insertaFila(matriz, arreglo, ingresaValor());
		imprimeMatriz(matriz);

	}
	
	public static void insertaFila(int matriz[][], int arreglo[], int valor)
	{
		int aux = 0;
		for (int i = valor; i < maxColumna; i++)
			for (int j = 0; j < maxFila; j++)
			{
				aux = matriz[i][j];
				matriz[i][j] = arreglo[j];
				arreglo[j] = aux;
			}
	}

	public static void imprimeMatriz(int matriz[][])
	{
		for(int i = 0; i < maxColumna; i++)
		{
			for (int j = 0; j < maxFila; j++)
				System.out.print(matriz[i][j] + " ");
			System.out.println(" ");
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
			        valor = new Integer(entrada.readLine());
			        if ((valor >= 0) && (valor < maxFila))
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
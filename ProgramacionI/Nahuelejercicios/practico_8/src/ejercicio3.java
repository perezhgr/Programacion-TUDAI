import java.io.BufferedReader;
import java.io.InputStreamReader;

// Dada una matriz de m × n enteros, eliminar la fila de la posición pos.

public class ejercicio3 {

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
		
		System.out.println("Ingrese la fila que desea eliminar: ");
		eliminaFila(matriz, ingresaValor());
		eliminaUltima(matriz);
		imprimeMatriz(matriz);

	}
	
	public static void eliminaUltima(int matriz[][])
	{
		for( int i = 0; i < maxColumna; i++ )
			matriz[maxFila - 1][i] = 0;
	}
	
	public static void eliminaFila(int matriz[][], int valor)
	{
		for( int i = valor +1; i < maxFila; i++ )
			for( int j = 0; j < maxColumna; j++ )
				matriz[i-1][j] = matriz[i][j];
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

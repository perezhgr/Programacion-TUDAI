// Dada una matriz de m × n enteros, ordenar cada una de sus filas.

public class ejercicio4 {

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
		
		ordenaMatriz(matriz);
		imprimeMatriz(matriz);
	}
	
	public static void ordenaMatriz(int matriz[][])
	{
		int temp = 0;
		for (int i = 0; i < maxFila; i++)
		{
			for(int j = 1; j < maxColumna; j++)
				for (int k = 0 ; k < maxColumna - 1; k++)
				{
					if (matriz[i][k] > matriz[i][k+1])
					{
						temp = matriz[i][k];
						matriz[i][k] = matriz[i][k+1];
						matriz[i][k+1] = temp;
					}
				}
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
}

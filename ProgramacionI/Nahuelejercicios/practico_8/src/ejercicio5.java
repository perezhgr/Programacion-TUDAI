//Dada una matriz de m × n caracteres, ordenar sus filas alfabéticamente como si fueran palabras.

public class ejercicio5 {

	public static int maxFila = 5;
	public static int maxColumna = 5;
	
	public static void main(String[] args) {

		char matriz[][] = {{'j','s','o','e','l'},{'p','e','l','d','b'},{'d','k','b','a','z'},{'d','j','e','n','a'},{'e','i','b','s','i'}};
		
		ordenaMatriz(matriz);
		imprimeMatriz(matriz);
		
	}

	public static void ordenaMatriz(char matriz[][])
	{
		char aux;
		for (int fila = 0; fila < maxFila; fila++)
			for (int i = 1; i < maxColumna; i++)
				for (int j = 0; j < maxColumna -1; j++)
					if (matriz[fila][j] > matriz[fila][j+1])
					{
						aux = matriz[fila][j];
						matriz[fila][j] = matriz[fila][j+1];
						matriz[fila][j+1] = aux;
					}
	}
	
	public static void imprimeMatriz(char matriz[][])
	{
		for (int i = 0; i < maxFila; i++)
		{
			for (int j = 0; j < maxColumna; j++)
				System.out.print(matriz[i][j]);
			System.out.println();
		}
	}
}

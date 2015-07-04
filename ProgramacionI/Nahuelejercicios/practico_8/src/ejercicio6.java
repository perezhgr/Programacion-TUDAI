// Se tiene la matriz Temperatura que contiene las temperaturas mínima y máxima que se registraron para cada mes
// del año. Esta matriz tiene las siguientes dimensiones: [0..11, 0..1].
// -Realizar un programa que dada la matriz Temperatura, muestre los meses ordenados en forma creciente teniendo
// en cuenta las temperaturas máximas.
// -Realizar un programa que dada la matriz Temperatura, genere el arreglo BajoCero de 12 elementos. En cada
// componente se debe almacenar un valor TRUE si en ese mes hubo alguna temperatura bajo cero y FALSE en caso contrario.

public class ejercicio6 {

	public static int maxFila = 1;
	public static int maxColumna = 11;
	public static int maxArr = 11;
	
	public static void main(String[] args) {
		
		int Temperatura[][] = {{40,37,34,28,23,19,17,18,20,25,30,39},{28,30,25,13,7,-2,-7,2,4,7,15,20}};
		boolean BajoCero[] = {false,false,false,false,false,false,false,false,false,false,false,false};
		
		ordenaMeses(Temperatura);
		mesesBajoCero(Temperatura, BajoCero);
		imprimeArregloB(BajoCero);
	}
	
	public static void imprimeArregloB(boolean BajoCero[])
	{
		for (int i = 0; i < maxArr; i ++)
			System.out.print(BajoCero[i]);
	}
	
	public static void mesesBajoCero(int Temperatura[][], boolean BajoCero[])
	{
		for(int i = 0; i < maxColumna; i++)
			if (Temperatura[1][i] < 0)
				BajoCero[i] = true;
	}
	
	public static void ordenaMeses(int Temperatura[][])
	{
		int ordenado[] = {0,0,0,0,0,0,0,0,0,0,0,0};
		int menor = Temperatura[0][0], mes = 0, ultima = -100;
		for(int i = 0; i < maxColumna; i++)
		{
			for(int j = 0; j < maxColumna; j++)
			{
				if ((menor > Temperatura[0][j]) && (menor > ultima))
				{
					menor = Temperatura[0][j];
					mes = j;
				}
			}
			ordenado[i] = mes +1;
			ultima = menor;
		}
		imprimeArreglo(ordenado);
	}
	
	public static void imprimeArreglo(int ordenado[])
	{
		System.out.print("Los meses ordenados segun las temperaturas son: ");
		for(int i = 0; i < maxColumna; i++)
			System.out.print(ordenado[i]);
	}

}

// Hacer un programa que reemplace de un arreglo A todas las
// ocurrencias de una secuencia patrón dada en un arreglo P,
// por la secuencia contenida en el arreglo R.

public class ejercicio12 {

	public static int maxA = 9, maxP = 2, maxR = 2;
	
	public static void main(String[] args) {
		
		int arrA[] = {1,2,3,1,2,3,1,2,3,0};
		int arrP[] = {1,2,3};
		int arrR[] = {-1,-1,-1};

		reemplazaSecuencia(arrA, arrP, arrR);
		imprimeArreglo(arrA);
	}
	
	public static void reemplazaSecuencia(int arrA[], int arrP[], int arrR[])
	{
		int cont = 0;
		
		while (cont <= maxA)
		{
			if(buscaSecuencia(arrA, arrP, cont) == true)
			{
				reemplaza(arrA, arrR, cont);
				cont = cont + 3;
			}
			else
				cont ++;
		}
	}
	
	public static boolean buscaSecuencia(int arrA[], int arrP[], int pos)
	{
		int cont = 0;
		while ((cont <= maxP) && (pos <= maxA) && (arrP[cont] == arrA[pos]))
		{
			cont ++;
			pos ++;
		}
		if (cont == maxP + 1)
			return true; 
		else
			return false;
	}
	
	public static void reemplaza(int arrA[], int arrR[], int posicion)
	{
		for(int i = 0; i <= maxR; i++)
		{
			arrA[posicion] = arrR[i];
			posicion ++;
		}
	}
	
	public static void imprimeArreglo(int arreglo[])
    {
       	for(int i=0; i <= maxA; i++)
       	{
       		System.out.println(arreglo[i]);
       	}
    }

}

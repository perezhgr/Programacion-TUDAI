// Hacer un programa que invierta el orden de una secuencia dada.

public class ejercicio13 {
	
	public static int max = 8;
	
	public static void main(String[] args) {
		
		int arr[] = {0,1,2,3,4,5,6,7,8};
		
		invierteSecuencia(arr);
		imprimeArreglo(arr);
	}
	
	public static void invierteSecuencia(int arr[])
	{
		int aux = 0, inicio = 0, fin = max;
		
		while(inicio < fin)
		{
			aux = arr[fin];
			arr[fin] = arr[inicio];
			arr[inicio] = aux;
			inicio ++;
			fin --;
		}
	}
	
	public static void imprimeArreglo(int arreglo[])
    {
       	for(int i=0; i <= max; i++)
       	{
       		System.out.println(arreglo[i]);
       	}
    }

}

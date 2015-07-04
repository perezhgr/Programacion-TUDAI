// Hacer un programa que cargue un arreglo (sin orden) de
// tamaño MAX=10 con números enteros aleatorios entre 0 y
// 100. Finalmente imprima el arreglo por pantalla.

public class ejercicio1 {

	public static int maxRango = 100;
	public static int max = 10;
	
	public static void main(String[] args) 
	{
		int arreglo[] = new int[max];
		cargaArreglo(arreglo);
		imprimeArreglo(arreglo);
	}
        
    public static void cargaArreglo(int arreglo[])
    {
       	for(int i=0; i < max; i++)
       	{
       		arreglo[i] = (int)(Math.random()*maxRango+1);
       	}
    }
        
    public static void imprimeArreglo(int arreglo[])
    {
       	for(int i=0; i < max; i++)
       	{
       		System.out.println("El valor en la posicion: " + i + " es: " + arreglo[i]);
       	}
    }
}

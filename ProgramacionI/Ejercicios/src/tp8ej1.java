/*Hacer un programa que cargue un arreglo sin orden de tamaño MAX = 10
 * con números enteros aleatorios entre 0 y 100.Finalmente imprima el arreglo
 * por pantalla*/

public class tp8ej1 {
	
	final static int MAX = 10;

	public static void cargar_arreglo(int [] arr){
		
		for (int contador = 0; contador < MAX ;contador++){
			arr[contador]= (int) (MAX*Math.random()+1); 
		}
	}
	
	public static void imprimir_arreglo(int [] arr){
		
		for (int i = 0; i < MAX ;i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		int ArrEnteros [] = new int [MAX];
		cargar_arreglo(ArrEnteros);
		imprimir_arreglo(ArrEnteros);

	}

}

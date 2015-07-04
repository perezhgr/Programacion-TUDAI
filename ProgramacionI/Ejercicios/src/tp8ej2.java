/*Implementar un método que busque la posición de un valor entero dado en un arreglo ordenado.*/
import java.util.Scanner;

public class tp8ej2 {
	
	public static void imprimir_arreglo(int [] arr){
		
		for (int i = 0; i < 10;i++){
			System.out.println(arr[i]);
		}
	}
	
	public static int buscar_pos_ord(int [] arr, int valor){
		int pos = 0;

		if (arr[pos] > valor ){
			while ( (pos < 10) && (arr[pos] > valor ) )
				pos++;
		}
		/*else{
			while ( (pos < 10) && (arr[pos] <= valor ) )
				pos++;
		}*/	
		if( (pos< 10) && (arr[pos] == valor) )
			return pos;
		else return -1;
		
	}
	
	public static void main(String[] args) {
		//int [] ArrEnterosOrdenados  = {1,2,3,4,5,6,7,8,9,10};
		int [] ArrEnterosOrdenados  = {10,9,8,7,6,5,4,3,2,1};//Se asume que el array se carga ordenado ascendentemente.
		int valor=0;
		
		imprimir_arreglo(ArrEnterosOrdenados);
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un valor para buscar en el arreglo:");
		valor = sc.nextInt();
		
		if(buscar_pos_ord(ArrEnterosOrdenados,valor) != -1)
			System.out.println("La posición del valor " +valor+" ingresado es "+buscar_pos_ord(ArrEnterosOrdenados,valor));	
		else
			System.out.println("El valor ingresado no se encontró en el arreglo.");
	}
}

/*solicite un número e imprima “grande” si es mayor a 100 y “chico
si es menor a 100.*/


import java.util.Scanner;

public class tp4ej2 {

	public static void main(String[] args) {
		double numero;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número");
		numero = sc.nextDouble();
		
		if (numero < 100){
			System.out.println("Chico");
		}
		else if(numero > 100){
			System.out.println("Grande");
		}
		else{
			System.out.println("El número ingresado es 100.Número ni chico ni grande");
		}
	}
}

// Solicite 3 números e imprima “creciente” si los tres números están en orden creciente, “decreciente” si están en orden decreciente o “error” si no cumplen ningún orden
import java.util.Scanner;
public class ejercicio5 {

	public static void main(String[] args) {
		int valor1;
		int valor2;
		int valor3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println ("Ingrese el primer valor: ");
		valor1 = sc.nextInt();
		System.out.println ("Ingrese el segundo valor: ");
		valor2 = sc.nextInt();
		System.out.println ("Ingrese el tercer valor: ");
		valor3 = sc.nextInt();
		
		if ((valor1 < valor2 ) && (valor2 < valor3)) {
			System.out.println ("Creciente");
		}
		else {
			if ((valor3 < valor2) && (valor2 < valor1)) {
				System.out.println ("Decreciente");
			}
			else {
				System.out.println ("Error");
			}

		}

	}
}
// Solicite un número e imprima “grande” si es mayor a 100 y “chico“ si es menor a 100.
import java.util.Scanner;
public class ejercicio2 {

	public static void main(String[] args) {
		int valor;
		
		Scanner sc = new Scanner(System.in);
		System.out.println ("Ingrese el valor: ");
		valor = sc.nextInt();
		
		if (valor < 100) {
			System.out.println ("Chico");
		}
		else {
			System.out.println ("Grande");
		}

	}

}
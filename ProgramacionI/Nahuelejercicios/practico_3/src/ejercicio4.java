// Solicite una letra e imprima si es vocal o consonante
import java.util.Scanner;
public class ejercicio4 {

	public static void main(String[] args) {
		char valor;
		
		Scanner sc = new Scanner(System.in);
		System.out.println ("Ingrese el valor: ");
		valor = sc.next().charAt(0);
		
		if ((valor == 'a') || (valor == 'e') || (valor == 'i') || (valor == 'o') || (valor == 'u')) {
			System.out.println ("la letra: " + valor + " es vocal");
		}
		else {
			System.out.println ("La letra: " + valor + " es consonante");
		}

	}

}
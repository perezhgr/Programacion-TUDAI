// Solicite un número del 1 al 7 e imprima el día de la semana
import java.util.Scanner;
public class ejercicio3 {

	public static void main(String[] args) {
		int valor;
		
		Scanner sc = new Scanner(System.in);
		System.out.println ("Ingrese el valor: ");
		valor = sc.nextInt();
		
		switch (valor) {
			case 1: System.out.println ("Domingo");
			break;
			case 2: System.out.println ("Lunes");
			break;
			case 3: System.out.println ("Martes");
			break;
			case 4: System.out.println ("Miercoles");
			break;
			case 5: System.out.println ("Jueves");
			break;
			case 6: System.out.println ("Viernes");
			break;
			case 7: System.out.println ("Sabado");
			break;
			default: System.out.println ("No es un dia de la semana");
			break;
		}

	}

}
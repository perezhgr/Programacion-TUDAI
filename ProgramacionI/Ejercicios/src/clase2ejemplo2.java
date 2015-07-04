import java.util.Scanner;

public class clase2ejemplo2{
	public static void main(String[] args) {
		int edad;
		String nombre;
		
		Scanner sc = new Scanner(System.in);
		System.out.println ("Ingrese el nombre:");
		nombre = sc.nextLine(); 
		System.out.println ("Ingrese la edad: ");
		edad = sc.nextInt();
		System.out.println("Nombre :" + nombre);
		System.out.println("Edad :" + edad);

	}
}
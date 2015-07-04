import java.util.Scanner;
public class ejercicio1 {
	public static void main(String[] args) {
		int var1;
		int var2;
		int var3;
		int resultado;
		
		Scanner sc = new Scanner(System.in);
		System.out.println ("Ingrese el primer valor: ");
		var1 = sc.nextInt();
		System.out.println ("Ingrese el segundo valor: ");
		var2 = sc.nextInt();
		System.out.println ("Ingrese el tercer valor: ");
		var3 = sc.nextInt();
		
		resultado = (var1 * var2)-var3;
		System.out.println ("Resultado: " + resultado);
				
	}

}

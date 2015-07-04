//Sentencia for anidada. Tablas de multiplicar del 1,2 y 3.

public class clase5ejemplo2 {

	public static void main(String[] args) {
		final int MAX = 10;
		final int MULTIPLO = 3;
		
		System.out.println("Tablas de multiplicar del 1, 2 y 3 \n");
		for (int i=1; i<=MULTIPLO; i++) {
			System.out.println("Tabla de multiplicar del " + i);
			for (int j=0; j<=MAX; j++) {
				System.out.println(i + " * " + j + "= " + i*j +"\n");
			}
		}
	}
}

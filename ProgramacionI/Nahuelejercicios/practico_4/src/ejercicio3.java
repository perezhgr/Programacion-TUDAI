// Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés mensual. Escribir un programa que
// imprima cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si reinvierte todo el dinero cada mes.

public class ejercicio3 {
	public static void main(String[] args) {
		final int max = 12;
		final int interes = 2;
		double ganancia;
		double inversion = 1000.00;
		
		for (int i = 1 ; i <= max; i++) {
			ganancia = inversion * interes / 100;
			inversion = inversion + ganancia;
		}
		
		System.out.println ("Total de dinero: " + inversion);

	}

}

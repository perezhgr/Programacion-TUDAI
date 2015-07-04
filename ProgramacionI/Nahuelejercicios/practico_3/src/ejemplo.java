//Paridad de un valor

public class ejemplo {

		public static void main (String [] args) {
			int valor = 2;
			if (valor % 5 == 0) {
				System.out.println("El valor " + valor + " es multiplo de 5");
			}
			else {
				if (valor % 3 == 0) {
					System.out.println("El valor " + valor + " es multiplo de 3");
				}
				else {
					System.out.println("El valor " + valor + " no es multiplo de 3 ni de 5");
				}
			}
		}
}
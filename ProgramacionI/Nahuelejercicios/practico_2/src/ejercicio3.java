public class ejercicio3 {
	public static void main(String[] args) {
		int resultado1;
		/*int resultado2;*/
		double resultado3;
		int resultado4;
		
		resultado1 = (4/2)-(2*5);
		/*resultado2 = 4/((2-2)*5);*/
		resultado3 = 4.0/(2-(2*5));
		resultado4 = ((4/2)-2)*5;
		
		System.out.println ("Resultado 1: " + resultado1);
		/*System.out.println ("Resultado 2: " + resultado2);*/ /*ROMPE*/
		System.out.println ("Resultado 3: " + resultado3);
		System.out.println ("Resultado 4: " + resultado4);
	}

}

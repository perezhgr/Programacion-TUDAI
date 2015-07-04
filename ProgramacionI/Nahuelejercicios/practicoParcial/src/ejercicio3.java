// Escribir un programa que simule el lanzamiento de un dado (1000 veces) y muestre
// por pantalla la frecuencia de los resultados para cuando el valor de los dados 
// es 1 o 2. Emplear la rutina predefinida de java Math.random() que devuelve un valor
// aleatorio real entre 0 y 1. Ejemplo: dado1 = (int)(6*Math.random()+1).

public class ejercicio3 {
	static final int max = 1000;
	
	public static int tiraDado()
	{
		return (int)(6*Math.random()+1);
	}
	
	public static void main(String[] args) {
		int unos = 0;
		int dos = 0;
		
		for (int i = 0; i < max; i++)
		{
			if (tiraDado() == 1)
				unos++;
			else
				if (tiraDado() == 2)
					dos++;
		}
		
		System.out.println("Cantida de veces que salio 1: " + unos);
		System.out.println("Cantida de veces que salio 2: " + dos);

	}

}

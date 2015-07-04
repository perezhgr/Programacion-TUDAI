// Sentencia for.Ejemplo de tabla de multiplicar

import java.util.Scanner;

public class clase5ejemplo1 {

	public static void main(String[] args) {
	  final int MAX =10;
	  final int MULTIPLO =5;
	 
	  System.out.println("Tabla de multiplicar de: "+ MULTIPLO);
	 
	  for (int i = 0; i <= MAX ; i++) {
		 System.out.println(MULTIPLO + "*" + i + " = " + MULTIPLO*i);
	  }
    }
}


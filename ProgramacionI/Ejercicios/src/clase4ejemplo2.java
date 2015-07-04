//Ejemplo de valores múltiples(Uso del Switch).

import java.util.Scanner;

public class clase4ejemplo2 {

	public static void main(String[] args) {
		char c ='h';
		
		switch(c){
		case 'a' :  System.out.println("La letra es la vocal a");break;
		case 'e' :  System.out.println("La letra es la vocal e");break;
		case 'i' :  System.out.println("La letra es la vocal i");break;
		default  :  System.out.println("No es la vocal a,e ni i");break;
		}
	}
}

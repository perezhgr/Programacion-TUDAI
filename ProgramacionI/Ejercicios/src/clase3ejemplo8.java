//Ejemplo de separadores y operadores logicos.

public class clase3ejemplo8 {

	public static void main(String[] args) {
		int i,j,k;

		i = 7;
		j = 3;
		k = 1;

		System.out.println("(i==j)||(i==k) "+((i==j)||(i==k)));//F

		System.out.println("(i==j)||(i==k)&&(i==2) "+((i==j)||(i==k)&&(i==2)));//F

		System.out.println("(i==j)||((i==k)&&(i==2)) "+((i==j)||((i==k)&&(i==2)))); 
	}
}

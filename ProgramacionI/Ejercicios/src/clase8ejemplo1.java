
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase8ejemplo1 {

final static int MAX = 2;

public static void main(String args[]) {

int B[]=new int[MAX];

	for (int con=0;con<MAX;con++) {

		System.out.println ("Ingrese integer: "+con);

		B[con]=leerEntero();
}

	for (int con=0;con<MAX;con++)
		System.out.println(B[con]);
}

 public static int leerEntero(){

	int valor = 0;
	boolean bien = false;

	BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); 

	do {

		try {
			valor = new Integer(entrada.readLine());
			bien = true;
		}
		catch (Exception exc ) {
			bien = false;
		} 
	}while (!bien);

	return valor;
 }
}
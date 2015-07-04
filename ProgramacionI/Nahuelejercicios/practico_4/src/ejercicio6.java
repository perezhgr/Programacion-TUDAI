// Escribir un programa que pida el nombre del usuario y lo
// salude. Luego, debe repetir el saludo mientras el usuario no
// ingrese un 0.

import java.util.Scanner;
public class ejercicio6 {
	public static void main(String[] args) {
		String nombre;
		int corte = 1;

        while (corte != 0) {
        	System.out.print("Introduzca nombre de usuario: ");
            Scanner sc = new Scanner(System.in);
            nombre = sc.next();
            System.out.println("Hola " + nombre);
            System.out.print("Si desea cargar otro usuario ingrese un valor distinto de 0");
            corte = sc.nextInt();
        }
	}

}

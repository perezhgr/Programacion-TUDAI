// Escribir un programa que solicite el ingreso de números entre
// 0 y 999, y muestre un mensaje de cuántos dígitos tiene el
// mismo. Además, si tiene 3 dígitos debe informar qué número
// es. Finalice el programa cuando se ingrese el valor 0.

import java.util.Scanner;
public class ejercicio5 {
	public static void main(String[] args) {
		int valor;
		int cifras;
		
		System.out.print("Introduce un número entero: ");
        Scanner sc = new Scanner(System.in);
        valor = sc.nextInt();
		
        while (valor != 0) {
	            cifras = 0; 
		 
	            while ( valor !=0 ) {         
	                   valor = valor/10;        
	                   cifras++; 
	            }
	            
	            System.out.println("El numero tiene " + cifras + " cifras");
	            System.out.print("Introduce un número entero: ");
	            valor = sc.nextInt();
		 }      
	}
}

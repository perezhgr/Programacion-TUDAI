// Escribir un programa que divida un valor por otro, ambos
// ingresados por el usuario. Estudiar el caso con valores igual a
// cero.

import java.io.*;
import java.util.Scanner;
public class ejercicio1 {
	public static void main(String[] args) {
		int dividendo;
		int divisor;
		
		System.out.print("Introduzca el dividendo ");
        Scanner sc = new Scanner(System.in);
        dividendo = sc.nextInt();
        System.out.print("Introduzca divisor ");
        divisor = sc.nextInt();
        
        try {
        	System.out.print(dividendo/divisor);
        } 
        catch (Exception exc ) {
        	System.out.println( exc );
        }
	}

}

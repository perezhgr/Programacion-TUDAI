// Escribir un método que calcule el mayor de dos números. Usar
// ese método para calcular el máximo de una serie de números
// ingresados por el usuario.

import java.io.*;
public class ejercicio1 {
	public static void main(String[] args) {
		int valor1 = 0;
		int mayor = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); 
		
		do {
			try {
				System.out.println("Introduzca un valor, para terminar ingrese -1");
		        valor1 = new Integer(entrada.readLine());
		        mayor = mayNum (valor1, mayor);
			}
				catch (Exception exc) { 
				System.out.println("Ingreso valor invalido");
			}
		}
        while (valor1 != -1);
        System.out.print("El mayor valor es: " + mayor);
	}
        
        public static int mayNum(int valor1, int mayor){
        	if (mayor >= valor1){
        		return mayor;
        	}
        	else{
        		return valor1;
        	}
        }
}

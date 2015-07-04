/*Escribir un método que multiplique 2 números.Usat ese método para
 *  calcular la potencia N de un número ingresado por teclado.*/

import java.util.Scanner;
public class tp7ej2 {

	public static int MultiplicaDosNumeros(int a ,int b){
		return a * b;
	}
	
	public static int Potenciacion (int x ,int n){
		int resultado = 1 , y = 1;
		
		if ( n == 0 ){
			resultado = 1;
		}
		else if ( n == 1){
			resultado = x;
		}
		else{
			while (n >= 1){
				resultado *= MultiplicaDosNumeros(x,y);
				n--;
			}
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		int numeroingresado = 0 , potencia = 0;
		
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese un número :");
			numeroingresado = sc.nextInt();
			System.out.println("Ingrese la potencia a la que quiere elevar el número: ");
			potencia = sc.nextInt();
			
			if(!(potencia < 0)){
				System.out.println("El resultado de elevar "+numeroingresado+" a la "+potencia+" es: "+Potenciacion(numeroingresado,potencia));
			}
			else{
				System.out.println("Error!.El exponente no puede ser negativo.");
			}
		}
		catch(Exception exc){
			System.out.println("Ingrese un valor númerico y no letras.");
		}
	}
}

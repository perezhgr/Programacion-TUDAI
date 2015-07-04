/*Dados 2 enteros A y B ,contruir un programa que calcule un programa 
 * A elevado a la B, utilizando el procedimiento/función del ejercicio anterior,
 *  */
import java.util.Scanner;

public class tp7ej9 {
	
	public static int MultiplicaNumeros(int x ,int y){
		int resultado = 0;
		
		if (y > 1){
			resultado =x;
			while(y>1){
				resultado *=x;
				y--;
			}
		}
		else if(y == 1){
			resultado =x;
		}
		else{//(y == 0)
			resultado =1;
		}
		/*else{ // y < 0
			resultado = 1/MultiplicaNumeros(x,y);
			if (y > 1){
				resultado =x;
				while(y>1){
					resultado *=x;
					y--;
				}
			}
			else if(y == 1){
				resultado =x;
			}
			else if(y == 0){
				resultado =1;
			}
		}*/
		return resultado;
	} 

	public static void main(String[] args) {
		int base = 0 , exponente = 0;
		try{
			   Scanner sc = new Scanner(System.in);
			   System.out.println("Ingrese un número (base): ");
			   base = sc.nextInt();
			   System.out.println("Ingrese un número (exponente): ");
			   exponente = sc.nextInt();
			   if(exponente<0)
			     System.out.println("El exponente o potencia no puede ser negativo.");
			   else
			     System.out.println("El resultado de elevar "+ base+" a la "+exponente+" es: "+MultiplicaNumeros(base,exponente));
			   
			}	   
			catch(Exception exc){
				System.out.println("Error!.Ingrese números.");
			}
	}

}

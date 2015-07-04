/*Escribir un programa que transforme una temperatura dada en grados Fahrenheit 
 * a grados Celsius.Formula = (F-32)/1,8*/
import java.util.Scanner;

public class tp7ej4 {
	
	public static float TransformaTempACelsius(float F){
		return (F-32)/1.8f;
	}

	public static void main(String[] args) {
		float temperatura =0.0f;
		
		try{
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Ingrese una temperatura (Fahrenheit): ");
		   temperatura= sc.nextFloat();
		   System.out.println("La temperatura es: "+String.format("%.1f", TransformaTempACelsius(temperatura))+"°C");
		}	   
		catch(Exception exc){
			System.out.println("Error!.Debe ingresar sólo números.");
		}

	}

}

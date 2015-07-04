/*El periodo, T (en segundos), de un péndulo que oscila viene dado
por la expresión: T=2 PI (L/g)^0.5 donde L es la longitud del péndulo
en metros y g es la aceleración de la gravedad en metros por 
segundo al cuadrado. Construir una rutina periodo para que calcule 
y devuelva el valor de T dado L como parámetro de la función y g 
como constante del programa. Usar para la raíz res = (float) 
Math.sqrt(nro)*/

import java.util.Scanner;

public class tp7parcial2 {
	
	public static boolean ValidaLongitud(float x){
		
		if ( !(x<0) ) 
			return true;
		else	
			return false;		
	}
	
	public static float Periodo(float L){
		final float PI = 3.14f, g = 9.8f;
		float T = 0.0f;
		
		T = 2*PI*(float)Math.sqrt(L/g);
		return T;
	}	
	public static void main(String[] args) {
		float longitud=0.0f;
		
		try{
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Ingrese una longitud(en metros)");
		   longitud = sc.nextFloat();
		   
		   if(ValidaLongitud(longitud))
			   System.out.println("El valor del período T(en segundos) del péndulo es: "+String.format("%.1f",Periodo(longitud))+"s.");
		   else
			   System.out.println("Error!.El valor ingresado no es válido.");			   
		}	   
		catch(Exception exc){
			System.out.println("Error!.Ingrese valores numéricos.");
		}
    }
}
/*Hacer un programa que incluya un método que devuelve verdadero
o falso dependiendo de si una fecha (dando el día, el mes y el año 
como parámetros) es válida o no.*/

import java.util.Scanner;

public class tp7parcial1 {
	
	public static boolean ValidaFecha(int x,int y, int z){
		final int MINDIA =1, MAXDIA=31, MINMES =1 ,MAXMES =12, MINANO =0,MAXANO=3000; 
		
		if( (x >= MINDIA) && (x <= MAXDIA) &&
			(y >= MINMES) && (y <= MAXMES) &&
			(z>= MINANO) && (z <= MAXANO) )
			return true;
		else	
			return false;		
	}
	
	public static void main(String[] args) {
		int dia=0, mes=0, ano=0;
		
		try{
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Ingrese un día: ");
		   dia = sc.nextInt();
		   System.out.println("Ingrese un mes: ");
		   mes = sc.nextInt();
		   System.out.println("Ingrese un año: ");
		   ano = sc.nextInt();
		   
		   if(ValidaFecha(dia,mes,ano))
			   System.out.println("La fecha que ha ingresado es válida.");
		   else
			   System.out.println("La fecha que ha ingresado es inválida.");			   
		}	   
		catch(Exception exc){
			System.out.println("Error!.Debe ingresar sólo números!.");
		}
    }
}
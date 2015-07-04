/*Hacer un programa que cargue un arreglo de tamaño
MAX=10 con números enteros aleatorios entre 0 y 100 de
tal manera que quede ordenado decrecientemente. 
Finalmente imprima el arreglo.*/

import java.util.Scanner;
public class tp8ej7 {
   
	final static int longitudarreglo =10;
	final static int minvalor = 0;
	final static int maxvalor = 101;
	
	public static void cargar_arreglo(int [] Arreglo){
				
		for (int i=minvalor;i<longitudarreglo;i++){
			Arreglo[i] = (int)(maxvalor*Math.random()+0);//Valores entre 0 y maxvalor = 101;(Serán desde el 0 al 100 inclusive).
		}
		
	}
	
	public static void imprimir_arreglo(int [] Arreglo){
		
		for (int i = minvalor;i < longitudarreglo; i++){
		   System.out.println(Arreglo[i]);	
		}
	}
	
	public static void seleccion (int [] Arreglo){
		int i,j,pos,mayor,tmp;
		
		for( i = minvalor; i < longitudarreglo; i++){
			mayor = Arreglo[i];
			pos = i;
			
			for( j = i+1 ; j < longitudarreglo; j++){
				if(Arreglo[j] > mayor){
					mayor=Arreglo[j];
					pos=j;
				}
			}
			
			if(pos!=i){
				tmp = Arreglo[i];
				Arreglo[i] = Arreglo[pos];
				Arreglo[pos] =tmp;
			}
		}
	}
	
	public static void main(String[] args) {
		int  Enteros[] = new int [longitudarreglo];
		cargar_arreglo(Enteros);
		System.out.println("Arreglo original : ");
        imprimir_arreglo(Enteros);
        System.out.println("Arreglo ordenado : ");
        seleccion(Enteros);
        imprimir_arreglo(Enteros);
	}

}

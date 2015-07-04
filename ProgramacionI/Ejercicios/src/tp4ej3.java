//Solicite un número del 1 al 7 e imprima el día de la semana.

import java.util.Scanner;

public class tp4ej3 {

	public static void main(String[] args) {
	 int numerosemana;
	 
	 Scanner sc = new Scanner (System.in);
	 System.out.println("Ingrese un número del 1 al 7 : ");
	 numerosemana = sc.nextInt();
	 
	  switch (numerosemana){
	 	case 1 : System.out.println("Domingo");  break;
	 	case 2 : System.out.println("Lunes");    break;
	 	case 3 : System.out.println("Martes");   break;
	 	case 4 : System.out.println("Miércoles");break;
	 	case 5 : System.out.println("Jueves");   break;
	 	case 6 : System.out.println("Viernes");  break;
	 	case 7 : System.out.println("Sábado");   break;
	 	default :System.out.println("Domingo");  break;
	  }
	 }
}

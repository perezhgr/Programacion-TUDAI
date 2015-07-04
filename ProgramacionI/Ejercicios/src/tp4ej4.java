import java.util.Scanner;

//Solicite una letra e imprima si es vocal o consonante.

public class tp4ej4 {

	public static void main(String[] args) {
		
		 char letra;
		 
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Ingrese una letra: ");
		 letra = sc.next().charAt(0);
		 		 		 
		  switch (letra){
		 	case 'a' : System.out.println("La letra es vocal"); 	    break;
		 	case 'e' : System.out.println("La letra es vocal");        break;
		 	case 'i' : System.out.println("La letra es vocal");        break;
		 	case 'o' : System.out.println("La letra es vocal");		    break;
		 	case 'u' : System.out.println("La letra es vocal");        break;
		 	default :System.out.println("La letra es consonante");     break;
		  }
	}
}

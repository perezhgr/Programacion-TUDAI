// Solicite 3 números e imprima cuál es el mayor.


import java.util.Scanner;

public class tp4ej6 {

	public static void main(String[] args) {
	 double real1,real2,real3;
	 
	 Scanner sc = new Scanner (System.in);
	 System.out.println("Ingrese 3 números :");
	 real1 = sc.nextDouble();
	 real2 = sc.nextDouble();
	 real3 = sc.nextDouble();
	 
	 	if( (real1 > real2)  && (real1 > real3) ){
	 		System.out.println("El número mayor es :"+real1);
	 	}  
	 	else if( (real2 >real1)  && (real2 > real3) ){
	 		System.out.println("El número mayor es :"+real2);
	 	}
	 	else{
	 		System.out.println("El número mayor es :"+real3);
	 	}
	 }
}

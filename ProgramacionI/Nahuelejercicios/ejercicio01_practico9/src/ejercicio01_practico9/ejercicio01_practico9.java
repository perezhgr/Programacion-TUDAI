package ejercicio01_practico9;

public class ejercicio01_practico9 {

	public static void main(String[] args) {
		punto p = new punto();
		int cuadrante = p.calculaCuadrante();
		
		p.cargaPuntos(3.0, 4.0);
		p.muestra();
		
		if (cuadrante > 0)
			System.out.println("Los puntos corresponden al cuadrante: " + cuadrante);
		else
			System.out.println("La coordenada no pertenece a un cuadrante");
		
		System.out.println("La distancia al origen es: " + p.distanciaOrigen());
	}

}
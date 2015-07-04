package ejercicio01_practico9;

public class punto {
	
	public double x;
	public double y;
	
	public void cargaPuntos(double a, double b)
	{
		x = a;
		y = b;
	}
	
	public void muestra()
	{
		System.out.println(x);
		System.out.println(y);
		
	}
	
	public int calculaCuadrante()
	{
		int cuadrante = 0;
		
		if (x > 0)
		{
			if (y > 0)
				cuadrante = 1;
			else
				cuadrante = 3;
		}
		else
		{
			if (y > 0)
				cuadrante = 2;
			else
				cuadrante = 4;
		}
		
		return cuadrante;
	}
	
	public double distanciaOrigen()
	{
		return Math.abs(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
	}
}

	

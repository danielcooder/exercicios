package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		
		// (F° - 32) x 5/9 = C°
		
		double  fahrenheit;
		double  celsius;
		double resultado;
		
		fahrenheit = 90;
		celsius = 15;
	
		resultado = (fahrenheit - 32) * 5/9; 
		
		 
		System.out.printf(fahrenheit + " graus Fahrenheit equivalem"
				+ " a %.2f graus Celsius.%n", resultado);
	}

}
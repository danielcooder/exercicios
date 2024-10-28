package fundamentos.desafiomodulo1;

public class convertendoTemperaturas {

	public static void main(String[] args) {	
	// Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
		
		double tempFah;
		double resultado;
		
		tempFah = 60;
		
		resultado = (tempFah - 32) * 5/9;
		
		System.out.printf(tempFah + " graus Fahrenheit equivalem"
				+ " a %.2f graus Celsius.%n", resultado);	
	}
	
}

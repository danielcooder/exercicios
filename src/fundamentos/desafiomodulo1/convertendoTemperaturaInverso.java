package fundamentos.desafiomodulo1;

public class convertendoTemperaturaInverso {

	public static void main(String[] args) {
		
//Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
		
				double tempCel = 50;
				double tempFah;
				
				tempFah = tempCel * (9.0 / 5.0) + 32.0;
				
				System.out.printf("%.2f graus Celsius equivalem"
						+ " a %.2f graus Fahrenheit.%n", tempCel, tempFah);  
				
			}	
	}
	

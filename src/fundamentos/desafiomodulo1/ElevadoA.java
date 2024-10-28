package fundamentos.desafiomodulo1;

public class ElevadoA {

	private static int resultado2;

	//Criar um programa que leia um valor e apresente 
	//os resultados ao quadrado e ao cubo do valor.
	

	public static void main(String[] args) {
		
		int num1;
		int resultado1;
		int resultado2;
		
		num1 = 10;
		
		resultado1 = (int) Math.pow(num1,2);
		resultado2 = (int) Math.pow(num1,3);
		
		
		System.out.println("O número " + num1 + " ao quadrado resultará em: " + resultado1);
		System.out.println("\nO número " + num1 + " ao cubo resultará em: " + resultado2);
		
	}
	
	
}

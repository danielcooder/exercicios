package fundamentos.desafiomodulo1;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		
 //Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu peso em kg: ");
        double peso = entrada.nextDouble(); // Captura o peso como double

        
        System.out.print("Digite sua altura em metros: ");
        double altura = entrada.nextDouble(); // Captura o peso como double
               
        double imc = peso / (altura * altura); 
        
        
        System.out.printf("Seu IMC é: %.2f%n", imc); 
        
        
        entrada.close();
        
	}
	
}

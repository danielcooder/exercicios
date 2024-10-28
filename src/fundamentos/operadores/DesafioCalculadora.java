package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = (int) entrada.nextDouble();       
		
        System.out.print("Informe a operação : ");
        int operacao = entrada.next().charAt(0);    
        
        System.out.print("Digite o primeiro número: ");
        double numero2 = (int) entrada.nextDouble(); 
        
        double resultado = calcular(numero1, numero2, operacao);
        
        System.out.println(resultado);
		  
		entrada.close();		
		
	}

	 private static double calcular(double num1, double num2, double operacao) {
	        return operacao == '+' ? num1 + num2 :
	               operacao == '-' ? num1 - num2 :
	               operacao == '*' ? num1 * num2 :
	               operacao == '/' ? num1 / num2 :
	               operacao == '%' ? num1 % num2 : 0;
	    }
	}

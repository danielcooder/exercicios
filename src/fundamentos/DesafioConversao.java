package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Digite o valor do primeiro salário: ");
		double salario1 = entrada.nextDouble();
		
		System.out.print("Digite o valor do segundo salário: ");
		double salario2 = entrada.nextDouble();
		
		System.out.print("Digite o valor do terceiro salário: ");
		double salario3 = entrada.nextDouble();
		
		
		double resultado = (salario1 + salario2 + salario3) / 3;
		
		
		System.out.printf("A média dos três ultimos salarios é de R$ %.2f", resultado);	
		
		
		entrada.close();
		
	}
	
}
